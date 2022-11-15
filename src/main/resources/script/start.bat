d:
cd D:\app_server
del *
copy %WORKSPACE%\target\citest-1.0-SNAPSHOT.zip D:\app_server\citest-1.0-SNAPSHOT.zip
7z.exe citest-1.0-SNAPSHOT.zip
taskkill -f -t -im javaw.exe>nul 2>nul
start javaw -jar citest-1.0-SNAPSHOT.jar
exit