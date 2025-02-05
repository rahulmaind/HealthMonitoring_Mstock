Feature: Login to Mstock Website

Background:
Given User is on Mstock Website login page.
When User entered valid email id and password.
#Then User should navigate to OTP page and verfy the OTP.
And Accepted the Risk Disclosure Darivative pop up
And User should redirect on a mStock home page


@orders
Scenario: Verify the order tab/page Raise query functionality

When user click on Order tab
And click on Order related queries?
Then Verify Orders - FAQs pop is opened.

When user click on FAQ question arrow button
Then FAQ should expand and by clicking here. link should be visible.

When user click in by clicking here. link
Then Input text box should open and editable.

When user added the input, attachment and click on Raise query button.
Then Attachment should be added and display below input box.
And Success pop up messege should be display and verified.
And verify load time of the success pop up.

@positions
Scenario: Verify the positions tab/page Raise query functionality

When user click on positions tab
And click on positions related queries?
Then Verify positions - FAQs pop is opened.

When user click on positions FAQ question arrow button
Then positions FAQ should expand and by clicking here. link should be visible.

When user click on by clicking here. link
Then Input text box to write query should open and editable.

When user added the input query, attachment and click on Raise query button.
Then Attachment for positions FAQ should be added and display below input box.
And Post click on Raised button Success pop up messege should be display and verified.
And verify load time of the positions success pop up.

@portfolio
Scenario: Verify the portfolio tab/page Raise query functionality

When user click on portfolio tab
And click on portfolio related queries?
Then Verify portfolio - FAQs pop is opened.

When user click on portfolio FAQ question arrow button
Then portfolio FAQ should expand and by clicking here. link should be visible.

When user click on the click here. link
Then Input text box for write query should open and editable.

When user added the query, attachment and click on Raise query button.
Then Attachment for portfolio FAQ should be added and display below input box.
And Post click on Raised query button Success pop up messege should be display and verified.
And verify load time of the portfolio success pop up.


@funds
Scenario: Verify the funds tab/page Raise query functionality

When user click on funds tab
And click on funds related queries?
Then Verify funds - FAQs pop is opened.

When user click on funds FAQ question arrow button
Then FAQ should expand and "by clicking here." link should be visible.

When user click on the by clicking here. link
Then Query Input text box should open and editable.

When user add the input, query attachment and click on Raise query button.
Then Fund query related Attachment should be added and display below input box.
And Success pop up messege should be display properly and verified.
And verify load time of the funds success pop up.

@verifySentQuery
Scenario: Verify the queries are listed/store in help page
When Click on home page hamburger menu
 And click on Help module
    Then the Help page is open
    And the All Recent Queries is displayed on this page