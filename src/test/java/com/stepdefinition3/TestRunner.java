package com.stepdefinition3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook.feature", glue="org.stepdefinition4", monochrome=true, dryRun=false)

public class TestRunner {
	
	
	
}
