@Sign
Feature: Log in feature
Scenario: Log in to amazon account and search for pen
Given User on amazon home page 
When User click on sign in 
And enter user id 
And enter password
And click sign in
And search for pen 
Then log in and search should be succesful
