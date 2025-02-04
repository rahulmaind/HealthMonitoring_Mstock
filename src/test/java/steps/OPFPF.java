package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.Help_module_POM;
import pom.OPFPF_POM;

public class OPFPF {

	
	OPFPF_POM onscreen =new OPFPF_POM(DriverFactory.getDriver());
	WebDriver driver=DriverFactory.getDriver();
	 public WebDriverWait wait;
	
	
	@Given("User is on Mstock Website login page.")
	public void user_is_on_mstock_website_login_page() throws InterruptedException {
		 driver.get("https://trade.mirae-asset.co.in/#/login");
		 onscreen.pophandle();
	     Thread.sleep(2000);
	}

	@When("User entered valid email id and password.")
	public void user_entered_valid_email_id_and_password() throws InterruptedException {
		onscreen.enterUsername();
	     Thread.sleep(2000);
	     onscreen.enterPass();
	     Thread.sleep(2000);
	     onscreen.clickLogin();
	}

	@When("Accepted the Risk Disclosure Darivative pop up")
	public void accepted_the_risk_disclosure_darivative_pop_up() throws InterruptedException {
		onscreen.clickContinue();
	}

	@When("User should redirect on a mStock home page")
	public void user_should_redirect_on_a_m_stock_home_page() throws InterruptedException {
		onscreen.homepage();
	}

	@When("user click on Order tab")
	public void user_click_on_order_tab() throws InterruptedException {
	   onscreen.ordClick();
	}
	
	
	@When("click on Order related queries?")
	public void click_on_order_related_queries() throws InterruptedException {
	   onscreen.ord_rel_query();
	}

	@Then("Verify Orders - FAQs pop is opened.")
	public void verify_orders_fa_qs_pop_is_opened() {
	  onscreen.popupfaq();
	}

	@When("user click on FAQ question arrow button")
	public void user_click_on_faq_question_arrow_button() throws InterruptedException {
	    onscreen.ord_arrowOClick();
	}

	@Then("FAQ should expand and by clicking here. link should be visible.")
	public void faq_should_expand_and_by_clicking_here_link_should_be_visible() {
	    onscreen.link_Visibility();
	}

	@When("user click in by clicking here. link")
	public void user_click_in_by_clicking_here_link() throws InterruptedException {
	   onscreen.by_clicking_here();
	}

	@Then("Input text box should open and editable.")
	public void input_text_box_should_open_and_editable() {
	    onscreen.verify_textarea();
	}

	@When("user added the input, attachment and click on Raise query button.")
	public void user_added_the_input_attachment_and_click_on_raise_query_button() throws InterruptedException {
	    onscreen.ord_enterquery();
	    Thread.sleep(1000);
	    onscreen.ord_attch_file();
	    Thread.sleep(1000);
	    onscreen.ord_raise_click();
	}

	@Then("Attachment should be added and display below input box.")
	public void attachment_should_be_added_and_display_below_input_box() throws InterruptedException {
		
		onscreen.ord_upload_img();
	}

	@Then("Success pop up messege should be display and verified.")
	public void success_pop_up_messege_should_be_display_and_verified() {
	   
	}

	@Then("verify load time of the success pop up.")
	public void verify_load_time_of_the_success_pop_up() {
	    
	}
	
	
	//************************ positions***************************//

	@When("user click on positions tab")
	public void user_click_on_positions_tab() throws InterruptedException {
		onscreen.posClick();
	    
	}

	@When("click on positions related queries?")
	public void click_on_positions_related_queries() throws InterruptedException {
		 onscreen.pos_rel_query();
	    
	}

	@Then("Verify positions - FAQs pop is opened.")
	public void verify_positions_fa_qs_pop_is_opened() {
	     onscreen.pos_popupfaq();
	    
	}

	@When("user click on positions FAQ question arrow button")
	public void user_click_on_positions_faq_question_arrow_button() throws InterruptedException {
	     onscreen.pos_arrowOClick();
	    
	}

	@Then("positions FAQ should expand and by clicking here. link should be visible.")
	public void positions_faq_should_expand_and_by_clicking_here_link_should_be_visible() {
	     onscreen.pos_link_Visibility();
	    
	}

	@When("user click on by clicking here. link")
	public void user_click_on_by_clicking_here_link() throws InterruptedException {
	    onscreen.pos_by_clicking_here(); 
	    
	}

	@Then("Input text box to write query should open and editable.")
	public void input_text_box_to_write_query_should_open_and_editable() {
	     onscreen.pos_verify_textarea();
	    
	}

	@When("user added the input query, attachment and click on Raise query button.")
	public void user_added_the_input_query_attachment_and_click_on_raise_query_button() throws InterruptedException {
	     onscreen.pos_enterquery();
	    
	}

	@Then("Attachment for positions FAQ should be added and display below input box.")
	public void attachment_for_positions_faq_should_be_added_and_display_below_input_box() throws InterruptedException {
	     onscreen.pos_attch_file();
	    
	}

	@Then("Post click on Raised button Success pop up messege should be display and verified.")
	public void post_click_on_raised_button_success_pop_up_messege_should_be_display_and_verified() throws InterruptedException {
	     onscreen.pos_raise_click();
	     
	    
	}

	@Then("verify load time of the positions success pop up.")
	public void verify_load_time_of_the_positions_success_pop_up() throws InterruptedException {
	  onscreen.pos_upload_img();   
	    
	}
	
	//************************ portfolio***************************//
	
	@When("user click on portfolio tab")
	public void user_click_on_portfolio_tab() throws InterruptedException {
	      onscreen.porClick();
	      
	}

	@When("click on portfolio related queries?")
	public void click_on_portfolio_related_queries() throws InterruptedException {
	      onscreen.por_rel_query();
	      
	}

	@Then("Verify portfolio - FAQs pop is opened.")
	public void verify_portfolio_fa_qs_pop_is_opened() {
	      onscreen.por_popupfaq();
	      
	}

	@When("user click on portfolio FAQ question arrow button")
	public void user_click_on_portfolio_faq_question_arrow_button() throws InterruptedException {
	      onscreen.por_arrowOClick();
	      
	}

	@Then("portfolio FAQ should expand and by clicking here. link should be visible.")
	public void portfolio_faq_should_expand_and_by_clicking_here_link_should_be_visible() {
	     onscreen.por_link_Visibility(); 
	      
	}

	@When("user click on the click here. link")
	public void user_click_on_the_click_here_link() throws InterruptedException {
	      onscreen.por_by_clicking_here();
	      
	}

	@Then("Input text box for write query should open and editable.")
	public void input_text_box_for_write_query_should_open_and_editable() {
	      onscreen.por_verify_textarea();
	      
	}

	@When("user added the query, attachment and click on Raise query button.")
	public void user_added_the_query_attachment_and_click_on_raise_query_button() throws InterruptedException {
	      onscreen.por_enterquery();
	      
	}

	@Then("Attachment for portfolio FAQ should be added and display below input box.")
	public void attachment_for_portfolio_faq_should_be_added_and_display_below_input_box() throws InterruptedException {
	      
	      onscreen.por_attch_file();
	}

	@Then("Post click on Raised query button Success pop up messege should be display and verified.")
	public void post_click_on_raised_query_button_success_pop_up_messege_should_be_display_and_verified() throws InterruptedException {
	      onscreen.por_raise_click();
	      
	}

	@Then("verify load time of the portfolio success pop up.")
	public void verify_load_time_of_the_portfolio_success_pop_up() throws InterruptedException {
	      onscreen.por_upload_img();
	      
	}
	
	//************************ funds***************************//
	
	@When("user click on funds tab")
	public void user_click_on_funds_tab() throws InterruptedException {
	   onscreen.fundsClick();   
	      
	}

	@When("click on funds related queries?")
	public void click_on_funds_related_queries() throws InterruptedException {
	      
	     onscreen.funds_rel_query(); 
	}

	@Then("Verify funds - FAQs pop is opened.")
	public void verify_funds_fa_qs_pop_is_opened() {
	      onscreen.funds_popupfaq();
	      
	}

	@When("user click on funds FAQ question arrow button")
	public void user_click_on_funds_faq_question_arrow_button() throws InterruptedException {
	    onscreen.funds_arrowOClick();  
	      
	}

	@Then("FAQ should expand and {string} link should be visible.")
	public void faq_should_expand_and_link_should_be_visible(String string) {
	      onscreen.funds_link_Visibility();
	      
	}

	@When("user click on the by clicking here. link")
	public void user_click_on_the_by_clicking_here_link() throws InterruptedException {
	     onscreen.funds_by_clicking_here(); 
	      
	}

	@Then("Query Input text box should open and editable.")
	public void query_input_text_box_should_open_and_editable() {
	    onscreen.funds_verify_textarea();  
	      
	}

	@When("user add the input, query attachment and click on Raise query button.")
	public void user_add_the_input_query_attachment_and_click_on_raise_query_button() throws InterruptedException {
	     onscreen.funds_enterquery(); 
	      
	}

	@Then("Fund query related Attachment should be added and display below input box.")
	public void query_related_attachment_should_be_added_and_display_below_input_box() throws InterruptedException {
	     onscreen.funds_attch_file(); 
	      
	}

	@Then("Success pop up messege should be display properly and verified.")
	public void success_pop_up_messege_should_be_display_properly_and_verified() throws InterruptedException {
	      onscreen.funds_raise_click();
	      
	}

	@Then("verify load time of the funds success pop up.")
	public void verify_load_time_of_the_funds_success_pop_up() throws InterruptedException {
	     onscreen.funds_upload_img(); 
	      
	}
	
	
}
