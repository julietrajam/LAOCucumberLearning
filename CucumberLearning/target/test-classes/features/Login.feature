Feature: Leaftaps Login Functionality

Scenario: Test with positive credential

Given Open the browser
And Load the application URL as 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Verify HomePage is displayed
When click on 'CRM' link

Scenario: Test with negative credential

Given Open the browser
And Load the application URL as 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error should be displayed


 