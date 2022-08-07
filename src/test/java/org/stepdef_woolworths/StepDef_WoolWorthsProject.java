package org.stepdef_woolworths;

import org.baseclass.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_WoolWorthsProject extends UtilityClass {
	
	LoginPage_POJO l;
	
	
	@Given("User has to  pass the URL")
	public void user_has_to_pass_the_URL() {
		
		urlSetup("https://www.woolworths.com.au/");
		
	}
	
	@When("User has to  click the Login\\/Signup button")
	public void user_has_to_click_the_Login_Signup_button() {
		
		l = new LoginPage_POJO();
		
		clickElements(l.getLoginSignupButton());
		
	}

	@When("User has to  pass the login email address")
	public void user_has_to_pass_the_login_email_address() {
		
		sendTextboxValues(l.getUsername(), "nagu.tcl@gmail.com");
	}

	@When("User has to  pass the login password")
	public void user_has_to_pass_the_login_password() {
		
		sendTextboxValues(l.getPassword(), "sagdsagsadg4544");
	}

	@Then("User has to click the Login button")
	public void user_has_to_click_the_Login_button() {
		
		clickElements(l.getLoginButton());
	}

}
