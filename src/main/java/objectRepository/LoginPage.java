package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import junit.framework.Assert;
import utils.ReadConfigFile;

public class LoginPage extends BasePage
{
	ReadConfigFile configfile=new ReadConfigFile();
	@FindBy(id = "mat-input-0")
	private WebElement username;
	@FindBy(id = "mat-input-1")
	private WebElement password;
	@FindBy(xpath = "//span[text()=\"Log in\"]")
	private WebElement loginButton;
	@FindBy(xpath = "//h4[text()=\"Welcome to CARE\"]")
	private WebElement careLogo;
	
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
	public LoginPage login() throws Exception
	{
		sendKeysToWebElement(username, configfile.getUsername());	
		sendKeysToWebElement(password, configfile.getPassword());	
		waitAndClickElement(loginButton);
		return new LoginPage();
		
	}	


}
