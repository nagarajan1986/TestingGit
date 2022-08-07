$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Facebook"
    }
  ]
});
formatter.scenario({
  "name": "To validate Create Account page functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@CreatePage"
    },
    {
      "name": "@Facebook1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To click Create New Account button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_click_Create_New_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass first name of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_pass_first_name_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass last name of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_pass_last_name_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass email of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_pass_email_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass new password of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_pass_new_password_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select birth day of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_select_birth_day_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select birth month of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_select_birth_month_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To select birth year of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_select_birth_year_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click gender of the user",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_click_gender_of_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user will Click the Signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef_FB_RegistrationAndLoginPage.to_user_will_Click_the_Signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Username and password functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To pass the username in the email field",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_LoginPage.to_pass_the_username_in_the_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass the password in the password field",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_LoginPage.to_pass_the_password_in_the_password_field()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.baseclass.UtilityClass.getDataFromExcel(UtilityClass.java:384)\r\n\tat org.stepdefinition4.Stepdef_FB_LoginPage.to_pass_the_password_in_the_password_field(Stepdef_FB_LoginPage.java:27)\r\n\tat ✽.To pass the password in the password field(src/test/resources/Facebook.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef_FB_LoginPage.to_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});