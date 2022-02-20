Feature: Leaftaps Login Functionality

Scenario Outline: Test with positive credential

Given Open the browser
And Load the application URL as <url>
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Verify HomePage is displayed

Examples:
|url|username|password|
|'http://leaftaps.com/opentaps/control/main'|'DemoCSR'|'crmsfa'|
|'http://leaftaps.com/opentaps/control/main'|'Demosalesmanager'|'crmsfa'|