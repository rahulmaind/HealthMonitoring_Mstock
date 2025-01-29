Feature: User Login to Mstock Website


Scenario: Login with valid credentials
Given User is on Mstock login page
When User entered valid email and password
#Then User should navigate to OTP page and verfy the OTP.
And Accept the Risk Disclosure Darivative pop up.
And User should see a mStock home page.


#Scenario: Help module funcationality

#Given User is on mStock home page.
When Click on home pahe hamburger menu.
And select the Help menu.

Then Help main page should open.
And verify the time taken for load the help page.


When user scroll the page and click on the Write to us here link.
Then Input box should open and editable.

When user added the input, attachment and click on Raise button.
Then Attachment should be display below input box.
And Success pop up msg should be display and verified.
And verify the success pop up load time.


#Scenario: Verify Have a Query module functionality
#Given User is on Help page and focus on Have a Query? section.
When User is on Help page and click on trade arrow button under Have a Query? section
Then System should navigate on trade Details page.
And Scroll down the page till the bottom.

When user add the input, attachment and click on Raise button.
Then Attachment name with delete icon should be display below input box.
And Success pop up message should be display and verified.
And verify the success message pop up load time.

#Scenario: Verify Have a Query module functionality
When user scroll down the help page till All Your Queries section.
Then Verify the Queries are listed in All Your Queries section.
When user click on View All link
Then Page should navigate to new tab and open View all poge.





