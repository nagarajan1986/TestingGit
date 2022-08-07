package com.pom.design;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends UtilityClass{
	
	public LoginPOJO() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement signin;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginBtn;
	

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}
