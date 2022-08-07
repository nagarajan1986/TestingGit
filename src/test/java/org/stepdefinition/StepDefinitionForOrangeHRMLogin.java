package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.UtilityClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinitionForOrangeHRMLogin extends UtilityClass {

	OrangePOJO o;


	@When("To launch the url of OrangeHRM application")
	public void to_launch_the_url_of_OrangeHRM_application() {
		urlSetup("https://opensource-demo.orangehrmlive.com/");
	}

	@When("To pass the username in the Username field")
	public void to_pass_the_username_in_the_Username_field(DataTable d) {
		
		o = new OrangePOJO();
		/*List<String> l = d.asList();
		sendTextboxValues(o.getUserName(), l.get(1));*/
		
		Map<String, String> m = d.asMap(String.class, String.class);
		sendTextboxValues(o.getUserName(), m.get("emailorusernamethree"));
		
	}

	@When("To pass the password in the Password field")
	public void to_pass_the_password_in_the_Password_field(DataTable d) {
		
		/*List<List<String>> ls = d.asLists();
		sendTextboxValues(o.getPassword(), ls.get(1).get(2));*/
		
		List<Map<String, String>> maps = d.asMaps();
		sendTextboxValues(o.getPassword(), maps.get(2).get("PasswordThree"));
	}
	

	@Then("To click the login button")
	public void to_click_the_login_button() {

		clickElements(o.getLoginBtn());
	}
	
	
	






}
