package com.pom.design;

import java.io.IOException;

import org.baseclass.UtilityClass;

public class MainClass extends UtilityClass{

	public static void main(String[] args) throws IOException {
		
		chromeBrowserLaunch();
		maxWin();
		implicitTimeWait(30);
		urlSetup("http://www.adactin.com/HotelApp/");
		
		LoginPOJO l = new LoginPOJO();
		
		sendTextboxValues(l.getSignin(), getDataFromExcel("HotelBooking", "HotelBook", 0, 0));
		
		sendTextboxValues(l.getPassword(), getDataFromExcel("HotelBooking", "HotelBook", 1, 0));
		
		clickElements(l.getLoginBtn());
		
		SearchHotel_POJO s = new SearchHotel_POJO();
		
		selectByIndex(s.getLocationSelect(), 2);
		selectByIndex(s.getHotelsSelect(), 2);
		selectByIndex(s.getRoomTypeSelect(), 2);
		selectByIndex(s.getRoomNumSelect(), 2);
		selectByIndex(s.getAdultRoomSelect(), 2);
		selectByIndex(s.getChildRoomSelect(), 2);
		clickElements(s.getSubmitBtn());
		
		HotelDetails_POJO h = new HotelDetails_POJO();
		
		clickElements(h.getRadioBtnClick());
		clickElements(h.getClickContinueBtn());
		
		BookAHotel_POJO b = new BookAHotel_POJO();
		
		sendTextboxValues(b.getFirstName(), getDataFromExcel("HotelBooking", "HotelBook", 2, 0));
		sendTextboxValues(b.getLastName(), getDataFromExcel("HotelBooking", "HotelBook", 3, 0));
		sendTextboxValues(b.getAddress(), getDataFromExcel("HotelBooking", "HotelBook", 4, 0));
		sendTextboxValues(b.getCcvNum(), getDataFromExcel("HotelBooking", "HotelBook", 5, 0));
		selectByIndex(b.getCcvTypeSelect(), 2);
		selectByIndex(b.getCcvExpiryMonthSelect(), 2);
		selectByIndex(b.getCcvExpiryYearSelect(), 11);
		sendTextboxValues(b.getAgaincvvNum(), getDataFromExcel("HotelBooking", "HotelBook", 5, 0));
		clickElements(b.getBookNowBtn());
		
		getAttribute1(b.getGetAttributeTxt(), "value");
		createExcel("POM_Hotel_Booking", "POM_Hotel_Book");
		createNewRow("POM_Hotel_Booking", "POM_Hotel_Book", 0, 0, getAttribute1(b.getGetAttributeTxt(), "value"));

	}

}
