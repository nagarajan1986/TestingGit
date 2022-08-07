package org.stepdef_woolworths;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POJO extends UtilityClass {

	
	
	public LoginPage_POJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Log in / Signup']")
	private WebElement loginSignupButton;
	
	@FindBy(id="loginForm-Email")
	private WebElement username;
	
	@FindBy(id="loginForm-Password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	
	
	public WebElement getLoginSignupButton() {
		return loginSignupButton;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
