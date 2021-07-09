Feature: Application login
Scenario: Home page default login 
Given  User in on landing page login
When  user login into application with "sweet" and "456"
Then  Home page is open 
And  Home page are display in all details

Scenario: Home page default login 
Given  User in on landing page login
When  user login into application with "jan" and "123"
Then  Home page is open 
And  Home page are display in all details