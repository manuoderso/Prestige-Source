#define UNICODE
#define _UNICODE
#include <windows.h>
#include <bcrypt.h>
#include <filesystem>
#include <fstream>
#include <iostream>
#include <string>
#include <vector>
#include <array>
#include <algorithm>

namespace fs = std::filesystem;
static fs::path root;

static std::wstring quote(const std::wstring& value) {
    std::wstring result = L"\"";
    size_t slashes = 0;
    for (wchar_t character : value) {
        if (character == L'\\') {
            ++slashes;
            continue;
        }
        if (character == L'"')
            result.append(slashes * 2 + 1, L'\\');
        else
            result.append(slashes, L'\\');
        result += character;
        slashes = 0;
    }
    result.append(slashes * 2, L'\\');
    return result + L'"';
}

static std::wstring environment(const wchar_t* name) {
    DWORD length = GetEnvironmentVariableW(name, nullptr, 0);
    if (!length)
        return {};
    std::wstring value(length, L'\0');
    GetEnvironmentVariableW(name, value.data(), length);
    value.resize(length - 1);
    return value;
}

static std::wstring psQuote(const std::wstring& value) {
    std::wstring result = L"'";
    for (wchar_t character : value) {
        result += character;
        if (character == L'\'')
            result += character;
    }
    return result + L"'";
}

static std::wstring base64(const std::wstring& value) {
    const wchar_t* alphabet = L"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    auto bytes = reinterpret_cast<const unsigned char*>(value.data());
    size_t length = value.size() * sizeof(wchar_t);
    std::wstring result;
    for (size_t i = 0; i < length; i += 3) {
        unsigned block = unsigned(bytes[i]) << 16;
        if (i + 1 < length)
            block |= unsigned(bytes[i + 1]) << 8;
        if (i + 2 < length)
            block |= bytes[i + 2];
        result += alphabet[(block >> 18) & 63];
        result += alphabet[(block >> 12) & 63];
        result += i + 1 < length ? alphabet[(block >> 6) & 63] : L'=';
        result += i + 2 < length ? alphabet[block & 63] : L'=';
    }
    return result;
}

static int run(const fs::path& program, const std::vector<std::wstring>& arguments,
               const fs::path& capture = {}) {
    std::wstring command = quote(program.wstring());
    for (const auto& argument : arguments)
        command += L" " + quote(argument);
    STARTUPINFOW startup{sizeof(startup)};
    PROCESS_INFORMATION process{};
    HANDLE output = INVALID_HANDLE_VALUE;
    startup.dwFlags = STARTF_USESTDHANDLES;
    startup.hStdOutput = GetStdHandle(STD_OUTPUT_HANDLE);
    startup.hStdError = GetStdHandle(STD_ERROR_HANDLE);
    startup.hStdInput = GetStdHandle(STD_INPUT_HANDLE);
    if (!capture.empty()) {
        SECURITY_ATTRIBUTES attributes{sizeof(attributes), nullptr, TRUE};
        output = CreateFileW(capture.c_str(), GENERIC_WRITE, FILE_SHARE_READ, &attributes, CREATE_ALWAYS,
                             FILE_ATTRIBUTE_NORMAL, nullptr);
        if (output == INVALID_HANDLE_VALUE)
            throw std::runtime_error("Could not create a build log.");
        startup.dwFlags = STARTF_USESTDHANDLES;
        startup.hStdOutput = output;
        startup.hStdError = output;
        startup.hStdInput = GetStdHandle(STD_INPUT_HANDLE);
    }
    BOOL created = CreateProcessW(program.c_str(), command.data(), nullptr, nullptr, TRUE, CREATE_NO_WINDOW,
                                  nullptr, root.c_str(), &startup, &process);
    if (output != INVALID_HANDLE_VALUE)
        CloseHandle(output);
    if (!created)
        throw std::runtime_error("Could not start a build tool.");
    WaitForSingleObject(process.hProcess, INFINITE);
    DWORD result = 1;
    GetExitCodeProcess(process.hProcess, &result);
    CloseHandle(process.hThread);
    CloseHandle(process.hProcess);
    return static_cast<int>(result);
}

static std::wstring firstLine(const fs::path& file) {
    std::ifstream input(file, std::ios::binary);
    std::string line;
    std::getline(input, line);
    if (!line.empty() && line.back() == '\r')
        line.pop_back();
    int length = MultiByteToWideChar(CP_UTF8, 0, line.data(), static_cast<int>(line.size()), nullptr, 0);
    std::wstring result(length, L'\0');
    MultiByteToWideChar(CP_UTF8, 0, line.data(), static_cast<int>(line.size()), result.data(), length);
    return result;
}

static std::string digest(const fs::path& file) {
    std::ifstream input(file, std::ios::binary);
    if (!input)
        return {};
    BCRYPT_ALG_HANDLE algorithm = nullptr;
    BCRYPT_HASH_HANDLE hash = nullptr;
    if (BCryptOpenAlgorithmProvider(&algorithm, BCRYPT_SHA256_ALGORITHM, nullptr, 0) < 0)
        return {};
    if (BCryptCreateHash(algorithm, &hash, nullptr, 0, nullptr, 0, 0) < 0) {
        BCryptCloseAlgorithmProvider(algorithm, 0);
        return {};
    }
    std::array<char, 65536> buffer;
    bool valid = true;
    while (input.read(buffer.data(), buffer.size()) || input.gcount()) {
        if (BCryptHashData(hash, reinterpret_cast<PUCHAR>(buffer.data()), static_cast<ULONG>(input.gcount()),
                           0) < 0) {
            valid = false;
            break;
        }
    }
    std::array<unsigned char, 32> bytes{};
    if (input.bad() || BCryptFinishHash(hash, bytes.data(), static_cast<ULONG>(bytes.size()), 0) < 0)
        valid = false;
    BCryptDestroyHash(hash);
    BCryptCloseAlgorithmProvider(algorithm, 0);
    if (!valid)
        return {};
    std::string result;
    const char* digits = "0123456789abcdef";
    for (unsigned char byte : bytes) {
        result += digits[byte >> 4];
        result += digits[byte & 15];
    }
    return result;
}

struct Asset {
    const wchar_t* path;
    const char* hash;
};
#include "BuildAssets.inc"

static void prepareAssets() {
    bool repair = false;
    for (const auto& asset : assets)
        if (digest(root / asset.path) != asset.hash)
            repair = true;
    if (!repair) {
        std::cout << "Build components are ready.\n";
        return;
    }
    std::cout << "Preparing build components...\n";
    fs::path archive = root / L"build/bootstrap/components.zip";
    HRSRC resource = FindResourceW(nullptr, MAKEINTRESOURCEW(201), RT_RCDATA);
    if (!resource)
        throw std::runtime_error("The embedded build components are missing.");
    DWORD length = SizeofResource(nullptr, resource);
    const char* bytes = static_cast<const char*>(LockResource(LoadResource(nullptr, resource)));
    {
        std::ofstream output(archive, std::ios::binary | std::ios::trunc);
        output.write(bytes, length);
        if (!output)
            throw std::runtime_error("Could not write the build components.");
    }
    auto backup = root / L"build/bootstrap/previous-components" / std::to_wstring(GetTickCount64());
    for (const auto& asset : assets) {
        fs::path file = root / asset.path;
        if (fs::exists(file) && digest(file) != asset.hash) {
            fs::create_directories((backup / asset.path).parent_path());
            fs::copy_file(file, backup / asset.path);
        }
    }
    wchar_t system[32768];
    GetSystemDirectoryW(system, 32768);
    auto powershell = fs::path(system) / L"WindowsPowerShell/v1.0/powershell.exe";
    std::wstring script =
        L"$ErrorActionPreference='Stop'; $ProgressPreference='SilentlyContinue'; Expand-Archive -LiteralPath " +
        psQuote(archive.wstring()) + L" -DestinationPath " + psQuote(root.wstring()) + L" -Force";
    if (run(powershell, {L"-NoProfile", L"-NonInteractive", L"-OutputFormat", L"Text", L"-EncodedCommand",
                         base64(script)}) != 0)
        throw std::runtime_error("Could not unpack the build components.");
    for (const auto& asset : assets)
        if (digest(root / asset.path) != asset.hash)
            throw std::runtime_error("Build component verification failed.");
}

static fs::path findJdk() {
    std::vector<fs::path> candidates;
    auto configured = environment(L"JAVA_HOME");
    if (!configured.empty())
        candidates.emplace_back(configured);
    auto programFiles = fs::path(environment(L"ProgramFiles"));
    for (const auto& name : {L"Eclipse Adoptium", L"Java", L"Microsoft", L"OpenJDK"}) {
        auto folder = programFiles / name;
        if (!fs::exists(folder))
            continue;
        for (const auto& entry : fs::directory_iterator(folder))
            if (entry.is_directory())
                candidates.push_back(entry.path());
    }
    wchar_t found[32768];
    if (SearchPathW(nullptr, L"javac.exe", nullptr, 32768, found, nullptr))
        candidates.push_back(fs::path(found).parent_path().parent_path());
    for (const auto& candidate : candidates) {
        if (!fs::exists(candidate / L"bin/javac.exe") || !fs::exists(candidate / L"bin/jar.exe") ||
            !fs::exists(candidate / L"include/jni.h"))
            continue;
        auto log = root / L"build/bootstrap/java.txt";
        if (run(candidate / L"bin/java.exe", {L"-XshowSettings:properties", L"-version"}, log) != 0)
            continue;
        std::ifstream input(log);
        std::string properties(std::istreambuf_iterator<char>(input), {});
        if (properties.find("java.specification.version = 21") != std::string::npos &&
            properties.find("sun.arch.data.model = 64") != std::string::npos)
            return candidate;
    }
    throw std::runtime_error("Install an x64 JDK 21. The builder could not find one.");
}

static fs::path findVisualStudio() {
    auto vswhere =
        fs::path(environment(L"ProgramFiles(x86)")) / L"Microsoft Visual Studio/Installer/vswhere.exe";
    if (!fs::exists(vswhere))
        throw std::runtime_error("Install Visual Studio 2022 C++ Build Tools with a Windows SDK.");
    auto output = root / L"build/bootstrap/visual-studio.txt";
    if (run(vswhere,
            {L"-latest", L"-products", L"*", L"-version", L"[17.0,18.0)", L"-requires",
             L"Microsoft.VisualStudio.Component.VC.Tools.x86.x64", L"-property", L"installationPath"},
            output) != 0)
        throw std::runtime_error("Could not locate the C++ build tools.");
    auto value = firstLine(output);
    if (value.empty())
        throw std::runtime_error("Install Visual Studio 2022 C++ Build Tools with a Windows SDK.");
    return fs::path(value);
}

static fs::path findCmake(const fs::path& visualStudio) {
    auto bundled = visualStudio / L"Common7/IDE/CommonExtensions/Microsoft/CMake/CMake/bin/cmake.exe";
    if (fs::exists(bundled))
        return bundled;
    wchar_t found[32768];
    if (SearchPathW(nullptr, L"cmake.exe", nullptr, 32768, found, nullptr))
        return found;
    throw std::runtime_error("Install C++ CMake tools through the Visual Studio Installer.");
}

int wmain(int argc, wchar_t** argv) {
    bool quiet = argc > 1 && std::wstring(argv[1]) == L"--quiet";
    int result = 1;
    std::cout << std::unitbuf;
    std::wcout << std::unitbuf;
    try {
        wchar_t location[32768];
        GetModuleFileNameW(nullptr, location, 32768);
        root = fs::path(location).parent_path();
        for (const auto& name : {L"CMakeLists.txt", L"CoreBridge.cpp", L"Launch.cpp"})
            if (!fs::exists(root / name))
                throw std::runtime_error("Place build.exe inside src/native, next to the source files.");
        fs::create_directories(root / L"build/bootstrap");
        std::cout << "Prestige build\n\n";
        auto jdk = findJdk();
        auto visualStudio = findVisualStudio();
        auto cmake = findCmake(visualStudio);
        SetEnvironmentVariableW(L"JAVA_HOME", jdk.c_str());
        prepareAssets();
        auto buildFolder = root / L"build";
        auto cache = buildFolder / L"CMakeCache.txt";
        if (fs::exists(cache)) {
            std::ifstream input(cache);
            std::string content(std::istreambuf_iterator<char>(input), {});
            if (content.find("CMAKE_GENERATOR:INTERNAL=Visual Studio 17 2022") == std::string::npos ||
                content.find("CMAKE_GENERATOR_PLATFORM:INTERNAL=x64") == std::string::npos)
                buildFolder /= L"msvc-x64";
        }
        std::cout << "Configuring...\n";
        std::vector<std::wstring> arguments = {
            L"-S",
            root.generic_wstring(),
            L"-B",
            buildFolder.generic_wstring(),
            L"-G",
            L"Visual Studio 17 2022",
            L"-A",
            L"x64",
            L"-DPRESTIGE_ASSETS_DIR=" + (root / L"assets").generic_wstring(),
            L"-DPRESTIGE_VENDOR_DIR=" + (root / L"vendor/include").generic_wstring(),
            L"-DJava_JAVA_EXECUTABLE=" + (jdk / L"bin/java.exe").generic_wstring(),
            L"-DJava_JAVAC_EXECUTABLE=" + (jdk / L"bin/javac.exe").generic_wstring(),
            L"-DJava_JAR_EXECUTABLE=" + (jdk / L"bin/jar.exe").generic_wstring(),
            L"-DCMAKE_GENERATOR_INSTANCE=" + visualStudio.generic_wstring()};
        if (run(cmake, arguments) != 0)
            throw std::runtime_error("CMake configuration failed. See the error above.");
        std::cout << "Compiling...\n";
        if (run(cmake, {L"--build", buildFolder.generic_wstring(), L"--config", L"Release", L"--parallel",
                        L"2"}) != 0)
            throw std::runtime_error("Compilation failed. See the error above.");
        if (!fs::exists(buildFolder / L"dist/Prestige.exe"))
            throw std::runtime_error("The build finished without producing Prestige.exe.");
        std::wcout << L"\nBuilt: " << (buildFolder / L"dist/Prestige.exe").wstring() << L"\n";
        result = 0;
    } catch (const std::exception& error) {
        std::cerr << "\n" << error.what() << "\n";
    }
    if (!quiet) {
        std::cout << "\nPress Enter to close.";
        std::cin.get();
    }
    return result;
}
