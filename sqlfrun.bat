@ECHO OFF
echo building SQLf protege plugin ................................
call mvn verify -DskipTests
echo Copying file ................................................
xcopy /y  "C:\Users\MATHMAMA\Desktop\Doctorat\Mes Projets\SQLf protege plugin\target\SQLf-1.0.0.jar"  "C:\Users\MATHMAMA\Desktop\Protege-5.2.0 - Copy\plugins"
echo Start Protege program ........................................
start "" "C:\Users\MATHMAMA\Desktop\Protege-5.2.0 - Copy\Protege.exe"