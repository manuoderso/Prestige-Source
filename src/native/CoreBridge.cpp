#include <windows.h>
#include <jni.h>
#include <jvmti.h>
#include <string>
#include <vector>
#include <map>
#include <unordered_map>
#include <any>
#include <variant>
#include <list>
#include <filesystem>
#include <fstream>
#include <mutex>
#include <atomic>
#include <cstdint>
#include "json.hpp"
struct ModuleRecord {
    uint64_t id;
    std::string cls;
    std::string name;
    std::string description;
    uint64_t category;
};

struct SettingClass {
    uint64_t id;
    std::string name;
};

struct FieldRecord {
    std::string type;
    jobject field;
    std::string name;
};

struct Binding {
    std::string type;
    std::string key;
};

struct Seed {
    uint64_t value;
    std::string key;
};

using SeedMap = std::unordered_map<std::string, Seed>;
using FieldMap = std::map<int, FieldRecord>;
using Argument = std::variant<std::string, std::any>;
struct SettingConfig {
    std::string key;
    std::vector<Argument> arguments;
    std::string description;
};

static_assert(sizeof(SettingConfig) == 88 && sizeof(Argument) == 72 && sizeof(ModuleRecord) == 112 &&
              sizeof(SeedMap) == 64);
static std::atomic<int> startup_result{0};
static void* original_start = nullptr;
static jobject parent_loader = nullptr;
static void* original_prelaunch = nullptr;
static uintptr_t base = 0;
static std::filesystem::path directory;
static std::mutex log_mutex;
static std::vector<ModuleRecord> modules;
static std::vector<SettingClass> settings;
static std::vector<SettingConfig> configs;
static std::unordered_map<std::string, std::string> gui_744d10;
static std::unordered_map<std::string, std::string> gui_744d50;
static std::unordered_map<std::string, Binding> bindings;
static SeedMap seeds;
static std::list<std::string> strings;
static std::any label_argument(std::string text) {
    strings.push_back(std::move(text));
    return std::any(static_cast<const char*>(strings.back().c_str()));
}

#include "ClientRegistry.inc"
static void log(const std::string& message) {
    std::lock_guard<std::mutex> guard(log_mutex);
    std::ofstream(directory / L"prestige.log", std::ios::app) << message << '\n';
}

static bool auth(std::string*) {
    log("Local initialization; no authentication request.");
    *reinterpret_cast<std::string*>(base + 0x745620) = "Prestige";
    *reinterpret_cast<std::vector<SettingConfig>*>(base + 0x744f80) = configs;
    return true;
}

static std::string* initial_metadata(std::string* out) {
    new (out) std::string("[\"0000000000000000000000000000000000000000000000000000000000000000\","
                          "\"0000000000000000000000000000000000000000000000000000000000000000\",\"\","
                          "\"0000000000000000000000000000000000000000000000000000000000000000\","
                          "\"0000000000000000000000000000000000000000000000000000000000000000\","
                          "\"0000000000000000000000000000000000000000000000000000000000000000\"]");
    return out;
}

static void* file(size_t* count, const wchar_t* name) {
    std::ifstream in(directory / name, std::ios::binary | std::ios::ate);
    if (!in) {
        *count = 0;
        return nullptr;
    }
    auto size = in.tellg();
    if (size <= 0 || size > 64 * 1024 * 1024) {
        *count = 0;
        return nullptr;
    }
    using Allocate = void*(__fastcall*)(size_t);
    void* result = reinterpret_cast<Allocate>(base + 0x2187fc)(static_cast<size_t>(size));
    in.seekg(0);
    in.read(static_cast<char*>(result), size);
    *count = static_cast<size_t>(size);
    return result;
}

static void* classes(size_t* count) {
    log("Read client archive from disk.");
    return file(count, L"client.bin");
}

static void* mappings(size_t* count) {
    log("Read Minecraft mappings from disk.");
    return file(count, L"mappings.tiny");
}

static SeedMap* class_keys(SeedMap* out) {
    log("Read 880 archive metadata records locally.");
    new (out) SeedMap(seeds);
    return out;
}

static bool module_list(std::vector<ModuleRecord>* out) {
    *out = modules;
    log("Read 121 local module records.");
    return true;
}

static bool setting_classes(std::vector<SettingClass>* out) {
    *out = settings;
    log("Read 9 local setting classes.");
    return true;
}

static bool field_list(FieldMap* input, FieldMap* out, std::vector<SettingConfig>* values) {
    out->clear();
    for (const auto& item : *input) {
        auto match = bindings.find(item.second.name);
        if (match != bindings.end())
            out->emplace(item.first, FieldRecord{item.second.type, item.second.field, match->second.key});
    }
    log("Resolved " + std::to_string(out->size()) + " setting fields locally.");
    input->~FieldMap();
    values->~vector();
    return out->size() == bindings.size();
}

static bool local_onboarded(bool* out) {
    if (out)
        *out = true;
    log("Local onboarding initialized.");
    return true;
}

static bool local_theme(int* out) {
    if (out)
        *out = 0;
    log("Local menu theme initialized.");
    return true;
}

#include "ConfigStore.inc"
static void debug_message(const char* message, ...) {
    log(std::string("Native: ") + message);
}

static void assertion_diagnostic(const wchar_t*, const wchar_t*, unsigned line) {
    log("Assertion line=" + std::to_string(line));
    void* frames[40];
    USHORT count = CaptureStackBackTrace(0, 40, frames, nullptr);
    for (int i = 0; i < count; i++) {
        auto address = reinterpret_cast<uintptr_t>(frames[i]);
        if (address >= base && address < base + 0x1000000)
            log("Assertion RVA=" + std::to_string(address - base));
    }
    ULONG_PTR low, high;
    GetCurrentThreadStackLimits(&low, &high);
    auto start = reinterpret_cast<uintptr_t>(&frames[0]);
    auto end = (std::min)(high, start + 65536);
    for (auto p = start; p + 8 < end; p += 8) {
        auto address = *reinterpret_cast<uintptr_t*>(p);
        if (address >= base + 0x150000 && address < base + 0x17c000)
            log("Stack API RVA=" + std::to_string(address - base));
    }
    ExitProcess(99);
}

static bool local_account(std::string* out) {
    *reinterpret_cast<int*>(base + 0x708968) = 1;
    if (out)
        *out = "Prestige";
    log("Local account display initialized.");
    return true;
}

static bool local_gui_mappings() {
    *reinterpret_cast<std::unordered_map<std::string, std::string>*>(base + 0x744d10) = gui_744d10;
    *reinterpret_cast<std::unordered_map<std::string, std::string>*>(base + 0x744d50) = gui_744d50;
    log("Loaded local menu method mappings.");
    return true;
}

static void disabled_java_rpc() {
    log("Online-only client action disabled.");
}

static bool disabled_server_rpc() {
    log("Online-only native action disabled.");
    return false;
}

static int network_blocked(void*) {
    log("Blocked a disabled server function.");
    return 7;
}

static bool disabled_start() {
    log("Self-test: original startup thread disabled.");
    return false;
}

static void patch(size_t rva, void* target) {
    unsigned char bytes[14] = {0xff, 0x25, 0, 0, 0, 0};
    memcpy(bytes + 6, &target, 8);
    DWORD old = 0;
    void* p = reinterpret_cast<void*>(base + rva);
    if (!VirtualProtect(p, 14, PAGE_EXECUTE_READWRITE, &old))
        throw std::runtime_error("Cannot patch local callback.");
    memcpy(p, bytes, 14);
    FlushInstructionCache(GetCurrentProcess(), p, 14);
    VirtualProtect(p, 14, old, &old);
}

static bool install_loader(JNIEnv* env) {
    log("Installing local classloader on thread " + std::to_string(GetCurrentThreadId()));
    if (env->ExceptionCheck()) {
        log("Cleared a pending embedded-library exception before loader installation.");
        env->ExceptionClear();
    }
    jclass thread = env->FindClass("java/lang/Thread");
    jmethodID current = env->GetStaticMethodID(thread, "currentThread", "()Ljava/lang/Thread;");
    jobject self = env->CallStaticObjectMethod(thread, current);
    jmethodID set = env->GetMethodID(thread, "setContextClassLoader", "(Ljava/lang/ClassLoader;)V");
    env->CallVoidMethod(self, set, parent_loader);
    if (env->ExceptionCheck()) {
        env->ExceptionClear();
        log("Cannot set Minecraft classloader context.");
        return false;
    }
    using Original = bool(__fastcall*)(JNIEnv*);
    return reinterpret_cast<Original>(original_prelaunch)(env);
}

static void* trampoline(size_t rva, size_t size) {
    auto memory = static_cast<unsigned char*>(
        VirtualAlloc(nullptr, size + 14, MEM_COMMIT | MEM_RESERVE, PAGE_EXECUTE_READWRITE));
    if (!memory)
        throw std::runtime_error("Cannot allocate local trampoline.");
    memcpy(memory, reinterpret_cast<void*>(base + rva), size);
    unsigned char jump[14] = {0xff, 0x25, 0, 0, 0, 0};
    uintptr_t target = base + rva + size;
    memcpy(jump + 6, &target, 8);
    memcpy(memory + size, jump, 14);
    return memory;
}

static bool start_client() {
    int expected = 0;
    if (!startup_result.compare_exchange_strong(expected, 2)) {
        log("Skipped duplicate native startup.");
        return false;
    }
    log("Native client startup begins on thread " + std::to_string(GetCurrentThreadId()));
    using Start = bool(__fastcall*)();
    bool result = reinterpret_cast<Start>(original_start)();
    startup_result = result ? 1 : -1;
    log(std::string("Client initialization ") + (result ? "success" : "failure"));
    return result;
}

extern "C" __declspec(dllexport) jint JNICALL Agent_OnAttach(JavaVM* vm, char* option, void*) {
    try {
        std::string argument = option ? option : "";
        bool selftest = false;
        if (argument.ends_with("|selftest")) {
            selftest = true;
            argument.resize(argument.size() - 9);
        }
        directory = std::filesystem::u8path(argument);
        log("Prestige bridge initializing.");
        if (!selftest) {
            JNIEnv* env = nullptr;
            jvmtiEnv* ti = nullptr;
            vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_8);
            vm->GetEnv(reinterpret_cast<void**>(&ti), JVMTI_VERSION_1_2);
            if (!env || !ti)
                return JNI_ERR;
            jclass cl = env->FindClass("java/lang/Class");
            jmethodID getloader = env->GetMethodID(cl, "getClassLoader", "()Ljava/lang/ClassLoader;");
            jint count = 0;
            jclass* loaded = nullptr;
            ti->GetLoadedClasses(&count, &loaded);
            bool existing = false;
            for (int i = 0; i < count; i++) {
                char* signature = nullptr;
                ti->GetClassSignature(loaded[i], &signature, nullptr);
                if (signature) {
                    if (strcmp(signature, "Ldev/zprestige/prestige/client/Prestige;") == 0)
                        existing = true;
                    if (strcmp(signature, "Lnet/minecraft/class_310;") == 0)
                        parent_loader = env->NewGlobalRef(env->CallObjectMethod(loaded[i], getloader));
                    ti->Deallocate(reinterpret_cast<unsigned char*>(signature));
                }
                env->DeleteLocalRef(loaded[i]);
            }
            ti->Deallocate(reinterpret_cast<unsigned char*>(loaded));
            if (existing) {
                log("Prestige is already loaded. Restart Minecraft without the original injector.");
                return JNI_ERR;
            }
            if (!parent_loader) {
                log("Minecraft classloader is not ready.");
                return JNI_ERR;
            }
        }
        populate();
        HMODULE dll = LoadLibraryW((directory / L"client-core.dll").c_str());
        if (!dll) {
            log("LoadLibrary failed: " + std::to_string(GetLastError()));
            return JNI_ERR;
        }
        base = reinterpret_cast<uintptr_t>(dll);
        patch(0xdeee0, reinterpret_cast<void*>(&debug_message));
        patch(0x1b01e0, reinterpret_cast<void*>(&network_blocked));
        patch(0x15b450, reinterpret_cast<void*>(&auth));
        patch(0xd4e40, reinterpret_cast<void*>(&initial_metadata));
        patch(0x159a90, reinterpret_cast<void*>(&classes));
        patch(0x15a490, reinterpret_cast<void*>(&mappings));
        patch(0x179060, reinterpret_cast<void*>(&class_keys));
        patch(0x17a2c0, reinterpret_cast<void*>(&local_theme));
        patch(0x155c50, reinterpret_cast<void*>(&local_config_response));
        patch(0x17aee0, reinterpret_cast<void*>(&local_onboarded));
        patch(0x151ea0, reinterpret_cast<void*>(&local_account));
        patch(0x15bfa0, reinterpret_cast<void*>(&local_gui_mappings));
        patch(0x155260, reinterpret_cast<void*>(&config_load));
        patch(0x157a30, reinterpret_cast<void*>(&config_delete));
        patch(0x158540, reinterpret_cast<void*>(&config_update));
        patch(0x156950, reinterpret_cast<void*>(&config_create));
        patch(0x15ad20, reinterpret_cast<void*>(&config_preferences));
        patch(0x16e070, reinterpret_cast<void*>(&java_config_load));
        patch(0x16e460, reinterpret_cast<void*>(&java_config_delete));
        patch(0x16e530, reinterpret_cast<void*>(&java_config_update));
        patch(0x16e140, reinterpret_cast<void*>(&java_config_create));
        patch(0x172000, reinterpret_cast<void*>(&java_preferences));
        patch(0x75200, reinterpret_cast<void*>(&java_config_list));
        patch(0x15d810, reinterpret_cast<void*>(&module_list));
        patch(0x15e8c0, reinterpret_cast<void*>(&setting_classes));
        patch(0x15f540, reinterpret_cast<void*>(&field_list));
        original_prelaunch = trampoline(0x172380, 15);
        patch(0x172380, reinterpret_cast<void*>(&install_loader));
        if (selftest)
            patch(0xd6640, reinterpret_cast<void*>(&disabled_start));
        else {
            original_start = trampoline(0xd6640, 15);
            patch(0xd6640, reinterpret_cast<void*>(&start_client));
        }
        using Entry = BOOL(WINAPI*)(HINSTANCE, DWORD, LPVOID);
        BOOL result = reinterpret_cast<Entry>(base + 0x218c90)(dll, DLL_PROCESS_ATTACH, nullptr);
        log(std::string("Native initialization returned ") + (result ? "success" : "failure"));
        log("Global string capacity=" + std::to_string(*reinterpret_cast<uint64_t*>(base + 0x745638)) +
            " JVM context=" + std::to_string(*reinterpret_cast<uintptr_t*>(base + 0x745910)));
        if (!result)
            return JNI_ERR;
        if (selftest) {
            *reinterpret_cast<int*>(base + 0x708968) = 1;
            std::string fixture =
                R"({"id":1,"900001":["Personal list test","",1,"Prestige",0,"2026-10-08T12:00:00","[]",0]})";
            reinterpret_cast<void(__fastcall*)(const std::string*)>(base + 0xf2760)(&fixture);
            auto personal = reinterpret_cast<uintptr_t*>(base + 0x7452b0);
            auto shared = reinterpret_cast<uintptr_t*>(base + 0x745260);
            if (personal[1] - personal[0] != 168 || *reinterpret_cast<int*>(personal[0]) != 900001 ||
                !*reinterpret_cast<bool*>(personal[0] + 0xa0) || shared[1] != shared[0])
                throw std::runtime_error("Personal config menu classification failed.");
            log("Personal config menu classification passed.");
        }
        if (!selftest)
            log("Local payload installed; Minecraft initialization continues asynchronously.");
        return JNI_OK;
    } catch (const std::exception& e) {
        log(std::string("ERROR: ") + e.what());
        return JNI_ERR;
    }
}
