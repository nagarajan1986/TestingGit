package com.stepdefinition1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="com.stepdefinition1", monochrome=true)

public class TestRunner {
	
	
}
