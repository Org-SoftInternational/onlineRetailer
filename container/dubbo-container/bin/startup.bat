@echo off & setlocal enabledelayedexpansion

set LIB_JARS=""
cd ..\lib
for %%i in (*) do set LIB_JARS=!LIB_JARS!;..\lib\%%i
cd ..\bin

set CLASSPATH=!LIB_JARS!;../classes

@echo %CLASSPATH%

java -Xms64m -Xmx1024m -XX:MaxPermSize=64M -classpath %CLASSPATH% com.alibaba.dubbo.container.Main

pause