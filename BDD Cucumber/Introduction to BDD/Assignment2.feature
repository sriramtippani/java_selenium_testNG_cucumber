//Employee Id:20450630

@Withdrawl
Feature: To check the CashWithDraw Functionality

@ValidWithdrawl
Scenario: Checking with valid Bank Details
Given user is on CashWithDraw web page
When enter the pin number and withdrawn amount and click Make Payment
Then user should transaction successfully

@InvalidWithdrawl
Scenario Outline: Checking with invalid Bank Details
Given user is on CashWithDraw web page
When enter the invalid <pin number> and <withdrawn amount> and click Make Payment
Then user should get error message on pin identification
Examples:
                    |pin number|withdrawn amount|
                    |7892|745940|
                    |7837|929262|