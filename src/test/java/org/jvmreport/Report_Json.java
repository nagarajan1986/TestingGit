package org.jvmreport;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report_Json {
	
	public static void createJVMReport(String jsonFilePath) {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\src\\test\\resources");
		
		Configuration c = new Configuration(f, "Facebook");
		c.addClassifications("OS Platform", "Windows");
		c.addClassifications("OS Version", "10");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "103.0.0");
		
		List<String> l = new LinkedList<String>();
		
		l.add(jsonFilePath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		
	
		
		r.generateReports();
		

	}

}
