package com.stepdefinition3;

import java.io.IOException;

import org.baseclass.UtilityClass;

import com.pom.design.BookAHotel_POJO;
import com.pom.design.HotelDetails_POJO;
import com.pom.design.LoginPOJO;
import com.pom.design.SearchHotel_POJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_HotelBooking extends UtilityClass {
	
	LoginPOJO l;
	
	SearchHotel_POJO s;
	
	HotelDetails_POJO h;
	
	BookAHotel_POJO b;
	
	
	@Given("To launch the web browser and maximize the window")
	public void to_launch_the_web_browser_and_maximize_the_window() throws IOException {
		
		browserLaunch(getDataFromExcel("HotelBooking", "HotelBook", 0, 0));
		maxWin();
		implicitTimeWait(40);
		
	}

	@When("To launch the url of Adactin Hotel application")
	public void to_launch_the_url_of_Adactin_Hotel_application() throws IOException {
		
		urlSetup(getDataFromExcel("HotelBooking", "HotelBook", 1, 0));
	}

	@When("To pass the username in the Username field")
	public void to_pass_the_username_in_the_Username_field() throws IOException {
		
		l = new LoginPOJO();
		sendTextboxValues(l.getSignin(), getDataFromExcel("HotelBooking", "HotelBook", 2, 0));
		
	}

	@When("To pass the password in the Password field")
	public void to_pass_the_password_in_the_Password_field() throws IOException {
		
		sendTextboxValues(l.getPassword(), getDataFromExcel("HotelBooking", "HotelBook", 3, 0));
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		clickElements(l.getLoginBtn());
	}

	@When("To select user location")
	public void to_select_user_location() {
		
		s = new SearchHotel_POJO();
		
		selectByIndex(s.getLocationSelect(), 2);
	}

	@When("To select user Hotel name")
	public void to_select_user_Hotel_name() {
		selectByIndex(s.getHotelsSelect(), 2);
	}

	@When("To select user Room type")
	public void to_select_user_Room_type() {
		selectByIndex(s.getRoomTypeSelect(), 2);
	}

	@When("To select user Number of rooms")
	public void to_select_user_Number_of_rooms() {
		selectByIndex(s.getRoomNumSelect(), 2);
	}

	@When("To select user Number of Adults")
	public void to_select_user_Number_of_Adults() {
		
		selectByIndex(s.getAdultRoomSelect(), 2);
		
	}

	@When("To select user Number of Children")
	public void to_select_user_Number_of_Children() {
		selectByIndex(s.getChildRoomSelect(), 2);
	}

	@Then("To click search button")
	public void to_click_search_button() {
		
		clickElements(s.getSubmitBtn());
	}

	@When("To click select Hotel radio button")
	public void to_click_select_Hotel_radio_button() {
		h = new HotelDetails_POJO();
		
		clickElements(h.getRadioBtnClick());
	}

	@Then("To click Continue button")
	public void to_click_Continue_button() {
		
		clickElements(h.getClickContinueBtn());
	}
	

	@When("To pass First name of the user")
	public void to_pass_First_name_of_the_user() throws IOException {
		
		b = new BookAHotel_POJO();
		sendTextboxValues(b.getFirstName(), getDataFromExcel("HotelBooking", "HotelBook", 4, 0));
	}

	@When("To pass Last name of the user")
	public void to_pass_Last_name_of_the_user() throws IOException {
		
		sendTextboxValues(b.getLastName(), getDataFromExcel("HotelBooking", "HotelBook", 5, 0));
	}

	@When("To pass Address of the user")
	public void to_pass_Address_of_the_user() throws IOException {
		
		sendTextboxValues(b.getAddress(), getDataFromExcel("HotelBooking", "HotelBook", 6, 0));
	}

	@When("To pass Credit card number of the user")
	public void to_pass_Credit_card_number_of_the_user() throws IOException {
		
		sendTextboxValues(b.getCcvNum(), getDataFromExcel("HotelBooking", "HotelBook", 7, 0));
	}
	
	

	@When("To select Credit card type of the user")
	public void to_select_Credit_card_type_of_the_user() {
		selectByIndex(b.getCcvTypeSelect(), 1);
	}

	@When("To select Credit card expiry Month and Year")
	public void to_select_Credit_card_expiry_Month_and_Year() {
		
		selectByIndex(b.getCcvExpiryMonthSelect(), 2);
		selectByIndex(b.getCcvExpiryYearSelect(), 2);
	}

	@When("To pass CVV number of the user credit card")
	public void to_pass_CVV_number_of_the_user_credit_card() throws IOException {
		
		sendTextboxValues(b.getAgaincvvNum(), getDataFromExcel("HotelBooking", "HotelBook", 7, 0));
	}

	@When("To click Book Now button")
	public void to_click_Book_Now_button() {
		clickElements(b.getBookNowBtn());
	}

	@Then("To user get the Book order number")
	public void to_user_get_the_Book_order_number() throws IOException {
		
		getAttribute1(b.getGetAttributeTxt(), "value");
		createExcel("HotelBooking_cucumber", "HotelBooking_cucumber");
		createNewRow("HotelBooking_cucumber", "HotelBooking_cucumber", 0, 0, getAttribute1(b.getGetAttributeTxt(), "value"));
		
	
	}

	
	

}
