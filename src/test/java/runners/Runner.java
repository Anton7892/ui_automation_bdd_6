package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@abc",
        dryRun = false,
        monochrome = false,
        plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"}
)
public class Runner {
}