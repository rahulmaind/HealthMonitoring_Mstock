Feature: Verify Trading Account Page.

 ######################## Demat Account Landing Page #######################
@DematAccountLanding
Scenario: Verify the demat-account Account landing page is loads successfully
    Given I am on the Demat Account Landing Page.
    When the DALpage loads completely.
    Then the title of the DALpage should be "Open Demat Account Online | mStock".
    And DAL URL should be "https://www.mstock.com/sem-landing/demat-account".
    And DALpage should contain a heading "Open Your Demat Account".
    And DALPage should contain a button "Open Demat Account".
 

When we enter phone number in mobile field.
Then User should redirect on OTP screen page1..
 
Scenario: Verify the Scrolling and Shuffling Tab

When The user scrolls down page and clicks on the tab.
Then The tabs should be clickable and images should display properly.
 
Scenario: Verify the Second Phone Number Field

When we enters phone number and click on the Open Account button.
Then User should redirect on the second OTP screen page.
 
Scenario: Verify the FAQs

When The user clicks on the FAQ down arrows.
Then Arrows should be clickable and the answer should be displayed.
 
Scenario: Verify the footer CTA is clickable

When User click on the CTA present in DALfooter.
Then User should nevigate on respective page then page loads successfully.


     ######################## Trading Account page #######################

 @TradingAccount
Scenario: Verify the Trading Account page is loads successfully
    Given I am on the Trading Account Page.
   Then verify the title of the page should be "Trading Account"
   And Page URL should be "https://www.mstock.com/sem-landing/trading-account".
   And Validate page should contain a heading "Open Your Demat Account".
   And Verify how much time takes to load the page.
    
    ######################## 6_Zero Brokerage #######################
    @ZeroBrokerage
Scenario: Verify the Zero Brokerage page is loads successfully
    Given I am on the Zero Brokerage Page.
    When Page loads successfully.
    Then verify the page title should be "Zero Brokerage" 
    And Page URL should be6 "https://www.mstock.com/sem-landing/zero-brokerage"
    And Validate page should contain a heading6 "Open Your Demat Account"
    And Verify how much time takes to load the page6
    
    ##################### Main Page ##################
    @MstockPage
    Scenario: Verify the Mstock Main Page is loads successfully
    Given I am on the Mstock Main Page.
     When we enter Mobile number on Main Page and click on Open your demat account button.
     Then User should redirect on respective OTP screen page.
    And Verify how much time it takes to load the Mstock main Page
    And verify the Mstock main Page title should "Mstock main page" 
    And Mstock main Page URL should be "https://www.mstock.com/"
    And Validate Mstock Main Page should contain a heading "Open Your Demat Account"
  
   
   ##################### Organic SEM Open demat account ##################
   @SEMOpendemataccount
   Scenario: Verify the Organic SEM Open demat account page is loads successfully
    Given I am on the Organic SEM Open demat account Page.
    When we enter Mobile number in Organic SEM Open demat account and click on Open your demat account button.
     Then User should be redirect on OTP screen page.
    And Verify how much time takes for load the Organic SEM Open demat account Page
    And verify the Organic SEM Open demat account Page title should "Open demat account" 
    And Organic SEM Open demat account Page URL should be "https://www.mstock.com/open-demat-account"
    And Validate Organic SEM Open demat account Page should contain a heading "Open Your Demat Account"
   
    
    #################### Margin trading facility #######################
    @MTF
       Scenario: Verify the Margin trading facility page is loads successfully
    Given I am on the Margin trading facility Page.
    When we enter Mobile number and click on Open your demat account button.
     Then User should redirect on OTP screen page.
    And Verify how much time takes to load the Margin trading facility Page
    And verify the Margin trading facility Page title should "Margin trading facility page" 
    And Margin trading facility Page URL should be "https://www.mstock.com/margin-trading-facility"
    And Validate Margin trading facility Page should contain a heading "Open Your Demat Account"
    
    #########################  Refer and earn ################
    @RaN
    Scenario: Verify theRefer and earn page is loads successfully
    Given I am on the Refer and earn Page.
    When User enter Mobile number and click on Open your demat account button.
    Then system should redirect on OTP screen page.
    And Verify how much time takes to load the Refer and earn Page
    And verify the Refer and earn Page title should "Mstock main page" 
    And Refer and earn Page URL should be "https://www.mstock.com/refer-and-earn"
    And Validate Refer and earn Page should contain a heading "Open Your Demat Account"
    
    
      #########################  Pricing ################
      @Pricing
     Scenario: Verify thePricing page is loads successfully
    Given I am on the Pricing Page.
    When User enter Mobile number then click on Open your demat account button.
    Then system should redirect on enter OTP screen page.
    And Verify how much time takes to load the Pricing Page
    And verify the Pricing Page title should "Mstock main page" 
    And Pricing Page URL should be "https://www.mstock.com/pricing"
    And Validate Pricing Page should contain a heading "Open Your Demat Account"  
    
    #################### Mutual fund investments #############################
    @MF
    Scenario: Verify the Mutual fund investment page is loads successfully.
    Given I am on the Mutual fund investment Page.
    When User must enter Mobile number then click on Open your demat account button.
    Then system should redirect on enter OTP screen page and verify the screen.
    And Verify how much time takes to load the Mutual fund investment Page
    And verify the Mutual fund investment Page title should "Mutual fund investments" 
    And Mutual fund investment Page URL should be "https://www.mstock.com/mutual-fund-investments"
    And Validate Mutual fund investment Page should contain a heading "Open Your Demat Account"  
    
    
    ##################### Margin trading facility calculator ###################
    @MTFCalculator 
   
    Scenario: Verify the Pricing page is loads successfully
    Given I am on the MTF Calculator Page.
    When User should enter Mobile number then click on Open your demat account button.
    Then system should redirected on enter OTP screen page.
    And Verify how much time takes to load the MTF Calculator Page
    And verify the MTF Calculator Page title should "MTF Calculator page" 
    And MTF Calculator Page URL should be "https://www.mstock.com/margin-trading-facility/mtf-calculator"
    And Validate MTF Calculator Page should contain a heading "Open Your Demat Account"  
    
    
    
    