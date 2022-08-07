package org.stepdefinition;

import org.baseclass.UtilityClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends UtilityClass {
	
	@Before
	public void to_launch_the_web_browser_and_maximize_the_window() {
		browserLaunch("chrome");
		maxWin();
		implicitTimeWait(40);
	}
	
	
	
	
	@After
	public void to_close_the_browser_finally() {
		closeBrowser();
	}
	
	

}
