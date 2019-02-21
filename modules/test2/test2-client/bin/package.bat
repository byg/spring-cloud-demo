@echo off

echo.
echo [信息] 打包安装工程，生成jar包文件。
echo.

%~d0
cd %~dp0

cd ..
call mvn clean install -Dmaven.test.skip=true -Ppackage

pause