package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.LoginPage;




public class DriverFactory 
{
	
	
		ReadConfigFile config;
		public static WebDriver driver;
		public static LoginPage login;
		public static HomePage home;
		public WebDriver getDriver()
		{
			try
			{
				config= new ReadConfigFile();
				String browserName=config.getBrowser();
				if(browserName.equals("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				else if (browserName.equals("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
				    driver = new FirefoxDriver();
				}
				else if (browserName.equals("ie"))
				{
					WebDriverManager.iedriver().setup();
					driver = new InternetExplorerDriver();
				}
			}
			catch (Exception e) 
			{
				System.out.println("Unable to load browser: " + e.getMessage());
			} 
			finally 
			{			
				login=PageFactory.initElements(driver, LoginPage.class);
//				home=PageFactory.initElements(driver, HomePage.class);
			}
			return driver;
		}
}
