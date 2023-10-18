Feature: TestLeaf Login functionality

Scenario: Test login functionality with positive values
Given Open the chrome browser
And Enter the username as 'demoCsr'
And Enter the password as 'crmsfa'
When Click the login button
Then Homepage shouble displayed



Scenario: Test login functionality with negative values
Given Open the chrome browser
And Enter the username as 'Demosalesmanager1'
And Enter the password as 'crmsfa'
When Click the login button
Then Homepage shouble displayed