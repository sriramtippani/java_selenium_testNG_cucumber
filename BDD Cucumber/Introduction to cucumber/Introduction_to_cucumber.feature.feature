//Employee Id:20450630
#Initialize all the different browsers (Chrome, Fire Fox, Internet Explorer )

@Intialize
Feature: To intialize all the different browsers 
Scenario Outline: Launch the different browsers
Given Launch <browsername>
 Examples: 
    | browsername| 
    | Chrome| 
    | Fire Fox | 
    | Internet Explorer|