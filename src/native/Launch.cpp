#define UNICODE
#define _UNICODE
#include <windows.h>
#include <tlhelp32.h>
#include <shellapi.h>
#include <dwmapi.h>
#include <filesystem>
#include <string>
#include <vector>
#include <fstream>
#include <thread>
#include <atomic>
static HWND window;
static HWND listbox;
static HWND startButton;
static float uiScale = 1;
static std::vector<DWORD> processes;
static std::atomic<bool> busy = false;
static std::filesystem::path files;
static std::wstring error(const wchar_t* text) {
    return std::wstring(text) + L" (Windows error " + std::to_wstring(GetLastError()) + L")";
}

static std::wstring quote(const std::wstring& text) {
    return L"\"" + text + L"\"";
}

static std::wstring ps_quote(const std::wstring& text) {
    std::wstring out = L"'";
    for (wchar_t c : text) {
        out += c;
        if (c == L'\'')
            out += c;
    }
    return out + L"'";
}

static std::wstring encoded(const std::wstring& text) {
    static const wchar_t alphabet[] = L"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    std::wstring result;
    auto bytes = reinterpret_cast<const unsigned char*>(text.data());
    size_t size = text.size() * sizeof(wchar_t);
    for (size_t i = 0; i < size; i += 3) {
        unsigned value = unsigned(bytes[i]) << 16;
        if (i + 1 < size)
            value |= unsigned(bytes[i + 1]) << 8;
        if (i + 2 < size)
            value |= bytes[i + 2];
        result += alphabet[(value >> 18) & 63];
        result += alphabet[(value >> 12) & 63];
        result += i + 1 < size ? alphabet[(value >> 6) & 63] : L'=';
        result += i + 2 < size ? alphabet[value & 63] : L'=';
    }
    return result;
}

static std::filesystem::path executable() {
    wchar_t path[32768];
    GetModuleFileNameW(nullptr, path, 32768);
    return path;
}

static bool extract() {
    files = executable().parent_path() / L"PrestigeData";
    std::filesystem::create_directories(files);
    const wchar_t* names[] = {L"PrestigeBridge.dll", L"client-core.dll", L"client.bin",
                              L"mappings.tiny",      L"attach.jar",      L"java-runtime.zip"};
    for (int i = 0; i < 6; i++) {
        HRSRC resource = FindResourceW(nullptr, MAKEINTRESOURCEW(101 + i), RT_RCDATA);
        if (!resource)
            return false;
        DWORD size = SizeofResource(nullptr, resource);
        auto data = LockResource(LoadResource(nullptr, resource));
        std::ofstream out(files / names[i], std::ios::binary | std::ios::trunc);
        out.write(static_cast<const char*>(data), size);
        if (!out)
            return false;
    }
    std::filesystem::create_directories(files.parent_path() / L"configs");
    if (!std::filesystem::exists(files / L"java/bin/java.exe")) {
        wchar_t system[32768];
        GetSystemDirectoryW(system, 32768);
        auto powershell = std::filesystem::path(system) / L"WindowsPowerShell/v1.0/powershell.exe";
        std::wstring script = L"$ErrorActionPreference='Stop'; Expand-Archive -LiteralPath " +
                              ps_quote((files / L"java-runtime.zip").wstring()) + L" -DestinationPath " +
                              ps_quote((files / L"java").wstring()) + L" -Force";
        std::wstring command = quote(powershell.wstring()) +
                               L" -NoProfile -NonInteractive -WindowStyle Hidden -EncodedCommand " +
                               encoded(script);
        STARTUPINFOW startup{sizeof(startup)};
        PROCESS_INFORMATION process{};
        if (!CreateProcessW(powershell.c_str(), command.data(), nullptr, nullptr, FALSE, CREATE_NO_WINDOW,
                            nullptr, files.c_str(), &startup, &process))
            return false;
        DWORD wait = WaitForSingleObject(process.hProcess, 60000), code = 1;
        if (wait == WAIT_OBJECT_0)
            GetExitCodeProcess(process.hProcess, &code);
        CloseHandle(process.hThread);
        CloseHandle(process.hProcess);
        if (code != 0)
            return false;
    }
    return true;
}

static std::filesystem::path java() {
    auto bundled = files / L"java/bin/java.exe";
    if (std::filesystem::exists(bundled))
        return bundled;
    wchar_t program[32768];
    GetEnvironmentVariableW(L"ProgramFiles", program, 32768);
    std::filesystem::path adoptium = std::filesystem::path(program) / L"Eclipse Adoptium";
    if (std::filesystem::exists(adoptium))
        for (const auto& p : std::filesystem::directory_iterator(adoptium)) {
            auto candidate = p.path() / L"bin/java.exe";
            if (std::filesystem::exists(candidate))
                return candidate;
        }
    wchar_t found[32768];
    if (SearchPathW(nullptr, L"java.exe", nullptr, 32768, found, nullptr))
        return found;
    return {};
}

static int runJava(const std::wstring& arguments, const wchar_t* logname) {
    auto binary = java();
    if (binary.empty())
        return 9001;
    std::wstring command = quote(binary.wstring()) + L" --add-modules jdk.attach -cp " +
                           quote((files / L"attach.jar").wstring()) + L" " + arguments;
    SECURITY_ATTRIBUTES sa{sizeof(sa), nullptr, TRUE};
    HANDLE output = CreateFileW((files / logname).c_str(), GENERIC_WRITE, FILE_SHARE_READ | FILE_SHARE_WRITE,
                                &sa, CREATE_ALWAYS, FILE_ATTRIBUTE_NORMAL, nullptr);
    if (output == INVALID_HANDLE_VALUE)
        return 9002;
    STARTUPINFOW startup{sizeof(startup)};
    startup.dwFlags = STARTF_USESTDHANDLES;
    startup.hStdOutput = output;
    startup.hStdError = output;
    startup.hStdInput = GetStdHandle(STD_INPUT_HANDLE);
    PROCESS_INFORMATION process{};
    BOOL ok = CreateProcessW(binary.c_str(), command.data(), nullptr, nullptr, TRUE, CREATE_NO_WINDOW,
                             nullptr, files.c_str(), &startup, &process);
    CloseHandle(output);
    if (!ok)
        return 9003;
    DWORD wait = WaitForSingleObject(process.hProcess, 60000), code = 9004;
    if (wait == WAIT_OBJECT_0)
        GetExitCodeProcess(process.hProcess, &code);
    CloseHandle(process.hThread);
    CloseHandle(process.hProcess);
    return static_cast<int>(code);
}

static int startClient(DWORD pid) {
    auto logfile = files / L"prestige.log";
    auto offset = std::filesystem::exists(logfile) ? std::filesystem::file_size(logfile) : 0;
    int result = runJava(L"AttachNative " + std::to_wstring(pid) + L" " +
                             quote((files / L"PrestigeBridge.dll").wstring()) + L" " + quote(files.wstring()),
                         L"attach.log");
    if (result != 0)
        return result;
    HANDLE target = OpenProcess(SYNCHRONIZE, FALSE, pid);
    for (int i = 0; i < 600; i++) {
        std::ifstream log(logfile, std::ios::binary);
        log.seekg(offset);
        std::string text(std::istreambuf_iterator<char>(log), {});
        if (text.find("Client initialization success") != std::string::npos) {
            if (target)
                CloseHandle(target);
            return 0;
        }
        if (text.find("Client initialization failure") != std::string::npos) {
            if (target)
                CloseHandle(target);
            return 9005;
        }
        if (target && WaitForSingleObject(target, 0) == WAIT_OBJECT_0) {
            CloseHandle(target);
            return 9006;
        }
        Sleep(100);
    }
    if (target)
        CloseHandle(target);
    return 9007;
}

static HFONT uiFont;
static HBRUSH backgroundBrush, listBrush;
static void drawControl(DRAWITEMSTRUCT* item) {
    HDC dc = item->hDC;
    RECT rect = item->rcItem;
    bool selected = (item->itemState & ODS_SELECTED) != 0;
    bool disabled = (item->itemState & ODS_DISABLED) != 0;
    COLORREF fill = item->CtlID == 10 ? (selected ? RGB(61, 61, 61) : RGB(28, 28, 28))
                                      : (disabled   ? RGB(36, 36, 36)
                                         : selected ? RGB(72, 72, 72)
                                                    : RGB(49, 49, 49));
    HBRUSH brush = CreateSolidBrush(fill);
    FillRect(dc, &rect, brush);
    DeleteObject(brush);
    SelectObject(dc, uiFont);
    SetBkMode(dc, TRANSPARENT);
    SetTextColor(dc, disabled ? RGB(116, 116, 116) : RGB(230, 230, 230));
    if (item->CtlID == 10) {
        if (item->itemID == static_cast<UINT>(-1) || item->itemID >= processes.size())
            return;
        std::wstring label = L"Minecraft (" + std::to_wstring(processes[item->itemID]) + L")";
        rect.left += static_cast<int>(10 * uiScale);
        DrawTextW(dc, label.c_str(), -1, &rect, DT_LEFT | DT_VCENTER | DT_SINGLELINE | DT_END_ELLIPSIS);
    } else {
        wchar_t label[80];
        GetWindowTextW(item->hwndItem, label, 80);
        DrawTextW(dc, label, -1, &rect, DT_CENTER | DT_VCENTER | DT_SINGLELINE);
        HBRUSH border = CreateSolidBrush(RGB(70, 70, 70));
        FrameRect(dc, &rect, border);
        DeleteObject(border);
    }
    if (item->itemState & ODS_FOCUS) {
        InflateRect(&rect, -3, -3);
        DrawFocusRect(dc, &rect);
    }
}

static void refresh() {
    DWORD selected = 0;
    int oldIndex = static_cast<int>(SendMessageW(listbox, LB_GETCURSEL, 0, 0));
    if (oldIndex >= 0 && oldIndex < static_cast<int>(processes.size()))
        selected = processes[oldIndex];
    processes.clear();
    SendMessageW(listbox, LB_RESETCONTENT, 0, 0);
    HANDLE snapshot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
    PROCESSENTRY32W entry{sizeof(entry)};
    if (snapshot != INVALID_HANDLE_VALUE) {
        if (Process32FirstW(snapshot, &entry))
            do {
                if (_wcsicmp(entry.szExeFile, L"java.exe") != 0 &&
                    _wcsicmp(entry.szExeFile, L"javaw.exe") != 0)
                    continue;
                HANDLE mods = CreateToolhelp32Snapshot(TH32CS_SNAPMODULE, entry.th32ProcessID);
                MODULEENTRY32W module{sizeof(module)};
                bool game = false;
                if (mods != INVALID_HANDLE_VALUE) {
                    if (Module32FirstW(mods, &module))
                        do {
                            if (_wcsicmp(module.szModule, L"lwjgl.dll") == 0)
                                game = true;
                        } while (Module32NextW(mods, &module));
                    CloseHandle(mods);
                }
                if (game) {
                    processes.push_back(entry.th32ProcessID);
                    std::wstring label = L"Minecraft (" + std::to_wstring(entry.th32ProcessID) + L")";
                    SendMessageW(listbox, LB_ADDSTRING, 0, reinterpret_cast<LPARAM>(label.c_str()));
                }
            } while (Process32NextW(snapshot, &entry));
        CloseHandle(snapshot);
    }
    if (!processes.empty()) {
        int index = 0;
        for (size_t i = 0; i < processes.size(); i++)
            if (processes[i] == selected)
                index = static_cast<int>(i);
        SendMessageW(listbox, LB_SETCURSEL, index, 0);
    }
    EnableWindow(startButton, !busy && !processes.empty());
}

static void attach() {
    int index = static_cast<int>(SendMessageW(listbox, LB_GETCURSEL, 0, 0));
    if (index < 0 || index >= static_cast<int>(processes.size()) || busy.exchange(true))
        return;
    DWORD pid = processes[index];
    EnableWindow(startButton, FALSE);
    EnableWindow(listbox, FALSE);
    SetWindowTextW(startButton, L"Launching…");
    std::thread([pid]() {
        int result = 9005;
        try {
            result = startClient(pid);
        } catch (...) {
        }
        PostMessageW(window, WM_APP + 1, result, 0);
    }).detach();
}

static void layout(HWND hwnd) {
    RECT rect;
    GetClientRect(hwnd, &rect);
    int margin = static_cast<int>(16 * uiScale), height = static_cast<int>(36 * uiScale);
    MoveWindow(listbox, margin, margin, rect.right - margin * 2, rect.bottom - margin * 3 - height, TRUE);
    MoveWindow(startButton, margin, rect.bottom - margin - height, rect.right - margin * 2, height, TRUE);
}

static LRESULT CALLBACK handler(HWND hwnd, UINT message, WPARAM w, LPARAM l) {
    switch (message) {
    case WM_CREATE: {
        window = hwnd;
        uiScale = GetDpiForWindow(hwnd) / 96.f;
        backgroundBrush = CreateSolidBrush(RGB(22, 22, 22));
        listBrush = CreateSolidBrush(RGB(28, 28, 28));
        uiFont = CreateFontW(-static_cast<int>(14 * uiScale), 0, 0, 0, FW_NORMAL, FALSE, FALSE, FALSE,
                             DEFAULT_CHARSET, OUT_DEFAULT_PRECIS, CLIP_DEFAULT_PRECIS, CLEARTYPE_QUALITY,
                             DEFAULT_PITCH, L"Segoe UI");
        listbox = CreateWindowExW(WS_EX_CLIENTEDGE, L"LISTBOX", L"Minecraft instances",
                                  WS_VISIBLE | WS_CHILD | WS_TABSTOP | WS_VSCROLL | LBS_NOTIFY |
                                      LBS_NOINTEGRALHEIGHT | LBS_OWNERDRAWFIXED | LBS_HASSTRINGS,
                                  0, 0, 0, 0, hwnd, reinterpret_cast<HMENU>(10), nullptr, nullptr);
        startButton = CreateWindowW(L"BUTTON", L"Launch", WS_VISIBLE | WS_CHILD | WS_TABSTOP | BS_OWNERDRAW,
                                    0, 0, 0, 0, hwnd, reinterpret_cast<HMENU>(1), nullptr, nullptr);
        SendMessageW(listbox, WM_SETFONT, reinterpret_cast<WPARAM>(uiFont), TRUE);
        SendMessageW(startButton, WM_SETFONT, reinterpret_cast<WPARAM>(uiFont), TRUE);
        SendMessageW(listbox, LB_SETITEMHEIGHT, 0, static_cast<LPARAM>(28 * uiScale));
        BOOL dark = TRUE;
        DwmSetWindowAttribute(hwnd, 20, &dark, sizeof(dark));
        COLORREF caption = RGB(22, 22, 22);
        DwmSetWindowAttribute(hwnd, 35, &caption, sizeof(caption));
        layout(hwnd);
        refresh();
        SetTimer(hwnd, 1, 2500, nullptr);
        return 0;
    }
    case WM_ERASEBKGND: {
        RECT rect;
        GetClientRect(hwnd, &rect);
        FillRect(reinterpret_cast<HDC>(w), &rect, backgroundBrush);
        return 1;
    }
    case WM_DRAWITEM:
        drawControl(reinterpret_cast<DRAWITEMSTRUCT*>(l));
        return TRUE;
    case WM_CTLCOLORLISTBOX:
        SetTextColor(reinterpret_cast<HDC>(w), RGB(230, 230, 230));
        SetBkColor(reinterpret_cast<HDC>(w), RGB(28, 28, 28));
        return reinterpret_cast<LRESULT>(listBrush);
    case WM_SIZE:
        layout(hwnd);
        return 0;
    case WM_TIMER:
        if (!busy)
            refresh();
        return 0;
    case WM_COMMAND:
        if (LOWORD(w) == 1)
            attach();
        return 0;
    case WM_APP + 1:
        busy = false;
        EnableWindow(listbox, TRUE);
        SetWindowTextW(startButton, L"Launch");
        refresh();
        if (w != 0)
            MessageBoxW(hwnd,
                        L"Could not launch. Restart Minecraft without the original injector and try again.",
                        L"Prestige", MB_OK | MB_ICONWARNING);
        return 0;
    case WM_DPICHANGED: {
        uiScale = HIWORD(w) / 96.f;
        auto rect = reinterpret_cast<RECT*>(l);
        SetWindowPos(hwnd, nullptr, rect->left, rect->top, rect->right - rect->left, rect->bottom - rect->top,
                     SWP_NOZORDER | SWP_NOACTIVATE);
        DeleteObject(uiFont);
        uiFont = CreateFontW(-static_cast<int>(14 * uiScale), 0, 0, 0, FW_NORMAL, FALSE, FALSE, FALSE,
                             DEFAULT_CHARSET, OUT_DEFAULT_PRECIS, CLIP_DEFAULT_PRECIS, CLEARTYPE_QUALITY,
                             DEFAULT_PITCH, L"Segoe UI");
        SendMessageW(listbox, WM_SETFONT, reinterpret_cast<WPARAM>(uiFont), TRUE);
        SendMessageW(startButton, WM_SETFONT, reinterpret_cast<WPARAM>(uiFont), TRUE);
        SendMessageW(listbox, LB_SETITEMHEIGHT, 0, static_cast<LPARAM>(28 * uiScale));
        layout(hwnd);
        return 0;
    }
    case WM_CLOSE:
        if (busy)
            return 0;
        DestroyWindow(hwnd);
        return 0;
    case WM_DESTROY:
        KillTimer(hwnd, 1);
        DeleteObject(uiFont);
        DeleteObject(backgroundBrush);
        DeleteObject(listBrush);
        PostQuitMessage(0);
        return 0;
    }
    return DefWindowProcW(hwnd, message, w, l);
}

int WINAPI wWinMain(HINSTANCE instance, HINSTANCE, PWSTR command, int show) {
    try {
        if (!extract()) {
            MessageBoxW(nullptr, L"Could not prepare the client files.", L"Prestige", MB_OK | MB_ICONERROR);
            return 1;
        }
        if (wcsstr(command, L"--self-test"))
            return runJava(L"ClientSmoke " + quote(files.wstring()), L"self-test.log");
        if (wcsstr(command, L"--attach ")) {
            DWORD pid = wcstoul(wcsstr(command, L"--attach ") + 9, nullptr, 10);
            if (!pid)
                return 2;
            return startClient(pid);
        }
        SetProcessDpiAwarenessContext(DPI_AWARENESS_CONTEXT_PER_MONITOR_AWARE_V2);
        UINT dpi = GetDpiForSystem();
        RECT rect{0, 0, MulDiv(360, dpi, 96), MulDiv(280, dpi, 96)};
        DWORD style = WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_MINIMIZEBOX;
        AdjustWindowRectExForDpi(&rect, style, FALSE, 0, dpi);
        WNDCLASSW cls{};
        cls.lpfnWndProc = handler;
        cls.hInstance = instance;
        cls.lpszClassName = L"PrestigeLauncher";
        cls.hCursor = LoadCursorW(nullptr, IDC_ARROW);
        cls.hbrBackground = nullptr;
        RegisterClassW(&cls);
        window = CreateWindowW(cls.lpszClassName, L"Prestige", style, CW_USEDEFAULT, CW_USEDEFAULT,
                               rect.right - rect.left, rect.bottom - rect.top, nullptr, nullptr, instance,
                               nullptr);
        if (!window)
            return 1;
        ShowWindow(window, show);
        MSG msg;
        while (GetMessageW(&msg, nullptr, 0, 0) > 0) {
            if (!IsDialogMessageW(window, &msg)) {
                TranslateMessage(&msg);
                DispatchMessageW(&msg);
            }
        }
        return 0;
    } catch (...) {
        MessageBoxW(nullptr, L"Could not prepare the client files.", L"Prestige", MB_OK | MB_ICONERROR);
        return 1;
    }
}
