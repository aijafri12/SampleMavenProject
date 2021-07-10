Feature:  Register account
Scenario: Register account for chase online banking
Given User on the chase bank home page 
When User Click on create account 
And User Enter first name,last name, account information
And User Create user id and password 
And User Confirm user id,password
And User Click submit
Then User Registration should be successful


