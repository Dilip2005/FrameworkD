Feature: Creating New Opportunity in Salesforce Application


Scenario:
Given Launch the chrome browser
And Load the url
And Enter user name as 'ramkumar.ramaiah@testleaf.com'
And Enter password as 'Password#123'
Then Click on the login button
And Click on the toggle menu button from the left corner 
And Click View All 
And Click Sales from App Launcher
Then Click on Opportunity tab 
And Click on New button

Scenario Outline:
And Enter Opportunity name as <Opportunityname>
And Choose todays close date <date>

Examples:
|Opportunityname|date|
|Salesforce Automation by sasikala|8/22/2022|