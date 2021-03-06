package actions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory
{
	@Given("User is on landing Page")
	public void user_is_on_landing_Page() throws IOException {
		login.validateLoginPageTitle();
	}

	@When("user login into application with valid username and password")
	public void user_login_into_application_with_valid_username_and_password() throws Exception 
	{
		login.validateCAREImage();
		login.login();	
	}
	
	@Then("^Popup is displayed as \"([^\"]*)\"$")
	public void popup_is_displayed_as(String arg1) throws Throwable 
	{
		login.validateloggedInSuessfullyMassage();
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() throws Exception 
	{
//	    home.verifyHomePageEmailId();
	    home.verifyPatientsLableDisplayed();	
	    home.clickOnAddPatientLink();
	    home.EnterFirstName("Priti");
	    home.EnterLastName("patil");
	    home.EnterDateOfBirth("05","30","2000");
	}

	@Then("Validate home page title")
	public void validate_home_page_title() {
	   
	}

	@Then("Logged in successfully message should be displayed")
	public void logged_in_successfully_message_should_be_displayed() {
	    
	}



}
