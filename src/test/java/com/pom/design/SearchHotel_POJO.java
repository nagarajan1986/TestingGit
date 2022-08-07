package com.pom.design;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_POJO extends UtilityClass {
	
	
	public SearchHotel_POJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement locationSelect;
	
	@FindBy(id="hotels")
	private WebElement hotelsSelect;
	
	@FindBy(id="room_type")
	private WebElement roomTypeSelect;
	
	@FindBy(id="room_nos")
	private WebElement roomNumSelect;
	
	@FindBy(id="adult_room")
	private WebElement adultRoomSelect;
	
	@FindBy(id="child_room")
	private WebElement childRoomSelect;
	
	@FindBy(id="Submit")
	private WebElement submitBtn;
	

	public WebElement getLocationSelect() {
		return locationSelect;
	}

	public WebElement getHotelsSelect() {
		return hotelsSelect;
	}

	public WebElement getRoomTypeSelect() {
		return roomTypeSelect;
	}

	public WebElement getRoomNumSelect() {
		return roomNumSelect;
	}

	public WebElement getAdultRoomSelect() {
		return adultRoomSelect;
	}

	public WebElement getChildRoomSelect() {
		return childRoomSelect;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}
