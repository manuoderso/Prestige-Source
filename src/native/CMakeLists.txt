cmake_minimum_required(VERSION 3.24)
project(Prestige LANGUAGES CXX RC)

if(NOT WIN32 OR NOT MSVC OR NOT CMAKE_SIZEOF_VOID_P EQUAL 8)
    message(FATAL_ERROR "Prestige requires Windows x64 and the MSVC compiler.")
endif()

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

find_package(Java 21 REQUIRED COMPONENTS Development)
get_filename_component(JAVAC_REAL_PATH "${Java_JAVAC_EXECUTABLE}" REALPATH)
get_filename_component(JAVA_BIN_DIR "${JAVAC_REAL_PATH}" DIRECTORY)
get_filename_component(JDK_HOME "${JAVA_BIN_DIR}" DIRECTORY)
if(NOT EXISTS "${JDK_HOME}/include/jni.h")
    message(FATAL_ERROR "Set JAVA_HOME to an x64 JDK 21 installation.")
endif()

set(DEPENDENCY_ROOT "${CMAKE_CURRENT_SOURCE_DIR}")
if(NOT EXISTS "${DEPENDENCY_ROOT}/assets/client-core.dll"
   AND EXISTS "${CMAKE_CURRENT_SOURCE_DIR}/../../assets/client-core.dll")
    set(DEPENDENCY_ROOT "${CMAKE_CURRENT_SOURCE_DIR}/../..")
endif()
set(PRESTIGE_ASSETS_DIR "${DEPENDENCY_ROOT}/assets" CACHE PATH "Client component directory")
set(PRESTIGE_VENDOR_DIR "${DEPENDENCY_ROOT}/vendor/include" CACHE PATH "Dependency header directory")

foreach(COMPONENT client-core.dll client.bin mappings.tiny java-runtime.zip)
    if(NOT EXISTS "${PRESTIGE_ASSETS_DIR}/${COMPONENT}")
        message(FATAL_ERROR
            "Missing ${COMPONENT}. Extract Prestige-Build-Assets.zip into src/native, or set PRESTIGE_ASSETS_DIR.")
    endif()
endforeach()
if(NOT EXISTS "${PRESTIGE_VENDOR_DIR}/json.hpp")
    message(FATAL_ERROR "Missing json.hpp. Extract Prestige-Build-Assets.zip or set PRESTIGE_VENDOR_DIR.")
endif()

set(STAGE_DIR "${CMAKE_CURRENT_BINARY_DIR}/stage")
set(JAVA_CLASSES_DIR "${CMAKE_CURRENT_BINARY_DIR}/java")
set(ATTACH_JAR "${STAGE_DIR}/attach.jar")
file(MAKE_DIRECTORY "${STAGE_DIR}")

add_custom_command(
    OUTPUT "${ATTACH_JAR}"
    COMMAND "${CMAKE_COMMAND}" -E make_directory "${JAVA_CLASSES_DIR}"
    COMMAND "${Java_JAVAC_EXECUTABLE}" --release 21 -encoding UTF-8
            -d "${JAVA_CLASSES_DIR}"
            "${CMAKE_CURRENT_SOURCE_DIR}/AttachNative.java"
            "${CMAKE_CURRENT_SOURCE_DIR}/ClientSmoke.java"
    COMMAND "${Java_JAR_EXECUTABLE}" --create --file "${ATTACH_JAR}"
            -C "${JAVA_CLASSES_DIR}" .
    DEPENDS AttachNative.java ClientSmoke.java
    VERBATIM
)
add_custom_target(JavaHelpers DEPENDS "${ATTACH_JAR}")

add_library(PrestigeBridge SHARED CoreBridge.cpp ConfigStore.inc ClientRegistry.inc)
set_target_properties(PrestigeBridge PROPERTIES
    MSVC_RUNTIME_LIBRARY "MultiThreadedDLL"
    RUNTIME_OUTPUT_DIRECTORY "$<1:${STAGE_DIR}>"
)
target_include_directories(PrestigeBridge PRIVATE
    "${JDK_HOME}/include" "${JDK_HOME}/include/win32" "${PRESTIGE_VENDOR_DIR}")
target_compile_options(PrestigeBridge PRIVATE /EHsc /utf-8 /bigobj)

set(RESOURCE_FILE "${CMAKE_CURRENT_BINARY_DIR}/Prestige.rc")
set(BRIDGE_DLL "${STAGE_DIR}/PrestigeBridge.dll")
file(WRITE "${RESOURCE_FILE}"
    "101 RCDATA \"${BRIDGE_DLL}\"\n"
    "102 RCDATA \"${PRESTIGE_ASSETS_DIR}/client-core.dll\"\n"
    "103 RCDATA \"${PRESTIGE_ASSETS_DIR}/client.bin\"\n"
    "104 RCDATA \"${PRESTIGE_ASSETS_DIR}/mappings.tiny\"\n"
    "105 RCDATA \"${ATTACH_JAR}\"\n"
    "106 RCDATA \"${PRESTIGE_ASSETS_DIR}/java-runtime.zip\"\n"
)
set_source_files_properties("${RESOURCE_FILE}" PROPERTIES OBJECT_DEPENDS
    "${BRIDGE_DLL};${ATTACH_JAR};${PRESTIGE_ASSETS_DIR}/client-core.dll;${PRESTIGE_ASSETS_DIR}/client.bin;${PRESTIGE_ASSETS_DIR}/mappings.tiny;${PRESTIGE_ASSETS_DIR}/java-runtime.zip")

add_executable(Prestige WIN32 Launch.cpp "${RESOURCE_FILE}")
set_target_properties(Prestige PROPERTIES
    MSVC_RUNTIME_LIBRARY "MultiThreaded"
    RUNTIME_OUTPUT_DIRECTORY "$<1:${CMAKE_CURRENT_BINARY_DIR}/dist>"
)
target_compile_options(Prestige PRIVATE /EHsc /utf-8)
target_link_libraries(Prestige PRIVATE user32 shell32 gdi32 dwmapi)
add_dependencies(Prestige PrestigeBridge JavaHelpers)

install(TARGETS Prestige RUNTIME DESTINATION .)
