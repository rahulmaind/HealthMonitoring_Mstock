package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DematAccount_4_POM 
{
	WebDriver driver;
	@FindBy(id ="txtMobileNo") 
	private WebElement Enterno;
	
	@FindBy(tagName="H1")
	private WebElement heading;
	
	@FindBy(id = "openAccountBtn")
	private WebElement OpenAccBtn;
	private WebDriverWait wait;
	
	
	@FindBy(xpath="//div[@class='input-block']//div[1]//h2")
	private WebElement OTPpage;

	
	@FindBy(xpath="//ul[@class='PowerfulFeaturesSec_tabNavStrip__8HMxE']//li[2]")
	private WebElement Listtab2;
	
	@FindBy(xpath="//ul[@class='PowerfulFeaturesSec_tabNavStrip__8HMxE']//li[3]")
	private WebElement Listtab3;
	
	@FindBy(xpath="//ul[@class='PowerfulFeaturesSec_tabNavStrip__8HMxE']//li[4]")
	private WebElement Listtab4;
	
	
	@FindBy(xpath="//div[@class='accFormWrap']//div[1]//div//div//div//div//input")
	private WebElement txtmob2;
	@FindBy(xpath="(//button[text()=\"Open Demat Account\"])[2]")
	private WebElement openacc2btn;
	
	@FindBy(xpath="//*[@id=\"MainContent_loginbox3\"]/div/div[1]/div/h2")
	private WebElement OTPpage2;
	
	@FindBy(xpath ="(//i[@class=\"Faq_rc-accordion-icon__W1AuE\"])[2]")
	private WebElement faqicon;
	
	
	@FindBy(xpath ="(//div[@class=\"Faq_rc-accordion-body__s574Y\"]//span)[2]")
	private WebElement faq;
	
	@FindBy(tagName ="a")
	private List<WebElement> link;
	
	@FindBy(xpath="//a[text()=\"Mirae Asset Mutual Funds\"]")
	private WebElement FCTA;
	
	
	
 	public DematAccount_4_POM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	 public String featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 
	 public String featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }
	 public String featchHeading() {
			return heading.getText();
	 }
	 
	 public void button1() {
		
		 boolean b2=OpenAccBtn.isDisplayed();
		 System.out.println(b2);
		 }
	 
	 
     public void Enter() throws InterruptedException {
    	 Enterno.sendKeys("9522451235");
    	 Thread.sleep(2000);
    	 OpenAccBtn.click();
    	 Thread.sleep(3000);
     }
     
     public void otppage() {
    	 
    	 System.out.println(OTPpage.getText());
    	 
    	 driver.navigate().back();
    	 
 
     }
     
     public void Scroll() {
    		JavascriptExecutor js=(JavascriptExecutor)driver;
       	 js.executeScript("window.scrollBy(0,1000)");
     }

     
     
     public void listtab2() throws InterruptedException {
    	 Listtab2.click();
    	 String l2=Listtab2.getText();
    	 System.out.println("Title of List Tab 2 is = " +l2+ "It is clickable");
    	 Thread.sleep(1000);
    	
     }
     
     
     public void listtab3() throws InterruptedException {
    	 Listtab3.click();
    	 String l3=Listtab3.getText();
    	 System.out.println("Title of List Tab 3 is = " +l3+ "It is clickable");
    	 Thread.sleep(1000);
     }
     
     
     
     public void listtab4() throws InterruptedException {
    	 Listtab4.click();
    	 String l4=Listtab4.getText();
    	 System.out.println("Title of List Tab 4 is  = " +l4+ "It is clickable");
    	 Thread.sleep(1000);
     }
     
     
     public void mobile2() throws InterruptedException {
    	 txtmob2.sendKeys("9653625369"); 
    	 Thread.sleep(2000);
    	 //System.out.println("Enter mobile number 2:" + txtmob2.getText());
    	
    	 openacc2btn.click();
     }
     
	public void otppage2() throws InterruptedException {
		    	 
		    	// System.out.println(OTPpage2.getText());
		    	 Thread.sleep(2000);
		    	 driver.navigate().back();
		    	 Thread.sleep(2000);
		}
		
	public void verifyFAQ() throws InterruptedException {
	
		faqicon.click();
		Thread.sleep(3000);
	}
	
	public void faqAnswer() {
		
		String ans=faq.getText();
		System.out.println(ans);
		Boolean b=ans.isBlank();
		System.out.println("ANSWER IS DISPLAYED:" +b);
		
	}
		 
	public void footerlink() {
	
		
		List<WebElement>totallink= link;
		System.out.println("NUMBER OF LINK AVAILABLE IN PAGE IS : "+totallink.size());
		
	}
		
	public void footerCTA() {
		FCTA.click();
	}

    public void pageload() throws InterruptedException {
    	
    	System.out.println( "FOOTER LINK PAGE TITLE IS:" +driver.getTitle());
    	Thread.sleep(3000);
		driver.navigate().back();
	
	}
     
}
