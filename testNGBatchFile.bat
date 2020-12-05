set projectLocation=/Users/ryankenny/Documents/AutomationFrameworks/DockerProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause