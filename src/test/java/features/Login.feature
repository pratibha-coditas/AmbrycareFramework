Feature: Application Login
Scenario: Login to application with valid username and password
Given User is on landing Page          
When user login into application with valid username and password
Then Popup is displayed as "Logged in successfully"
Then Home page is displayed 
Then Validate home page title
And Logged in successfully message should be displayed