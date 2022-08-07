package com.pom.design;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel_POJO extends UtilityClass {
	
	public BookAHotel_POJO() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccvNum;
	
	@FindBy(id="cc_type")
	private WebElement ccvTypeSelect;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccvExpiryMonthSelect;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccvExpiryYearSelect;
	
	@FindBy(id="cc_cvv")
	private WebElement againcvvNum;
	
	@FindBy(id="book_now")
	private WebElement bookNowBtn;
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement getAttributeTxt;
	

	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcvNum() {
		return ccvNum;
	}

	public WebElement getCcvTypeSelect() {
		return ccvTypeSelect;
	}

	public WebElement getCcvExpiryMonthSelect() {
		return ccvExpiryMonthSelect;
	}

	public WebElement getCcvExpiryYearSelect() {
		return ccvExpiryYearSelect;
	}

	public WebElement getAgaincvvNum() {
		return againcvvNum;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
	public WebElement getGetAttributeTxt() {
		return getAttributeTxt;
	}
	
	
	
	

}
