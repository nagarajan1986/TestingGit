package com.stepdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.Report_Json;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition4", dryRun = false, strict = true, snippets = SnippetType.CAMELCASE, 
					monochrome = true, tags = "@Facebook1, @Login", plugin= {"html:target", "junit:JunitReports\\jreport.xml", "json:JsonReports\\jsonreport.json", 
							"rerun:src\\test\\resources\\failedreport.txt"})

public class TestRunner {
	
	
	@AfterClass
	public static void jvmReport() {
		
		Report_Json.createJVMReport("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\JsonReports\\jsonreport.json");
		
		

	}
	
	

}
