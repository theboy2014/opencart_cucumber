package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features= {".//Features/"}, //specify the feature you want ot run
                glue="stepDefinitions", //specify the package name of the steps definition location
                //execution always start with runner class no need to execute steps or login features
                //if they are many feature. You can put .//Features/Login.feature
                monochrome=true // with this one added you will not get unncessary character in output 

        )

public class TestRun {
}
