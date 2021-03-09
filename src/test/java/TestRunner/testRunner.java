package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E://Automation_Framework//MyGitProj//Features//DemoWebsite.feature",
        glue = "stepDefinitions"
)
public class testRunner {
}
