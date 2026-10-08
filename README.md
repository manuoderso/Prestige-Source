# Prestige-Source

Version -> 1.21.11

This folder contains the recovered Prestige Java sources and the source code written for the not legal version. Analysis tools, logs, DLLs, JARs, and compiled executables are not included.


## Sources

- `src/client/`: 544 decompiled Prestige classes. Native dynamic constants were replaced with local values where they could be recovered. Obfuscated class names remain; the decompiler adjusted some filenames for Windows when names differed only in letter case.
- `src/offline/`: the C++ launcher, offline bridge, local config storage, recovered metadata, and Java launch helper.

## What was done

the loaded Prestige classes could be captured from a running Minecraft instance and decompiled. The downloaded client archive, class mappings, modules, and settings were also recovered.

Many values in the Java classes were originally resolved by the native DLL. The corresponding constant tables were examined so that the recovered sources could contain those values locally.

For the not legal version, the native client's server functions were replaced with local responses and files. This includes Prestige authentication, required downloads, and config operations. The launcher packages and loads the required components.

Checks covered client startup, 121 modules, 686 setting fields, opening the menu, and local config operations, including restoring a changed setting. Not every gameplay feature was tested individually in a world.

## Recovery limitations

The original native C++ sources could not be recovered from the DLL. The C++ files here contain the newly written code. The Java files are decompiled sources -> some methods were not fully reconstructed by the decompiler.

This source only folder is therefore not a standalone runnable or fully buildable project. The not legal version also requires the recovered native components, client archive, Minecraft mappings, Java helpers, and supporting libraries. Those components were omitted from this folder as requested.
