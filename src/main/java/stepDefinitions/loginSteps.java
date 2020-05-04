package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class loginSteps extends DriverFactory {
	
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

	@Then("Home page is displayed")
	public void home_page_is_displayed() 
	{
	    
	}

	@Then("Validate home page title")
	public void validate_home_page_title() {
	   
	}

	@Then("Logged in successfully message should be displayed")
	public void logged_in_successfully_message_should_be_displayed() {
	    
	}

}
