package org.stepdefinition4;

import java.io.IOException;

import org.baseclass.UtilityClass;

import com.pom.design.LoginPojo_TaskQ1;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef_FB_RegistrationAndLoginPage extends UtilityClass {

	FacebookPojo f;

	@When("To click Create New Account button")
	public void to_click_Create_New_Account_button() {
		f = new FacebookPojo();

		clickElements(f.getCreateAccount());

	}

	@When("To pass first name of the user")
	public void to_pass_first_name_of_the_user() throws IOException {

		sendTextboxValues(f.getFirstName(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 0, 1));
	}

	@When("To pass last name of the user")
	public void to_pass_last_name_of_the_user() throws IOException {

		sendTextboxValues(f.getLasttName(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 1, 1));
	}

	@When("To pass email of the user")
	public void to_pass_email_of_the_user() throws IOException {

		sendTextboxValues(f.getEmail(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 2, 1));
	}

	@When("To pass new password of the user")
	public void to_pass_new_password_of_the_user() throws IOException {

		sendTextboxValues(f.getPassWord(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 3, 1));
	}

	@When("To select birth day of the user")
	public void to_select_birth_day_of_the_user() throws IOException {

		selectByVisibleText(f.getSelectDay(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 4, 1));
	}

	@When("To select birth month of the user")
	public void to_select_birth_month_of_the_user() throws IOException {
		selectByVisibleText(f.getSelectMonth(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 5, 1));
	}

	@When("To select birth year of the user")
	public void to_select_birth_year_of_the_user() throws IOException {
		selectByVisibleText(f.getSelectYear(), getDataFromExcel("Facebook_RegisterAndLogin", "Sheet0", 6, 1));
	}

	@When("To click gender of the user")
	public void to_click_gender_of_the_user() {
		clickElements(f.getRadiobtn());
	}

	@Then("To user will Click the Signup button")
	public void to_user_will_Click_the_Signup_button() {

		clickElements(f.getClickSignup());
	}

}
