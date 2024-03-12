@tag
Feature: Login feature

@tag1
Scenario: Validating login page
Given user  opens chrome and enters url
When user enter username
And user enter password
And clicks on login
Then Welecome back message is displayed