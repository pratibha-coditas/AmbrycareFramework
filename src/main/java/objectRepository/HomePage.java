package objectRepository;


import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage extends BasePage 
{
	WebDriver driver;
	@FindBy(xpath = "//h3[text()='Patients']")
	public WebElement patientLable;
	@FindBy(xpath = "//span[text()='Add patient']")
	public WebElement addPatientLink;
	@FindBy(xpath = "//span[text()='Upload Patient File']")
	public WebElement uploadPatientLink;		
	@FindBy(xpath = "//span[contains(@class,'user-name'])")
	public WebElement homepageusername;
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	public WebElement firstname;
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	public WebElement lastname;
	@FindBy(xpath="//span[contains(@class,'ng-star-inserted')]")
	public WebElement month;
	@FindBy(xpath="//div[@class='value-container mm']//div[contains(@class,'mat-select-arrow')]")
	public WebElement montharrow;
	@FindBy(xpath="//div[@class='value-container dd']//div[contains(@class,'mat-select-arrow-wrapper')]/div")
	public WebElement datearrow;
	@FindBy(xpath = "//div[@class='value-container yyyy']//input[@formcontrolname='year']")
	public WebElement addPatientyear;
	@FindBy(xpath = "//div[contains(text(),'Female')]/preceding-sibling::div/div[@class=\"mat-radio-inner-circle\"]")
	public WebElement femaileradiobtn;
	@FindBy(xpath = "//div[contains(text(),'Male')]/preceding-sibling::div/div[@class=\"mat-radio-inner-circle\"]")
	public WebElement maleradiobtn;
	@FindBy(xpath = "//span[text()='Ok']")
	public WebElement clockokbtn;
	@FindBy(xpath = "//p[contains(text(),'Logged in successfully')]")
	public WebElement successmsg;
	@FindBy(xpath="//span[@class='mat-option-text']")
	public List<WebElement> monthoptions;
	
	
	
	
	//span[@class='mat-option-text'  and contains(text(),'07')]
	
	//div[contains(@class,"clock-face__number clock-face")]/span[normalize-space(text())='1']----selecting time from clock
	
	public HomePage() throws IOException {
		super();
	}
	public void verifyHomePageEmailId()
	{ 
		waitUntilPreLoadElementDissapears(successmsg);
		WaitUntilWebElementIsVisible(homepageusername);
		String email=homepageusername.getText();
		Assert.assertEquals("narayan.tomar@coditas.com",email);
	}
	public boolean verifyPatientsLableDisplayed()
	{
		WaitUntilWebElementIsVisible(patientLable);
		return patientLable.isDisplayed();
	}
	public void clickOnAddPatientLink() throws InterruptedException, IOException
	{
		waitAndClickElement(addPatientLink);
	
	}
	public void clickOnUploadPatientLink()
	{
		uploadPatientLink.click();	
	}

	public void EnterFirstName(String Name) throws Exception
	{
		sendKeysToWebElement(firstname,Name);		
	}
	public void EnterLastName(String Name) throws Exception
	{
		
	    long time = System.currentTimeMillis();
	    Name=Name+time;
		sendKeysToWebElement(lastname,Name);		
	}
	public void EnterDateOfBirth(String mm,String dd,String yyyy) throws Exception
	{
		waitAndClickElement(montharrow);	
		waitAndClickElementByContainsString(monthoptions, mm);
	
//		waitAndClickElement(driver.findElement(By.xpath("span[@class='mat-option-text'  and contains(text(),"+mm+")]")));
		waitAndClickElement(datearrow);
		waitAndClickElementByContainsString(monthoptions, dd);	
		sendKeysToWebElement(addPatientyear,yyyy);
		
	}
}
