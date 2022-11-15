taskkill -f -t -im javaw.exe>nul 2>nul
start javaw -jar ..\citest-1.0-SNAPSHOT.jar
exit