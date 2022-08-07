package org.rerun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\failedreport.txt", glue="org.stepdefinition4", monochrome=true)
public class TestReRunner {

}
