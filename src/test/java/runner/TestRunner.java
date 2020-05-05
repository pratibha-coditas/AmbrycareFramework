package runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = { "src/test/java/features/Login.feature" }, glue = {
		"actions" }, monochrome = true, strict = true, dryRun = false,
				plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })
public class TestRunner 
{
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "src\\main\\java\\utils\\ReportsConfig.xml"));
	}
}


