@OrangeHRM
Feature: This is to validate login feature for OrangeHRM 

@OrangeLogin
Scenario Outline: This is to validate login scenario  

Given To launch the web browser and maximize the window

When  To launch the url of OrangeHRM application

When To pass the username in the "<Username>" Username field

When  To pass the password in the "<Password>" Password field

When To click the login button

Examples:
|Username|Password|
|Admin|admin123|



Scenario: This is to validate Directory Page scenario  

Given To click the Directory Tab

When  To select the Job Title as "Chief Executive Officer" role

When To click the search button

When  To get the name of the CEO










