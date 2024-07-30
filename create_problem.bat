@echo off
setlocal

REM Check if both topic and problem name are provided
if "%~1"=="" (
    echo Usage: %0 ^<topic^> ^<problem-name^>
    exit /b 1
)
if "%~2"=="" (
    echo Usage: %0 ^<topic^> ^<problem-name^>
    exit /b 1
)

set TOPIC=%~1
set PROBLEM_NAME=%~2
set BASE_DIR=Problems\%TOPIC%\%PROBLEM_NAME%

REM Create folder structure
mkdir "%BASE_DIR%\Solution"
mkdir "%BASE_DIR%\InputOutput"
mkdir "%BASE_DIR%\TestCases"

REM Create initial files
type nul > "%BASE_DIR%\problem_statement.md"
type nul > "%BASE_DIR%\readme.md"
type nul > "%BASE_DIR%\Solution\NaiveSolution.java"
type nul > "%BASE_DIR%\Solution\OptimalSolution.java"
type nul > "%BASE_DIR%\InputOutput\input.txt"
type nul > "%BASE_DIR%\InputOutput\output.txt"
type nul > "%BASE_DIR%\TestCases\test_case1.txt"
type nul > "%BASE_DIR%\TestCases\test_case2.txt"
type nul > "%BASE_DIR%\TestCases\test_case3.txt"

echo Topic "%TOPIC%" and Problem "%PROBLEM_NAME%" folder structure created.
