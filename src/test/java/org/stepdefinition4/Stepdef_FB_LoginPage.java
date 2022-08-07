package org.stepdefinition4;

import java.io.IOException;

import org.baseclass.UtilityClass;

import com.pom.design.LoginPojo_TaskQ1;

import cucumber.api.java.en.When;

public class Stepdef_FB_LoginPage extends UtilityClass {

	LoginPojo_TaskQ1 l;

	@When("To pass the username in the email field")
	public void to_pass_the_username_in_the_email_field() throws IOException {

		l = new LoginPojo_TaskQ1();

		sendTextboxValues(l.getUsername(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 2, 1));
	}

	@When("To pass the password in the password field")
	public void to_pass_the_password_in_the_password_field() throws IOException {

		sendTextboxValues(l.getPassword(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 3, 1));
		//sendTextboxValues(l.getPassword(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 9, 1));
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		clickElements(l.getLoginBtn());
	}

}
