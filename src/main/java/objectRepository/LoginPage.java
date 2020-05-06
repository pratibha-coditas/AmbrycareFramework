package objectRepository;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import junit.framework.Assert;
import utils.ReadConfigFile;

public class LoginPage extends BasePage
{
	ReadConfigFile configfile=new ReadConfigFile();
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement username;
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginButton;
	@FindBy(xpath = "//h4[text()='Welcome to CARE']")
	private WebElement careLogo;
	@FindBy(xpath = "//p[contains(text(),'Logged in successfully')]")
	private WebElement successmsg;
	
	
	public LoginPage() throws IOException {
		super();
	}
		public LoginPage validateLoginPageTitle() throws IOException
	{
		
		String url=configfile.getUrl();
		driver.get(url);
		String title=driver.getTitle();
		Assert.assertEquals("CARE Provider Portal", title);
		return new LoginPage();
	
	}
	public LoginPage validateCAREImage() throws IOException
	{
		
		WaitUntilWebElementIsVisible(careLogo);
		return new LoginPage();
	}
	public LoginPage validateloggedInSuessfullyMassage() throws IOException
	{
		WaitUntilWebElementIsVisible(successmsg);
		Assert.assertTrue(successmsg.isDisplayed());
		return new LoginPage();
	}
	public HomePage login() throws Exception
	{
		sendKeysToWebElement(username, configfile.getUsername());	
		sendKeysToWebElement(password, configfile.getPassword());	
		waitAndClickElement(loginButton);
		return new HomePage();
		
	}	


}
