@echo off
cd /d "%~dp0"
if not exist build.exe (
 echo build.exe is missing. Place it next to this script.
 pause
 exit /b 1
)
build.exe
exit /b %errorlevel%
