# Oblig3 Software Engineering and Testing
I have created a CI workflow in Github Actions to build and test the java project from oblig 2 with Maven. 

### Workflow file 
I have set it up so that when pushing and committing to my repository in Github, and the tests located in the main branch will be run.
The underlying environment on which it will run is the latest version of ubuntu.
Then I have added some steps with tasks to be done when the workflow file is working. 
The first is that it gets access to and checks out the repository.
Furthermore, with actions/setup-java@v3 it sets up and configures JDK 17 by temurin.
I have added a cache to speed up the execution of the workflow.
To compile and run the project with the tests, it uses the pom.xml file with the package command.
The result will come out in a jar file.

Screenshoot of the log of the test run in Github Actions:

![Screenshot of test run in Github Actions](https://github.com/LorenaHolmeide/Oblig3_SEandTesting/blob/main/scTest.png)


