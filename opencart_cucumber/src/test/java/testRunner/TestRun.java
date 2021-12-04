package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                /*features= {".//Features/"}, //specify the feature you want ot run
                glue="stepDefinitions",//specify the package name of the steps definition location
                //execution always start with runner class no need to execute steps or login features
                //if they are many feature. You can put .//Features/Login.feature
                */
                /*features= {".//Features/LoginDDT.feature"}, //this will exe
                glue="stepDefinitions",
                dryRun=false  if yo make it false then it will execute normally by taking the data
                It is specially used in the stage when you will have to see if there are any compilation errors
                or if any steps is missing.

                feature file can be executed parallely but scenario can not be

                After adding scenario in accoutn registration feature page the step that are not implemented will be
                highlited and if you run the testrun it will provide tose steps and you just need to copy them
                */
                features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"}, //this will exe
                glue="stepDefinitions",
                dryRun=false

        )

public class TestRun {
}
