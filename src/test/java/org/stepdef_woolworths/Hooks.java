package org.stepdef_woolworths;

import org.baseclass.UtilityClass;

import cucumber.api.java.Before;

public class Hooks extends UtilityClass {
	
	
	@Before
	public void beforeCondtions() {
		
		browserLaunch("chrome");
		maxWin();
		implicitTimeWait(30);
		
		

	}
	
	public void afterCondtions() {
		
		closeBrowser();

	}

}
