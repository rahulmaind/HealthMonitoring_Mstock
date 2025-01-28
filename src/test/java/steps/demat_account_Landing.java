package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_factory.DriverFactory;
import pom.DematAccount_4_POM;

public class demat_account_Landing 
{
	DematAccount_4_POM demat = new DematAccount_4_POM(DriverFactory.getDriver());
	
	
	@Given("I am on the Demat Account Landing Page.")
	public void i_am_on_the_demat_account_landing_page() {
		WebDriver driver=DriverFactory.getDriver();
		driver.get("https://www.mstock.com/sem-landing/demat-account");
	}

	@When("the page loads completely.")
	public void the_page_loads_completely() {
	System.out.println(demat.featchtitle());
		
		  
	}

	@Then("the title of the page should be {string}.")
	public void the_title_of_the_page_should_be(String string) {
		System.out.println(demat.featchtitle());
	   
	}

	@Then("URL should be {string}.")
	public void url_should_be(String string) {
		System.out.println(demat.featchurl());
	}

	@Then("page should contain a heading {string}.")
	public void page_should_contain_a_heading(String string) {
	   System.out.println(demat.featchHeading());
	}

	@Then("Page should contain a button {string}.")
	public void page_should_contain_a_button(String string) {
	 demat.button1();
	}



	@When("we enter phone number.")
	public void we_enter_phone_number() throws InterruptedException {
		
		demat.Enter();
		
	}

	@Then("User should redirect on OTP screen page..")
	public void user_should_redirect_on_otp_screen_page() {
	  demat.otppage();
	  
	}

	@When("The user scrolls down and clicks on the tab.")
	public void the_user_scrolls_down_and_clicks_on_the_tab() {
	   demat.Scroll();
	}

	@Then("The tab should be clickable and images should display properly.")
	public void the_tab_should_be_clickable_and_images_should_display_properly() throws InterruptedException {
	   demat.listtab2();
	   demat.listtab3();
	   demat.listtab4();
	}

	@When("we enter phone number and click on the Open Account button.")
	public void we_enter_phone_number_and_click_on_the_open_account_button() throws InterruptedException {
	   demat.mobile2();
	}

	@Then("User should redirect on second OTP screen page.")
	public void user_should_redirect_on_second_otp_screen_page() throws InterruptedException {
	   demat.otppage2();
	}

	@When("The user clicks on the FAQ down arrow.")
	public void the_user_clicks_on_the_faq_down_arrow() throws InterruptedException {
	   demat.verifyFAQ();
	}

	@Then("Arrow should be clickable and the answer should be displayed.")
	public void arrow_should_be_clickable_and_the_answer_should_be_displayed() {
	   demat.faqAnswer();
	}



	@When("User click on the CTA present in footer.")
	public void user_click_on_the_cta_present_in_footer() {
		demat.footerlink();
		demat.footerCTA();
	}

	@Then("User should nevigate on respective page and page loads successfully.")
	public void user_should_nevigate_on_respective_page_and_page_loads_successfully() throws InterruptedException {
	 demat.pageload();
	}
}


