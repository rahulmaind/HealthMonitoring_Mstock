Feature: Verify demat-account Landing Page.

 
Scenario: Verify the demat-account Account landing page is loads successfully
    Given I am on the Demat Account Landing Page.
    When the page loads completely.
    Then the title of the page should be "Open Demat Account Online | mStock".
    And URL should be "https://www.mstock.com/sem-landing/demat-account".
    And page should contain a heading "Open Your Demat Account".
    And Page should contain a button "Open Demat Account".
 

When we enter phone number.
Then User should redirect on OTP screen page..
 
Scenario: Verify the Scrolling and Shuffling Tab

When The user scrolls down and clicks on the tab.
Then The tab should be clickable and images should display properly.
 
Scenario: Verify the Second Phone Number Field

When we enter phone number and click on the Open Account button.
Then User should redirect on second OTP screen page.
 
Scenario: Verify the FAQs

When The user clicks on the FAQ down arrow.
Then Arrow should be clickable and the answer should be displayed.
 
Scenario: Verify the footer CTA is clickable

When User click on the CTA present in footer.
Then User should nevigate on respective page and page loads successfully.