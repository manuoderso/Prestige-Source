# Build Prestige

Double-click `build.exe` in this folder. It contains the required client components, checks their hashes, unpacks them when necessary, finds an installed x64 JDK 21 and Visual Studio 2022 C++ tools, and configures the dependency paths automatically. `build.cmd` starts the same builder.

The normal output is `build/dist/Prestige.exe`. If an existing CMake cache uses a different generator or architecture, the builder uses `build/msvc-x64/dist/Prestige.exe` instead. It prints the exact output path when finished.

Visual Studio 2022 C++ Build Tools with a Windows SDK and C++ CMake tools, and an x64 JDK 21, must already be installed. The builder does not install system software. `JAVA_HOME` does not need to be configured manually when the JDK is in a standard installation folder.

No separate ZIP extraction is required. Changed dependency files are backed up under `build/bootstrap/previous-components` before replacement. Client source files and personal configs are not overwritten.

The project rebuilds the bridge and launcher for the recovered Minecraft 1.21.11 client. It embeds the recovered native DLL and client archive, rather than recompiling the original native client from source.

`Build.cpp`, `BuildAssets.inc`, and `Build.rc` contain the builder source and resource definition. To rebuild the builder itself, use the MSVC x64 developer command prompt with `Prestige-Build-Assets.zip` in this folder:

```bat
rc /fo build/Build.res Build.rc
cl /EHsc /utf-8 /std:c++20 /MT /O2 Build.cpp build/Build.res /Fe:build.exe /link bcrypt.lib
```

The CMake project remains available for manual builds and Visual Studio. Configs are managed through Personal Configs inside the client.
