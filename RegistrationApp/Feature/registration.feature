Feature: Registration 
Scenario: Registering
Given Open Registration page
When On click of register, enter valid details
Then Registered successfully


Scenario: Registering with invalid gmail
Given Open Registration page
When On click of register, enter invalid gmail
Then Registered successfully


Scenario: Registering with invalid number
Given Open Registration page
When On click of register, enter invalid number
Then Registered successfully