 # Car Registration Check
                                   
 This repository contains Java classes, cucumber feature file that test car registration checking.
                                   
* In order to run this test, the following tools must be installed on the machine where the test will be run.
    * Java,Maven,Cucumber-jvm,git,chrome driver, gecko driver for mac or 32 chrome driver and gecko driver for windows.
* Clone the project by downloading the zip file or run git clone `https://github.com/walisco/carRegChecking`.
* Then run `git clean install` ( go to the directory where the project is cloned or downloaded to before running the command).
* To run the test from commandline, 'mvn test' runs all the test, to run on a specific browser 'mvn test -Dbrowser=chrome or firefox'.
* The test can be run from the Cucumber Test Runner class by right clicking and run. To run a specific scenario, the scenario can be tagged with a name of choice and pass this in the tag option of the Test Runner class.
* The test can also be run from the feature file by right clicking on the feature or to run a specific scenario, right click on the scenario.
                                   