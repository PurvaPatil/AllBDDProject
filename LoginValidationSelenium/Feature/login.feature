Feature: User Login

Scenario: Login using valid username and valid password
Given I am on login page
When enter username as PurvaPatil and password as pp123 
Then open success page

@sanity 
Scenario: Login using invalid username and valid password
Given I am on login page
When enter invalid username as Purva and password as pp123 
Then alert message for invalid username
#@regression
Scenario: Login using valid username and invalid password
Given I am on login page
When enter username as PurvaPatil and invalid password as pp 
Then alert message for invalid password
