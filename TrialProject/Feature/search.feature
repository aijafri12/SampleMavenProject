@Search
Feature: Search bar test
Scenario: User should be able to search on google
Given  User on google home page 
When User write abcd on search bar
And user click on search
Then search should be succesful
