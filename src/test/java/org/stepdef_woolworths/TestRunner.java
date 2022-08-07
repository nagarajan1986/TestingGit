package org.stepdef_woolworths;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\WoolWorths.feature", glue="org.stepdef_woolworths", dryRun=false, monochrome=true)
public class TestRunner {
	
	

}
