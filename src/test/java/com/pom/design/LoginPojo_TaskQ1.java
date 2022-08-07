package com.pom.design;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo_TaskQ1 extends UtilityClass {

	public LoginPojo_TaskQ1() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPassword() {
		return password;
	}

}
