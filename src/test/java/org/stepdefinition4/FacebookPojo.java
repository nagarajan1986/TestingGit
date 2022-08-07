package org.stepdefinition4;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojo extends UtilityClass {
	
	public FacebookPojo() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createAccount;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lasttName;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement passWord;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement selectDay;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement selectMonth;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement selectYear;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement radiobtn;
	
	@FindBy(name="websubmit")
	private WebElement clickSignup;
	

	
	
	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLasttName() {
		return lasttName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSelectDay() {
		return selectDay;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getClickSignup() {
		return clickSignup;
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
