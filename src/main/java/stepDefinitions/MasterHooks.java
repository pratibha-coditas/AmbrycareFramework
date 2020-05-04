package stepDefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory
{
	WebDriver driver;
	@Before
	public void setup() {
		driver = getDriver();
	}
	@After
	public void tearDown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
		driver = null;
		
	}
	

}
