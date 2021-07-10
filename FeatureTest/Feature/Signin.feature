Feature: Test Background Feature 
Description: the purpose of this feature is to test background keyword
Background: User is on logged in 
Given i navigate to login page
When I click on sign in
And i Enter user name 
And i enter password
And i enter submit
Then Log in should be succesful

@Testone 
Scenario: Search a product and add the first oproduct to the cart
Given User search from all
When Select aklaxa skills
Then select should be succesfull


@TestTwo
Scenario: Navigate to a product and the first product to the cart
Given User anvigate for a Lenovo laptop
When add the laptop to the cart 
Then user basket should  display with added item












