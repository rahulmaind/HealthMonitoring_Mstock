package steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Help_module_POM;

public class Help_Module {

	
	
	Help_module_POM help =new Help_module_POM(DriverFactory.getDriver());
	WebDriver driver=DriverFactory.getDriver();
	 public WebDriverWait wait;
	
	 // driver.get("https://trade.mstock.com/#/login");
	
	
	@Given("User is on Mstock login page")
	public void user_is_on_mstock_login_page() throws InterruptedException {
	     driver.get("https://trade.mirae-asset.co.in/#/login");
	     help.pophandle();
	     Thread.sleep(2000);
	}

	@When("User entered valid email and password")
	public void user_entered_valid_email_and_password() throws InterruptedException {
	     help.enterUsername();
	     Thread.sleep(2000);
	     help.enterPass();
	     Thread.sleep(2000);
	     help.clickLogin();
	}

//	@Then("User should navigate to OTP page and verfy the OTP.")
//	public void user_should_navigate_to_otp_page_and_verfy_the_otp() {
//	     
//	     
//	}

	@Then("Accept the Risk Disclosure Darivative pop up.")
	public void accept_the_risk_disclosure_darivative_pop_up() throws InterruptedException {
	     help.clickContinue();
	     
	}

	@Then("User should see a mStock home page.")
	public void user_should_see_a_m_stock_home_page() throws InterruptedException {
		help.homepage();
	     
	}

	@When("Click on home page hamburger menu.")
	public void click_on_home_pahe_hamburger_menu() throws InterruptedException {
		help.clickhamburger();
	     
	}

	@When("select the Help menu.")
	public void select_the_help_menu() throws InterruptedException {
	     help.clickHelp();
	     
	}

	@Then("Help main page should open.")
	public void help_main_page_should_open() throws InterruptedException {
	     help.helpMainPage();
	     
	}

	@Then("verify the time taken for load the help page.")
	public void verify_the_time_taken_for_load_the_help_page() {
	    help.helppageloadtime(); 
	     
	}

	@When("user scroll the page and click on the Write to us here link.")
	public void user_scroll_the_page_and_click_on_the_write_to_us_here_link() throws InterruptedException {
	     help.scrolldownhelppage();
	     
	}

	@Then("Input box should open and editable.")
	public void input_box_should_open_and_editable() {
		help.queryTextInput(); 
	     
	}

	@When("user added the input, attachment and click on Raise button.")
	public void user_added_the_input_attachment_and_click_on_raise_button() throws InterruptedException {
	     help.addAttachquery();
	     
	}

	@Then("Attachment should be display below input box.")
	public void attachment_should_be_display_below_input_box() throws InterruptedException, AWTException {
	     help.uploaddoc();
	     
	}

	@Then("Success pop up msg should be display and verified.")
	public void success_pop_up_msg_should_be_display_and_verified() throws InterruptedException {
	     help.querypopup1();
	     
	}

	@Then("verify the success pop up load time.")
	public void verify_the_success_pop_up_load_time() throws InterruptedException {
	     //help.popuploadtimee();
	     
	}

	@When("User is on Help page and click on trade arrow button under Have a Query? section")
	public void user_is_on_help_page_and_click_on_trade_arrow_button_under_have_a_query_section() throws InterruptedException {
		
	     help.tradearrowClick();
	     
	}

	@Then("System should navigate on trade Details page.")
	public void system_should_navigate_on_trade_details_page() {
	  help.Navigatetradedetailspage();   
	     
	}

	@Then("Scroll down the page till the bottom.")
	public void scroll_down_the_page_till_the_bottom() throws InterruptedException {
	     help.tradedetailscrolldown();
	     
	}

	@When("user add the input, attachment and click on Raise button.")
	public void user_add_the_input_attachment_and_click_on_raise_button() throws InterruptedException, AWTException {
	     help.tradequeryTextInput();
	     help.tradeaddAttachquery();
         help.tradeuploaddoc();
	     
	}

	@Then("Attachment name with delete icon should be display below input box.")
	public void attachment_name_with_delete_icon_should_be_display_below_input_box() throws InterruptedException {
	     help.trd_uplo_file_name();
	     
	}

	@Then("Success pop up message should be display and verified.")
	public void success_pop_up_message_should_be_display_and_verified() throws InterruptedException {
		help.trade_querypopup1();
	}

	@Then("verify the success message pop up load time.")
	public void verify_the_success_message_pop_up_load_time() {
	     
	     
	}

	@When("user scroll down the help page till All Your Queries section.")
	public void user_scroll_down_the_help_page_till_all_your_queries_section() throws InterruptedException {
	     help.Scroll_till_AYQ();
	     
	}

	@Then("Verify the Queries are listed in All Your Queries section.")
	public void verify_the_queries_are_listed_in_all_your_queries_section() {
		help.verifyQuery();
	     
	}

	
}
