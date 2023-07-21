//Employee Id:20450630

@SignUp
Feature: To check the signup functionality in Linkdin

@ValidSignUp
Scenario: Login with valid input credentials
Given user is on signup page
When enter email and password and click Join and Agree
Then user should signup successfully

@InvalidSignUp
Scenario Outline: Login with invalid input credentials
Given user is on signup page
When enter <Email> or <Password> and click Join and Agree
Then error message is displayed
Examples:
         |Email|Password|
         |sriram@gmail.com|sr2345@|
         |rammarao@gmail.com|da2135@|