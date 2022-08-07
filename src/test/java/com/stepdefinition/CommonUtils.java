package com.stepdefinition;

import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
	
	public static String BROWSER;
	public static String APP_URL;
	public static String USERNAME;
	public static String PASSWORD;
	
	public  void loadProperties() throws IOException {
		
		Properties p = new Properties();
		
		//InputStream input =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\config.properties");
		//p.load(input);
		
		
		try {
			p.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		BROWSER=p.getProperty("BROWSER");
		APP_URL=p.getProperty("APP_URL");
		USERNAME=p.getProperty("USERNAME");
		PASSWORD=p.getProperty("PASSWORD");
		
		
		
		
		

	}

	
	

}
