package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\Automation\\SLC\\FreeCRNBDDFramework\\src\\main\\java\\Features",
        glue = {"D:\\Automation\\SLC\\FreeCRNBDDFramework\\src\\main\\java\\StepDefinitions"},
        format = {"pretty", "html:test-output", "json:json_output/cucumber.json"}
       // , dryRun = true
)

public class testRunner {

}
