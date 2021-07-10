Feature: Log in
Scenario: I want to log in into my gmail account 
Given I am on google  homepage 
When I click on log in  
And enter my email id 
And click next
And enter my password
And click submit 
Then log in should be successful
