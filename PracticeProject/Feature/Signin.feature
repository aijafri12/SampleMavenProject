@Sign
Feature: Facebook log in functionality test

Scenario: User able to log in with valid credential

Given  User able to go home page 
When Enter my email
And Password
And Click sign in
Then Sign in should be succesful
