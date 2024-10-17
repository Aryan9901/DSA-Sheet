@echo off
setlocal

REM Check if both topic and problem name are provided
if "%~1"=="" (
    echo Usage: %0 ^<topic^> ^<problem-name^>
    exit /b 1
)

set TOPIC=%~1
set BASE_DIR=Topics\%TOPIC%

REM Create folder structure
mkdir "%BASE_DIR%\Practice"

REM Create initial files
type nul > "%BASE_DIR%\Practice\Practice.java"

echo Topic "%TOPIC%" folder structure created.
