package org.stepdefinition;

import org.baseclass.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitionForOrangeHRMDirectoryPage extends UtilityClass {

	OrangePOJO o;

	
	
	
	@Given("To click the Directory Tab")
	public void to_click_the_Directory_Tab() {
		
		o = new OrangePOJO();
		
		clickElements(o.getDirectoryBtnClick());
	}

	@When("To select the Job Title as {string} role")
	public void to_select_the_Job_Title_as_role(String name) {
		
		selectByVisibleText(o.getSelectJobTitle(), name);
	}

	@When("To click the search button")
	public void to_click_the_search_button() {
		
		clickElements(o.getClickSearchBtn());
	}

	@When("To get the name of the CEO")
	public void to_get_the_name_of_the_CEO() {
		
		String ceoName = getText(o.getGetTextName());
		System.out.println(ceoName);
		
		
	}






}
