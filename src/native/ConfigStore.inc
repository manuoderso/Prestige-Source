using Json = nlohmann::json;
static std::mutex config_mutex;
static std::filesystem::path config_folder() {
    auto folder = directory.parent_path() / L"configs";
    std::filesystem::create_directories(folder);
    return folder;
}
static std::string read_text(const std::filesystem::path& path) {
    std::ifstream in(path, std::ios::binary);
    if (!in)
        throw std::runtime_error("Could not read the file.");
    return std::string(std::istreambuf_iterator<char>(in), {});
}
static void atomic_write(const std::filesystem::path& path, const std::string& content) {
    auto temp = path;
    temp += L".tmp";
    {
        std::ofstream out(temp, std::ios::binary | std::ios::trunc);
        out.write(content.data(), content.size());
        out.flush();
        if (!out)
            throw std::runtime_error("Could not write the config.");
    }
    if (!MoveFileExW(temp.c_str(), path.c_str(), MOVEFILE_REPLACE_EXISTING | MOVEFILE_WRITE_THROUGH))
        throw std::runtime_error("Could not save the config.");
}
struct LocalConfig {
    std::filesystem::path path;
    Json value;
};
static std::vector<LocalConfig> read_configs() {
    std::vector<LocalConfig> result;
    for (const auto& file : std::filesystem::directory_iterator(config_folder())) {
        if (file.path().extension() != L".json" || !file.is_regular_file())
            continue;
        try {
            auto value = Json::parse(read_text(file.path()));
            if (value.is_object() && value.contains("id") && value.contains("data") &&
                value.at("id").is_number_integer() && value.at("name").is_string())
                result.push_back({file.path(), std::move(value)});
            else
                log("Skipped config without local metadata: " + file.path().filename().string());
        } catch (const std::exception&) {
            log("Skipped invalid config file.");
        }
    }
    return result;
}
static std::string timestamp() {
    SYSTEMTIME time;
    GetLocalTime(&time);
    char text[32];
    snprintf(text, sizeof(text), "%04u-%02u-%02uT%02u:%02u:%02u", time.wYear, time.wMonth, time.wDay,
             time.wHour, time.wMinute, time.wSecond);
    return text;
}
static bool local_config_response(std::string* out) {
    try {
        std::lock_guard<std::mutex> guard(config_mutex);
        *reinterpret_cast<int*>(base + 0x708968) = 1;
        Json list = Json::object();
        list["id"] = 1;
        for (const auto& record : read_configs()) {
            const auto& v = record.value;
            list[std::to_string(v.at("id").get<int>())] =
                Json::array({v.at("name"), v.value("description", ""), 1, "Prestige", 0,
                             v.value("updated", ""), "[]", 0});
        }
        *out = list.dump();
        log("Read local configuration list.");
        return true;
    } catch (const std::exception& e) {
        log(e.what());
        *out = "{\"id\":1}";
        return true;
    }
}
static bool config_load(int id, std::string* out) {
    try {
        std::lock_guard<std::mutex> guard(config_mutex);
        for (const auto& record : read_configs())
            if (record.value.at("id") == id) {
                const auto& value = record.value.at("data");
                *out = value.is_string() ? value.get<std::string>() : value.dump();
                log("Loaded local configuration " + std::to_string(id));
                return true;
            }
        *out = "{}";
        log("Requested configuration does not exist.");
        return true;
    } catch (const std::exception& e) {
        log(e.what());
        *out = "{}";
        return true;
    }
}
static bool config_create(std::string name, std::string description, bool, std::string data, std::string* out,
                          std::string extra) {
    try {
        std::lock_guard<std::mutex> guard(config_mutex);
        auto parsed = Json::parse(data);
        if (!parsed.is_object())
            throw std::runtime_error("Config must be a JSON object.");
        int id = 1;
        for (const auto& record : read_configs())
            id = (std::max)(id, record.value.at("id").get<int>() + 1);
        if (name.empty())
            name = "Config " + std::to_string(id);
        std::string filename;
        for (unsigned char c : name) {
            if (c < 32 || c == '<' || c == '>' || c == ':' || c == '"' || c == '/' || c == '\\' || c == '|' ||
                c == '?' || c == '*')
                filename += '_';
            else
                filename += c;
            if (filename.size() >= 100)
                break;
        }
        while (!filename.empty() && (filename.back() == '.' || filename.back() == ' '))
            filename.pop_back();
        Json value = {
            {"id", id},       {"name", name},  {"description", description}, {"updated", timestamp()},
            {"data", parsed}, {"extra", extra}};
        auto path = config_folder() / std::filesystem::u8path(std::to_string(id) + "-" + filename + ".json");
        atomic_write(path, value.dump(2));
        *out = "Config saved locally.";
        log("Created local configuration " + std::to_string(id));
        return true;
    } catch (const std::exception& e) {
        log(e.what());
        *out = std::string("Save failed: ") + e.what();
        return true;
    }
}
static bool config_update(int id, std::string data, std::string* out) {
    try {
        std::lock_guard<std::mutex> guard(config_mutex);
        auto parsed = Json::parse(data);
        if (!parsed.is_object())
            throw std::runtime_error("Config must be a JSON object.");
        for (auto& record : read_configs())
            if (record.value.at("id") == id) {
                record.value["data"] = parsed;
                record.value["updated"] = timestamp();
                atomic_write(record.path, record.value.dump(2));
                *out = "Config updated locally.";
                log("Updated local configuration " + std::to_string(id));
                return true;
            }
        *out = "Config not found.";
        return true;
    } catch (const std::exception& e) {
        log(e.what());
        *out = std::string("Save failed: ") + e.what();
        return true;
    }
}
static bool config_delete(int id, std::string* out) {
    try {
        std::lock_guard<std::mutex> guard(config_mutex);
        for (auto& record : read_configs())
            if (record.value.at("id") == id) {
                auto removed = record.path;
                removed += L".deleted";
                if (!MoveFileExW(record.path.c_str(), removed.c_str(), MOVEFILE_REPLACE_EXISTING))
                    throw std::runtime_error("Could not remove the config.");
                *out = "Config removed locally.";
                log("Removed local configuration " + std::to_string(id));
                return true;
            }
        *out = "Config not found.";
        return true;
    } catch (const std::exception& e) {
        log(e.what());
        *out = e.what();
        return true;
    }
}
static bool config_preferences(std::string data) {
    try {
        std::lock_guard<std::mutex> guard(config_mutex);
        auto parsed = Json::parse(data);
        atomic_write(directory / L"preferences.json", parsed.dump(2));
        log("Saved local menu preferences.");
        return true;
    } catch (const std::exception& e) {
        log(e.what());
        return false;
    }
}
static std::string java_text(JNIEnv* env, jstring value) {
    if (!value)
        return {};
    auto chars = env->GetStringChars(value, nullptr);
    if (!chars)
        return {};
    int length = env->GetStringLength(value);
    int size = WideCharToMultiByte(CP_UTF8, 0, reinterpret_cast<const wchar_t*>(chars), length, nullptr, 0,
                                   nullptr, nullptr);
    std::string text(size, '\0');
    WideCharToMultiByte(CP_UTF8, 0, reinterpret_cast<const wchar_t*>(chars), length, text.data(), size,
                        nullptr, nullptr);
    env->ReleaseStringChars(value, chars);
    return text;
}
static void java_append(JNIEnv* env, jobject builder, const std::string& text) {
    if (!builder)
        return;
    int count = MultiByteToWideChar(CP_UTF8, 0, text.data(), text.size(), nullptr, 0);
    std::wstring wide(count, L'\0');
    MultiByteToWideChar(CP_UTF8, 0, text.data(), text.size(), wide.data(), count);
    auto value = env->NewString(reinterpret_cast<const jchar*>(wide.data()), count);
    auto cls = env->GetObjectClass(builder);
    auto method = env->GetMethodID(cls, "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
    auto result = env->CallObjectMethod(builder, method, value);
    if (result)
        env->DeleteLocalRef(result);
    env->DeleteLocalRef(value);
    env->DeleteLocalRef(cls);
}
static void JNICALL java_config_load(JNIEnv* env, jclass, jint id, jobject result) {
    std::string out;
    config_load(id, &out);
    java_append(env, result, out);
}
static void JNICALL java_config_delete(JNIEnv* env, jclass, jint id, jobject result) {
    std::string out;
    config_delete(id, &out);
    java_append(env, result, out);
}
static void JNICALL java_config_update(JNIEnv* env, jclass, jint id, jstring data, jobject result) {
    std::string out;
    config_update(id, java_text(env, data), &out);
    java_append(env, result, out);
}
static void JNICALL java_config_create(JNIEnv* env, jclass, jstring name, jstring description,
                                       jboolean published, jstring data, jobject result, jstring extra) {
    std::string out;
    config_create(java_text(env, name), java_text(env, description), published, java_text(env, data), &out,
                  java_text(env, extra));
    java_append(env, result, out);
}
static void JNICALL java_config_list(JNIEnv* env, jclass, jobject result) {
    std::string out;
    local_config_response(&out);
    java_append(env, result, out);
}
static void JNICALL java_preferences(JNIEnv* env, jclass, jstring data) {
    config_preferences(java_text(env, data));
}
