package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage 
{
	WebDriver driver;
	@FindBy(xpath = "//h3[text()=\"Patients\"]")
	public WebElement patientLable;
	@FindBy(xpath = "//span[text()=\"Add patient\"]")
	public WebElement addPatientLink;
	@FindBy(xpath = "//span[text()=\"Upload Patient File\"]")
	public WebElement uploadPatientLink;	
	
	public HomePage() throws IOException {
		super();
	}
	public boolean verifyPatientsLableDisplayed()
	{
		return patientLable.isDisplayed();
	}
	public void clickOnAddPatientLink()
	{
		addPatientLink.click();;
	}
	public void clickOnUploadPatientLink()
	{
		uploadPatientLink.click();;
	}	


}
