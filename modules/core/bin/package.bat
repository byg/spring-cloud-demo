@echo off

echo.
echo [��Ϣ] �����װ���̣�����jar���ļ���
echo.

%~d0
cd %~dp0

cd ..
call mvn clean install -Dmaven.test.skip=true -Ppackage

pause