@HotelBooking
Feature: This is to validate Booking Hotel application


Scenario: This is to validate Booking Hotel scenario  

Given To launch the web browser and maximize the window

When  To launch the url of Adactin Hotel application

When To pass the username in the Username field

When  To pass the password in the Password field

When To click the login button


Scenario: This is to validate Search Hotel Page scenario  

When To select user location

When  To select user Hotel name 

When To select user Room type

When  To select user Number of rooms

When  To select user Number of Adults

When  To select user Number of Children

Then To click search button


Scenario: This is to validate Search Hotel Details Page scenario  

When  To click select Hotel radio button 

Then To click Continue button



Scenario: This is to validate Book A Hotel Page scenario  

When  To pass First name of the user 

When To pass Last name of the user 

When  To pass Address of the user 

When  To pass Credit card number of the user 

When  To select Credit card type of the user

When To select Credit card expiry Month and Year

When To pass CVV number of the user credit card

When To click Book Now button

Then To user get the Book order number








