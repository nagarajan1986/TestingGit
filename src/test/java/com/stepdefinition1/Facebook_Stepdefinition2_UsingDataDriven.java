package com.stepdefinition1;

import java.io.IOException;

import org.baseclass.UtilityClass;

import com.pom.design.LoginPojo_TaskQ1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook_Stepdefinition2_UsingDataDriven extends UtilityClass {
	
	LoginPojo_TaskQ1 l;
	
	
	
	
	@Given("To launch the web browser and maximize the window")
	public void to_launch_the_web_browser_and_maximize_the_window() throws IOException {
		
		
		browserLaunch(getDataFromExcel("Facebook_Details", "Sheet0", 0, 0));
		maxWin();
		
	}

	@When("To launch the url of Facebook application")
	public void to_launch_the_url_of_Facebook_application() throws IOException {
		
		urlSetup(getDataFromExcel("Facebook_Details", "Sheet0", 1, 0));
	}

	@When("To pass the username in the email field")
	public void to_pass_the_username_in_the_email_field() throws IOException {
		
		l= new LoginPojo_TaskQ1();
		
		sendTextboxValues(l.getUsername(), getDataFromExcel("Facebook_Details", "Sheet0", 2, 0));
		
	}

	@When("To pass the password in the password field")
	public void to_pass_the_password_in_the_password_field() throws IOException {
		
		sendTextboxValues(l.getPassword(), getDataFromExcel("Facebook_Details", "Sheet0", 3, 0));
	}
	
	@When("To click the login button")
	public void to_click_the_login_button() throws IOException {
		
		clickElements(l.getLoginBtn());
	}

	@Then("To close the browser finally")
	public void to_close_the_browser_finally() {
		
		closeBrowser();
		
	}
	

}
