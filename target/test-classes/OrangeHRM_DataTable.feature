@OrangeHRM
Feature: This is to validate login feature for OrangeHRM 

#DataTable examples

Scenario: This is to validate invalid usernames and passwords in login page scenario  

When  To launch the url of OrangeHRM application

When To pass the username in the Username field

|emailorusernameone|sugan.tcl@gmail.com|                  #--------> one dimensional Map
|emailorusernametwo|kumar.tcl@gmail.com|
|emailorusernamethree|nagu.tcl@gmail.com|


When  To pass the password in the Password field

|PasswordOne|PasswordTwo|PasswordThree|                  #--------> two dimensional Map
|sugan1224344|nagu1644|deekshay27535|
|sugan4344|nagu44|deekshay535|
|sugan24344|nagu44|deekshay275|


Then To click the login button





#DataTable examples

#Scenario: This is to validate invalid usernames and passwords in login page scenario  

#When  To launch the url of OrangeHRM application

#When To pass the username in the Username field

#|nagu.tcl@gmail.com|sugan.tcl@gmail.com|manoj.tcl@gmail.com|kumar.tcl@gmail.com|   #--------> one dimensional List

#When  To pass the password in the Password field

#|sugan1224344|nagu1644|deekshay27535|          #--------> two dimensional List
#|sugan4344|nagu44|deekshay535|
#|sugan24344|nagu44|deekshay275|

#Then To click the login button



#Scenario: This is to validate Directory Page scenario  

#Given To click the Directory Tab

#When  To select the Job Title as "Chief Executive Officer" role

#When To click the search button

#When  To get the name of the CEO










