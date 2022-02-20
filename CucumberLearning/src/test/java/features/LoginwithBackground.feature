Feature: Leaftaps Login Functionality

Background:
Given Open the browser
And Load the application URL as 'http://leaftaps.com/opentaps/control/main'

Scenario Outline: Test with positive credential

Given Enter the username as <username>
Given Enter the password as <password>
When Click on Login button
Then Verify HomePage is displayed

Examples:
|username|password|
|'DemoCSR'|'crmsfa'|
|'Demosalesmanager'|'crmsfa'|