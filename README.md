# Oblig3 Software Engineering and Testing
I have set up a CI workflow using Github Actions to build and test the Java project from 'oblig 2' with Maven. 

### Workflow file 
I have configured it so that when pushing and committing to my Github repository, the tests in the main branch will automatically be executed.  
The execution environment is set to the latest version of Ubuntu.  
I've also included specific steps and tasks to be performed once the workflow file is functioning.  
Firstly, the workflow gains access to the repository. 
Additionally, it utilizes actions/setup-java@v3 to set up and configure JDK 17 by Temurin.  
I have added a cache to speed up the execution of the workflow.  
To compile and run the project, along with the tests, it utilizes the pom.xml file with the 'package' command.  
The output is generated into a jar file.  

Screenshoot of the log of the test run in Github Actions:

![Screenshot of test run in Github Actions](https://github.com/LorenaHolmeide/Oblig3_SEandTesting/blob/main/scTest.png)


