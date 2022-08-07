package org.stepdefinition;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePOJO extends UtilityClass {
	
	public OrangePOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="txtUsername")
	private WebElement userName;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	
	
	
	@FindBy(linkText="Directory")
	private WebElement directoryBtnClick;
	
	@FindBy(id="searchDirectory_job_title")
	private WebElement selectJobTitle;
	
	@FindBy(id="searchBtn")
	private WebElement clickSearchBtn;
	
	@FindBy(xpath="//ul/li/b")
	private WebElement getTextName;
	
	

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getDirectoryBtnClick() {
		return directoryBtnClick;
	}

	public WebElement getSelectJobTitle() {
		return selectJobTitle;
	}

	public WebElement getClickSearchBtn() {
		return clickSearchBtn;
	}

	public WebElement getGetTextName() {
		return getTextName;
	}


}
