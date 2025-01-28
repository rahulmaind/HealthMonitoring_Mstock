package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Trading_account_5_POM;

public class Trading_Account_5 {
	
	Trading_account_5_POM trading = new Trading_account_5_POM(DriverFactory.getDriver());
	WebDriver driver=DriverFactory.getDriver();
	//String url="https://www.mstock.com/sem-landing/demat-account";
	
	
	//***************Demat Account Landing Page**********************//
	@Given("I am on the trading Account Landing Page.")
	public void i_am_on_the_trading_account_landing_page() {
		//WebDriver driver=DriverFactory.getDriver();
		WebDriver driver=DriverFactory.getDriver();
		String url="https://www.mstock.com/sem-landing/demat-account";
	}

	@When("the DALpage loads completely.")
	public void the_DALpage_loads_completely() {
	System.out.println(trading.featchtitle());
		
		  
	}

	@Then("the title of the DALpage should be {string}.")
	public void the_title_of_the_DALpage_should_be(String string) {
		System.out.println(trading.DALfeatchtitle());
	   
	}

	@Then("DAL URL should be {string}.")
	public void dal_url_should_be(String string) {
		System.out.println(trading.DALfeatchurl());
	}

	@Then("DALpage should contain a heading {string}.")
	public void dalpage_should_contain_a_heading(String string) {
	   System.out.println(trading.DALfeatchHeading());
	}

	@Then("DALPage should contain a button {string}.")
	public void dalpage_should_contain_a_button(String string) {
	 trading.DALbutton1();
	}



	@When("we enter phone number in mobile field.")
	public void we_enter_phone_number_in_mobile_filed() throws InterruptedException {
		
		trading.Enter();
		
	}

	@Then("User should redirect on OTP screen page1..")
	public void user_should_redirect_on_otp_screen_page1() {
	  trading.otppage();
	  
	}

	@When("The user scrolls down page and clicks on the tab.")
	public void the_user_scrolls_down_page_and_clicks_on_the_tab() {
	   trading.Scroll();
	}

	@Then("The tabs should be clickable and images should display properly.")
	public void the_tabs_should_be_clickable_and_images_should_display_properly() throws InterruptedException {
	   trading.listtab2();
	   trading.listtab3();
	   trading.listtab4();
	}

	@When("we enters phone number and click on the Open Account button.")
	public void we_enters_phone_number_and_click_on_the_open_account_button() throws InterruptedException {
	   trading.mobile2();
	}

	@Then("User should redirect on the second OTP screen page.")
	public void user_should_redirect_on_the_second_otp_screen_page() throws InterruptedException {
	   trading.otppage2();
	}

	@When("The user clicks on the FAQ down arrows.")
	public void the_user_clicks_on_the_faq_down_arrows() throws InterruptedException {
	   trading.verifyFAQ();
	}

	@Then("Arrows should be clickable and the answer should be displayed.")
	public void arrows_should_be_clickable_and_the_answer_should_be_displayed() {
	   trading.faqAnswer();
	}



	@When("User click on the CTA present in DALfooter.")
	public void user_click_on_the_cta_present_in_footer() {
		trading.footerlink();
		trading.footerCTA();
	}

	@Then("User should nevigate on respective page then page loads successfully.")
	public void user_should_nevigate_on_respective_page_then_page_loads_successfully() throws InterruptedException {
	 trading.pageload();
	}
	
	//***************Trading Account Page**********************//
	
	@Given("I am on the Trading Account Page.")
	public void i_am_on_the_trading_account_page() {
		
		driver.get("https://www.mstock.com/sem-landing/trading-account");
	}

	@When("Element on page loads completely.")
	public void element_on_page_loads_completely() {
	    trading.featchtitle();
	}

	@Then("verify the title of the page should be {string}")
	public void verify_the_title_of_the_page_should_be(String string) {
		 trading.featchtitle(); 
	}

	@Then("Page URL should be {string}.")
	public void page_url_should_be(String string) {
		trading.featchurl();
	}

	@Then("Validate page should contain a heading {string}.")
	public void validate_page_should_contain_a_heading(String string) {
	  trading.featchtitle();
	  trading.button1();
	}

	@Then("Verify how much time takes to load the page.")
	public void verify_how_much_time_takes_to_load_the_page() {
		trading.loadtime();
		
			    
	}
	
	 //***************Page_6_Zero brokerage**********************//
	
	@Given("I am on the Zero Brokerage Page.")
	public void i_am_on_the_zero_brokerage_page() {
		driver.get("https://www.mstock.com/sem-landing/zero-brokerage");  
	}

	@Then("Verify how much time takes to load the page6")
	public void verify_how_much_time_takes_to_load_the_page6() {
	   trading.zb_loadtime();
	}
	
	
	@When("Page loads successfully.")
	public void page_loads_successfully() {
	    trading.zb_featchtitle();
	}

	@Then("verify the page title should be {string}")
	public void verify_the_page_title_should_be(String string) {
		  trading.zb_featchtitle();
	}

	@Then("Page URL should be6 {string}")
	public void page_url_should_be6(String string) {
	   trading.zb_featchurl(); 
	}

	@Then("Validate page should contain a heading6 {string}")
	public void validate_page_should_contain_a_heading6(String string) {
	    trading.zb_featchHeading();
	    trading.zb_Opendemataccount();
	}

	 //***************Mstock Main Page**********************//
	
	@Given("I am on the Mstock Main Page.")
	public void i_am_on_the_mstock_main_page() {
	   driver.get("https://www.mstock.com/");
	  
	    
	}
	
	@Then("Verify how much time it takes to load the Mstock main Page")
	public void verify_how_much_time_it_takes_to_load_the_mstock_main_page() {
	     trading.mstock_loadtime();
	    
	}

	@When("we enter Mobile number on Main Page and click on Open your demat account button.")
	public void we_enter_mobile_number_on_main_page_and_click_on_open_your_demat_account_button() throws InterruptedException {
		 trading.mstock_Opendemataccount();
		     
	    
	}

	@Then("User should redirect on respective OTP screen page.")
	public void user_should_redirect_on_respective_otp_screen_page() {
	     trading.verifyotpPage();
	     
	    
	}
	

	@Then("verify the Mstock main Page title should {string}")
	public void verify_the_mstock_main_page_title_should(String string) {
	     trading.mstock_featchtitle();
	    
	}

	@Then("Mstock main Page URL should be {string}")
	public void mstock_main_page_url_should_be(String string) {
	     
	    trading.mstock_featchurl();
	}

	@Then("Validate Mstock Main Page should contain a heading {string}")
	public void validate_mstock_main_page_should_contain_a_heading(String string) {
	     trading.mstock_featchHeading();
	    
	}

	
	/******************** Organic SEM Open demat account***************/
	
	@Given("I am on the Organic SEM Open demat account Page.")
	public void i_am_on_the_organic_sem_open_demat_account_page() {
	     driver.get("https://www.mstock.com/open-demat-account");
	    
	}

	@When("we enter Mobile number in Organic SEM Open demat account and click on Open your demat account button.")
	public void we_enter_mobile_number_in_organic_sem_open_demat_account_and_click_on_open_your_demat_account_button() throws InterruptedException {
	     trading.SEMODA_Opendemataccount();
	    
	}

	@Then("User should be redirect on OTP screen page.")
	public void user_should_be_redirect_on_otp_screen_page() throws InterruptedException {
	     trading.SEMODA_verifyotpPage();
	    
	}

	@Then("Verify how much time takes for load the Organic SEM Open demat account Page")
	public void verify_how_much_time_takes_for_load_the_organic_sem_open_demat_account_page() {
	     trading.SEMODA_loadtime();
	    
	}

	@Then("verify the Organic SEM Open demat account Page title should {string}")
	public void verify_the_organic_sem_open_demat_account_page_title_should(String string) {
	     trading.SEMODA_featchtitle();
	    
	}

	@Then("Organic SEM Open demat account Page URL should be {string}")
	public void organic_sem_open_demat_account_page_url_should_be(String string) {
	     trading.SEMODA_featchurl();
	    
	}

	@Then("Validate Organic SEM Open demat account Page should contain a heading {string}")
	public void validate_organic_sem_open_demat_account_page_should_contain_a_heading(String string) {
	     trading.SEMODA_featchHeading();
	    
	}
	
	
	
	//******************************Margin trading facility ************/
	@Given("I am on the Margin trading facility Page.")
	public void i_am_on_the_margin_trading_facility_page() {
	     driver.get("https://www.mstock.com/margin-trading-facility");
	    
	}
	
	

	@When("we enter Mobile number and click on Open your demat account button.")
	public void we_enter_mobile_number_and_click_on_open_your_demat_account_button() throws InterruptedException {
	     
	    trading.MTF_Opendemataccount();
	}

	@Then("User should redirect on OTP screen page.")
	public void user_should_redirect_on_otp_screen_page() throws InterruptedException {
	     trading.MTF_verifyotpPage();
	    
	}

	@Then("Verify how much time takes to load the Margin trading facility Page")
	public void verify_how_much_time_takes_to_load_the_margin_trading_facility_page() {
	     trading.MTF_loadtime();
	    
	}

	@Then("Margin trading facility Page URL should be {string}")
	public void margin_trading_facility_page_url_should_be(String string) {
	     trading.MTF_featchurl();
	    
	}
	
	@Then("verify the Margin trading facility Page title should {string}")
	public void verify_the_margin_trading_facility_page_title_should(String string) {
	     trading.MTF_featchtitle();
	    
	}



	@Then("Validate Margin trading facility Page should contain a heading {string}")
	public void validate_margin_trading_facility_page_should_contain_a_heading(String string) {
	   trading.MTF_featchHeading();  
	    
	}

	
	//************************ Refer and earn    ********************************//
	
	@Given("I am on the Refer and earn Page.")
	public void i_am_on_the_refer_and_earn_page() {
	     driver.get("https://www.mstock.com/refer-and-earn");
	    
	}

	@When("User enter Mobile number and click on Open your demat account button.")
	public void user_enter_mobile_number_and_click_on_open_your_demat_account_button() throws InterruptedException {
	     trading.RaN_Opendemataccount();
	    
	}

	@Then("system should redirect on OTP screen page.")
	public void system_should_redirect_on_otp_screen_page() throws InterruptedException {
	     trading.RaN_verifyotpPage();
	    
	}

	@Then("Verify how much time takes to load the Refer and earn Page")
	public void verify_how_much_time_takes_to_load_the_refer_and_earn_page() {
	     trading.RaN_loadtime();
	    
	}

	@Then("verify the Refer and earn Page title should {string}")
	public void verify_the_refer_and_earn_page_title_should(String string) {
	     trading.RaN_featchtitle();
	    
	}

	@Then("Refer and earn Page URL should be {string}")
	public void refer_and_earn_page_url_should_be(String string) {
	    trading.RaN_featchurl(); 
	    
	}

	@Then("Validate Refer and earn Page should contain a heading {string}")
	public void validate_refer_and_earn_page_should_contain_a_heading(String string) {
	     trading.RaN_featchHeading();
	    
	}

	
	
	//*********************************Pricing **************//
	
	@Given("I am on the Pricing Page.")
	public void i_am_on_the_pricing_page() {
	    driver.get("https://www.mstock.com/pricing"); 
	    
	}

	@When("User enter Mobile number then click on Open your demat account button.")
	public void user_enter_mobile_number_then_click_on_open_your_demat_account_button() throws InterruptedException {
	   trading.PRZ_Opendemataccount();  
	    
	}

	@Then("system should redirect on enter OTP screen page.")
	public void system_should_redirect_on_enter_otp_screen_page() throws InterruptedException {
	     trading.PRZ_verifyotpPage();
	    
	}

	@Then("Verify how much time takes to load the Pricing Page")
	public void verify_how_much_time_takes_to_load_the_pricing_page() {
	   trading.PRZ_loadtime();  
	    
	}

	@Then("verify the Pricing Page title should {string}")
	public void verify_the_pricing_page_title_should(String string) {
	     trading.PRZ_featchtitle();
	    
	}

	@Then("Pricing Page URL should be {string}")
	public void pricing_page_url_should_be(String string) {
	   trading.PRZ_featchurl();  
	    
	}

	@Then("Validate Pricing Page should contain a heading {string}")
	public void validate_pricing_page_should_contain_a_heading(String string) {
	     trading.PRZ_featchHeading();
	    
	}

	
	//*********************** Mutual fund investments ********************************//
	
	@Given("I am on the Mutual fund investment Page.")
	public void i_am_on_the_mutual_fund_investment_page() {
		driver.get("https://www.mstock.com/mutual-fund-investments");
	        
	}

	@When("User must enter Mobile number then click on Open your demat account button.")
	public void user_must_enter_mobile_number_then_click_on_open_your_demat_account_button() throws InterruptedException {
	      trading.MF_Opendemataccount(); 
	        
	}

	@Then("system should redirect on enter OTP screen page and verify the screen.")
	public void system_should_redirect_on_enter_otp_screen_page_and_verify_the_screen() throws InterruptedException {
	       trading.MF_verifyotpPage();
	        
	}

	@Then("Verify how much time takes to load the Mutual fund investment Page")
	public void verify_how_much_time_takes_to_load_the_mutual_fund_investment_page() {
	       trading.MF_loadtime();
	        
	}

	@Then("verify the Mutual fund investment Page title should {string}")
	public void verify_the_mutual_fund_investment_page_title_should(String string) {
	      trading.MF_featchtitle(); 
	        
	}

	@Then("Mutual fund investment Page URL should be {string}")
	public void mutual_fund_investment_page_url_should_be(String string) {
	       trading.MF_featchurl();
	        
	}

	@Then("Validate Mutual fund investment Page should contain a heading {string}")
	public void validate_mutual_fund_investment_page_should_contain_a_heading(String string) {
	       trading.MF_featchHeading();
	        
	}

	
	
	//*********************** Margin trading facility calculator ********************************//
	
	@Given("I am on the MTF Calculator Page.")
	public void i_am_on_the_mtf_calculator_page() {
	   driver.get("https://www.mstock.com/margin-trading-facility/mtf-calculator");    
	        
	}

	@When("User should enter Mobile number then click on Open your demat account button.")
	public void user_should_enter_mobile_number_then_click_on_open_your_demat_account_button() throws InterruptedException {
	       trading.MTFCalc_Opendemataccount();
	        
	}

	@Then("system should redirected on enter OTP screen page.")
	public void system_should_redirected_on_enter_otp_screen_page() throws InterruptedException {
	       trading.MTFCalc_verifyotpPage();
	        
	}

	@Then("Verify how much time takes to load the MTF Calculator Page")
	public void verify_how_much_time_takes_to_load_the_mtf_calculator_page() {
	       trading.MTFCalc_loadtime();
	        
	}

	@Then("verify the MTF Calculator Page title should {string}")
	public void verify_the_mtf_calculator_page_title_should(String string) {
	       trading.MTFCalc_featchtitle();
	        
	}

	@Then("MTF Calculator Page URL should be {string}")
	public void mtf_calculator_page_url_should_be(String string) {
	       trading.MTFCalc_featchurl();
	        
	}

	@Then("Validate MTF Calculator Page should contain a heading {string}")
	public void validate_mtf_calculator_page_should_contain_a_heading(String string) {
	    trading.MTFCalc_featchHeading();   
	        
	}
}