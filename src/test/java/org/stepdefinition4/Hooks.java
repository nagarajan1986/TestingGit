package org.stepdefinition4;

import org.baseclass.UtilityClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends UtilityClass {

	@Before
	public void launchBrowser1() {
		browserLaunch("chrome");
		maxWin();
		urlSetup("https://www.facebook.com/");
		implicitTimeWait(40);

	}

	/*
	 * @Before(order=20) public void launchBrowser2() { browserLaunch("firefox");
	 * maxWin(); urlSetup("https://www.facebook.com/"); implicitTimeWait(40);
	 * 
	 * 
	 * }
	 */

	@After(order = 2)
	public void takeScreenshots(Scenario s) {

		if (s.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenShot = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenShot, "image/png");

		}

	}

	@After(order = 1)
	public void to_close_the_browser_finally() {
		closeBrowser();
	}

}
