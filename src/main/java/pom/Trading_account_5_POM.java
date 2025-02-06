package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trading_account_5_POM {
	
	
	WebDriver driver;
	
	//***************Demat Account Landing Page**********************//
	@FindBy(id ="txtMobileNo") 
	private WebElement Enterno;
	
	@FindBy(tagName="H1")
	private WebElement DALheading;
	
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
	
	
	//***************Trading Account page**********************//
	@FindBy(xpath="//button[@id=\"openAccountBtn\"]")
	private WebElement openAccountBtn;
	
	@FindBy(tagName="H1")
	private WebElement heading;
	
	
	 //***************Page_6_Zero brokerage**********************//
	
	@FindBy(xpath="//button[@id=\"openAccountBtn\"]")
	private WebElement ZBOpenaccbtn;
	
	@FindBy(tagName="H1")
	private WebElement ZBheading;
	
	//***************Mstock Main Page**********************//
	
	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement mstcokinput;
	
	@FindBy(xpath="(//button[text()='Open Demat Account'])[1]")
	private WebElement mstockOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement OTPPage;
	
	@FindBy(tagName="H1")
	private WebElement mstockheading;
	
	//******************** Organic SEM Open demat account***************//
	
	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement SEMODAmobile;
	
	@FindBy(xpath="(//button[text()='Open Demat Account'])[1]")
	private WebElement SEMODAOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement SEMODAOTPPage;
	
	@FindBy(tagName="H1")
	private WebElement SEMODAheading;
	
	//******************************Margin trading facility ************/
	

	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement MTFmobiletxt;
	
	@FindBy(xpath="(//button[text()='Open Demat Account'])[1]")
	private WebElement MTFOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement MTFOTPPage;
	
	@FindBy(tagName="H1")
	private WebElement MTFheading;
	
	//************************ Refer and earn    ********************************//
	
	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement RaNmobiletxt;
	
	@FindBy(xpath="//button[@id=\"openAccountBtn\"]")
	private WebElement RaNOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement RaNOTPPage;
	
	@FindBy(tagName="H1")
	private WebElement RaNheading;
	
	
	//*********************************Pricing **************/
	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement PRZmobiletxt;
	
	@FindBy(xpath="//button[@id=\"openAccountBtn\"]")
	private WebElement PRZOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement PRZOTPPage;
	
	@FindBy(tagName="H1")
	private WebElement PRZheading;
	
	
	
	//*********************** Mutual fund investments ********************************//
	
	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement MFmobiletxt;
	
	@FindBy(xpath="//button[@id=\"topbannerbtn\"]")
	private WebElement MFOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement MFOTPPage;
	
	@FindBy(tagName="H1")
	private WebElement MFheading;
	
	
	//*********************** Margin trading facility calculator ********************************//
	
	@FindBy(xpath="(//input[@id=\"txtMobileNo\"])[1]")
	private WebElement MTFCalcmobiletxt;
	
	@FindBy(xpath="//button[@id=\"openAccountBtn\"]")
	private WebElement MTFCalcOpenaccbtn;
	
	@FindBy(xpath="//h2[text()='Enter mobile number']")
	private WebElement MTFCalcOTPPage;
	
	@FindBy(tagName="H1")
	private WebElement MTFCalcheading;
	
	
	

	
	
	
	public Trading_account_5_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	    //*************** Demat Account Landing Page**********************//
	
	public String DALfeatchtitle() {
		String verifytitle =driver.getTitle();
		return verifytitle;
 }
 
 public String DALfeatchurl() {
		String verifyurl =driver.getCurrentUrl();
		return verifyurl;
 }
 public String DALfeatchHeading() {
		return DALheading.getText();
 }
 
 public void DALbutton1() {
	
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
 
 public void Scroll() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
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
	
	
	
	
	
		//***************Trading Account page**********************//
	
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
		
		 boolean b2=openAccountBtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+b2);
		 }
	 
	 public void loadtime() {
		 try {
	            // URL to test
			 String url=driver.getCurrentUrl();
	            //String url = "https://www.mstock.com/sem-landing/trading-account";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get(url);

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("TRADING ACCOUNT PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	     

	 }
	 
	 //***************Page_6_Zero brokerage**********************//
	 
	 public String zb_featchtitle() {
			String verifytitle =driver.getTitle();
			return verifytitle;
	 }
	 
	 public String zb_featchurl() {
			String verifyurl =driver.getCurrentUrl();
			return verifyurl;
	 }
	 public String zb_featchHeading() {
			return ZBheading.getText();
	 }
	 
	 public void zb_Opendemataccount() {
		
		 boolean b2=ZBOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+b2);
		 }
	 
	 public void zb_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/sem-landing/zero-brokerage");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	     
	 }
	 
	 
	 //***************Mstock Main Page**********************//
	 
	 public void mstock_Opendemataccount() throws InterruptedException {
			
		 boolean b2=mstockOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+b2);
		 Thread.sleep(1000);
		 mstcokinput.sendKeys("9678562492");
		 Thread.sleep(3000);
		 mstockOpenaccbtn.click();
		 Thread.sleep(2000);
		 }
	 public void verifyotpPage() {
		String otptext= OTPPage.getText();
		System.out.println("OTP PAGE HEADING:  " +otptext);
		driver.navigate().back();
	}
	 
	 public String mstock_featchtitle() {
			String mstockverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +mstockverifytitle);
			return mstockverifytitle;
	 }
	 
	 public String mstock_featchurl() {
			String mstockverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +mstockverifyurl);
			return mstockverifyurl;
	 }
	 public void mstock_featchHeading() {
			//System.out.println(mstockheading.getText());
			String h1=mstockheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + h1);
	 }
	 
	 
	 
	 public void mstock_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	     
	 }
	 
	 //******************** Organic SEM Open demat account***************/
	 
	 public void SEMODA_Opendemataccount() throws InterruptedException {
			
		 boolean b2=SEMODAOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+b2);
		 SEMODAmobile.sendKeys("9673562492");
		 Thread.sleep(3000);
		 SEMODAOpenaccbtn.click();
		 Thread.sleep(3000);
		 
		 }
	 public void SEMODA_verifyotpPage() throws InterruptedException {
		//String otptext= SEMODAOTPPage.getText();
		Thread.sleep(2000);
		//System.out.println("OTP PAGE HEADING:  " +otptext);
		driver.navigate().back();
	}
	 
	 public String SEMODA_featchtitle() {
			String mstockverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +mstockverifytitle);
			return mstockverifytitle;
	 }
	 
	 public String SEMODA_featchurl() {
			String mstockverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +mstockverifyurl);
			return mstockverifyurl;
	 }
	 public void SEMODA_featchHeading() {
			//System.out.println(mstockheading.getText());
			String h1=SEMODAheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + h1);
	 }
	 
	 public void SEMODA_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/open-demat-account");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	 
	//******************************Margin trading facility ************/
	 
	 

	 
	 public void MTF_Opendemataccount() throws InterruptedException {
			
		 boolean mtfb2=MTFOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+mtfb2);
		 MTFmobiletxt.sendKeys("9673562492");
		 Thread.sleep(3000);
		 MTFOpenaccbtn.click();
		 Thread.sleep(3000);
		 
		 }
	 public void MTF_verifyotpPage() throws InterruptedException {
		String mtfotptext= MTFOTPPage.getText();
		Thread.sleep(2000);
		System.out.println("OTP PAGE HEADING:  " +mtfotptext);
		driver.navigate().back();
	}
	 
	 public String MTF_featchtitle() {
			String MTFverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +MTFverifytitle);
			return MTFverifytitle;
	 }
	 
	 public String MTF_featchurl() {
			String MTFverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +MTFverifyurl);
			return MTFverifyurl;
	 }
	
	 public void MTF_featchHeading() {
			//System.out.println(mstockheading.getText());
			String head1=MTFheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + head1);
	 }
	 
	 public void MTF_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/margin-trading-facility");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	 
	//************************ Refer and earn    ********************************// 
	 
	 public void RaN_Opendemataccount() throws InterruptedException {
			
		 boolean RaNb2=RaNOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+RaNb2);
		 RaNmobiletxt.sendKeys("9673562492");
		 Thread.sleep(3000);
		 RaNOpenaccbtn.click();
		 Thread.sleep(3000);
		 
		 }
	 public void RaN_verifyotpPage() throws InterruptedException {
		String RaNotptext= RaNOTPPage.getText();
		Thread.sleep(2000);
		System.out.println("OTP PAGE HEADING:  " +RaNotptext);
		driver.navigate().back();
	}
	 
	 public String RaN_featchtitle() {
			String RaNverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +RaNverifytitle);
			return RaNverifytitle;
	 }
	 
	 public String RaN_featchurl() {
			String RaNverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +RaNverifyurl);
			return RaNverifyurl;
	 }
	
	 public void RaN_featchHeading() {
			//System.out.println(mstockheading.getText());
			String RaNH1=RaNheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + RaNH1);
	 }
	 
	 public void RaN_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/refer-and-earn");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	 
	 
	//*********************************Pricing **************/
	 
	 public void PRZ_Opendemataccount() throws InterruptedException {
			
		 boolean PRZb2=PRZOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+PRZb2);
		 PRZmobiletxt.sendKeys("9673562492");
		 Thread.sleep(3000);
		 PRZOpenaccbtn.click();
		 Thread.sleep(3000);
		 
		 }
	 public void PRZ_verifyotpPage() throws InterruptedException {
		String PRZotptext= PRZOTPPage.getText();
		Thread.sleep(2000);
		System.out.println("OTP PAGE HEADING:  " +PRZotptext);
		driver.navigate().back();
	}
	 
	 public String PRZ_featchtitle() {
			String PRZverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +PRZverifytitle);
			return PRZverifytitle;
	 }
	 
	 public String PRZ_featchurl() {
			String PRZverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +PRZverifyurl);
			return PRZverifyurl;
	 }
	
	 public void PRZ_featchHeading() {
			//System.out.println(mstockheading.getText());
			String PRZH1=PRZheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + PRZH1);
	 }
	 
	 public void PRZ_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/pricing");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	 
	 
	//*********************** Mutual fund investments ********************************//
	 
	 public void MF_Opendemataccount() throws InterruptedException {
			
		 boolean MFb2=MFOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+MFb2);
		 MFmobiletxt.sendKeys("9673562492");
		 Thread.sleep(3000);
		 MFOpenaccbtn.click();
		 Thread.sleep(3000);
		 
		 }
	 public void MF_verifyotpPage() throws InterruptedException {
		String MFotptext= MFOTPPage.getText();
		Thread.sleep(2000);
		System.out.println("OTP PAGE HEADING:  " +MFotptext);
		driver.navigate().back();
	}
	 
	 public String MF_featchtitle() {
			String MFverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +MFverifytitle);
			return MFverifytitle;
	 }
	 
	 public String MF_featchurl() {
			String MFverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +MFverifyurl);
			return MFverifyurl;
	 }
	
	 public void MF_featchHeading() {
			//System.out.println(mstockheading.getText());
			String MFH1=MFheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + MFH1);
	 }
	 
	 public void MF_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/mutual-fund-investments");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	 
	 
	 
	//*********************** Margin trading facility calculator ********************************// 
	 
	 public void MTFCalc_Opendemataccount() throws InterruptedException {
			
		 boolean MTFCalcb2=MTFCalcOpenaccbtn.isDisplayed();
		 System.out.println("OPEN DEMAT ACCOUNT BUTTON IS DISPLAY:: "+MTFCalcb2);
		 MTFCalcmobiletxt.sendKeys("9673562492");
		 Thread.sleep(3000);
		 MTFCalcOpenaccbtn.click();
		 Thread.sleep(3000);
		 
		 }
	 public void MTFCalc_verifyotpPage() throws InterruptedException {
		String MTFCalcotptext= MTFCalcOTPPage.getText();
		Thread.sleep(2000);
		System.out.println("OTP PAGE HEADING:  " +MTFCalcotptext);
		driver.navigate().back();
	}
	 
	 public String MTFCalc_featchtitle() {
			String MTFCalcverifytitle =driver.getTitle();
			System.out.println("TITLE OF PAGE IS:  " +MTFCalcverifytitle);
			return MTFCalcverifytitle;
	 }
	 
	 public String MTFCalc_featchurl() {
			String MTFCalcverifyurl =driver.getCurrentUrl();
			System.out.println("url OF PAGE IS:" +MTFCalcverifyurl);
			return MTFCalcverifyurl;
	 }
	
	 public void MTFCalc_featchHeading() {
			//System.out.println(mstockheading.getText());
			String MTFCalcH1=MTFCalcheading.getText();
			System.out.println("HEADING OF PAGE IS:  " + MTFCalcH1);
	 }
	 
	 public void MTFCalc_loadtime() {
		 try {
	            // URL to test
	           // String url = "https://www.mstock.com/sem-landing/zero-brokerage";

	            // Start measuring time
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get("https://www.mstock.com/margin-trading-facility/mtf-calculator");

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("ZERO BROKERAGE PAGE LOADED IN: " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }
	 }
	 
}
