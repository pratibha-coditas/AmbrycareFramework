package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features/Login.feature" }, glue = {
		"stepDefinitions" }, monochrome = true, strict = true, dryRun = false,
				plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class TestRunner {

}
