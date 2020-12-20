package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = { "stepsDefinitions" },
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = false, dryRun = false, strict = false)
public class Runner {

}