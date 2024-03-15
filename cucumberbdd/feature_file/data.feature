Feature: orangeHRM Homepage
Scenario: login using valid un and pwd check for homepage and logout
Given open the browser and enter the url
When login using valid un and pwd
Then check homepage is displayed
And logout and close