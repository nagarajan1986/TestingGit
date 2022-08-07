package com.pom.design;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetails_POJO extends UtilityClass {
	
	public HotelDetails_POJO()  {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radioBtnClick;
	
	@FindBy(id="continue")
	private WebElement clickContinueBtn;
	

	public WebElement getRadioBtnClick() {
		return radioBtnClick;
	}

	public WebElement getClickContinueBtn() {
		return clickContinueBtn;
	}
	
	
	
	

}
