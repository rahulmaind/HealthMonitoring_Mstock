package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OPFPF_POM {
	
	WebDriver driver;
	 private WebDriverWait wait;
		@FindBy(xpath = "(//div[@class='wzrk-alert wiz-show-animate']//button)[1]")
	    private WebElement handlepopup;
		
	
	
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//button[text()='I understand, continue']")
	private WebElement accept;
	
	@FindBy(xpath="//img[@id=\"logo\"]")
	private WebElement logo;
	
	
	//************************ order***************************//
	
	@FindBy(xpath="//a[text()='Orders']")
	private WebElement ord;
	
	@FindBy(xpath="//p[text()=' Order related queries? ']")
	private WebElement orquery;
	
	@FindBy(xpath="//p[text()='Orders - FAQs']")
	private WebElement faq_popup;
	
	@FindBy(xpath="(//img[@alt=\"right_arrow_onscreen\"])[1]")
	private WebElement arwfaq;
	
	@FindBy(xpath="(//span[@class=\"customnav\"])[1]")
	private WebElement faq_clickhere;
	
	@FindBy(xpath="(//textarea[@id=\"text_area\"])[1]")
	private WebElement ord_textarea;
	
	@FindBy(xpath="//span[text()='Attach your screen']")
	private WebElement ord_attchment;
	
	@FindBy(xpath="//button[text()='Raise Query']")
	private WebElement ord_raise;
	
	@FindBy(xpath="//p[@class='text-success text-center']")
	private WebElement verify_img;
	
	//************************ positions***************************//
	@FindBy(xpath="//a[text()='Positions']")
	private WebElement pos;
	
	@FindBy(xpath="//p[text()=' Positions related queries? ']")
	private WebElement pos_query;
	
	@FindBy(xpath="//p[text()='Positions - FAQs']")
	private WebElement pos_faq_popup;
	
	@FindBy(xpath="(//img[@alt='right_arrow_onscreen'])[1]")
	private WebElement pos_arwfaq;
	
	@FindBy(xpath="(//span[@class='customnav'])[1]")
	private WebElement pos_faq_clickhere;
	
	@FindBy(xpath="(//textarea[@id='text_area'])[1]")
	private WebElement pos_textarea;
	
	@FindBy(xpath="//span[text()='Attach your screen']")
	private WebElement pos_attchment;
	
	@FindBy(xpath="//button[text()='Raise Query']")
	private WebElement pos_raise;
	
	@FindBy(xpath="//p[@class='text-success text-center']")
	private WebElement pos_verify_img;
	
	
	//************************ portfolio***************************//
	
	@FindBy(xpath="//a[text()='Portfolio']")
	private WebElement por;
	
	@FindBy(xpath="//p[text()=' Equity Portfolio related queries? ']")
	private WebElement por_query;
	
	@FindBy(xpath="//p[text()='Equity Portfolio - FAQs']")
	private WebElement por_faq_popup;
	
	@FindBy(xpath="(//img[@alt='right_arrow_onscreen'])[1]")
	private WebElement por_arwfaq;
	
	@FindBy(xpath="(//span[@class='customnav'])[1]")
	private WebElement por_faq_clickhere;
	
	@FindBy(xpath="(//textarea[@id='text_area'])[1]")
	private WebElement por_textarea;
	
	@FindBy(xpath="//span[text()='Attach your screen']")
	private WebElement por_attchment;
	
	@FindBy(xpath="//button[text()='Raise Query']")
	private WebElement por_raise;
	
	@FindBy(xpath="//p[@class='text-success text-center']")
	private WebElement por_verify_img;
	
	
	
	//************************ funds***************************//
	
	@FindBy(xpath="//a[text()='Funds']")
	private WebElement funds;
	
	@FindBy(xpath="//p[text()=' Funds related queries? ']")
	private WebElement funds_query;
	
	@FindBy(xpath="//p[text()='Funds Related - FAQs']")
	private WebElement funds_faq_popup;
	
	@FindBy(xpath="(//img[@alt='right_arrow_onscreen'])[1]")
	private WebElement funds_arwfaq;
	
	@FindBy(xpath="(//span[@class='customnav'])[1]")
	private WebElement funds_faq_clickhere;
	
	@FindBy(xpath="(//textarea[@id='text_area'])[1]")
	private WebElement funds_textarea;
	
	@FindBy(xpath="//span[text()='Attach your screen']")
	private WebElement funds_attchment;
	
	@FindBy(xpath="//button[text()='Raise Query']")
	private WebElement funds_raise;
	
	@FindBy(xpath="//p[@class='text-success text-center']")
	private WebElement funds_verify_img;
	
	
	
	
	
			public OPFPF_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
			public void pophandle() {
			   	 try {
			            //wait.until(ExpectedConditions.visibilityOf(handlepopup));
			            // Handle the pop-up (e.g., close it)
			   		 handlepopup.click();
			            System.out.println("Pop-up handled successfully.");
			        } catch (NoSuchElementException e) {
			            // Pop-up not found, handle accordingly
			            System.out.println("Pop-up not found.");
			        }
			   }
				
				public void enterUsername() {
				username.sendKeys("7972160522");
				    }
				
				public void enterPass() {
					pass.sendKeys("MAI$nd1996aa");
					}
					
				public void clickLogin() throws InterruptedException {
					Thread.sleep(2000);
					loginbtn.click();
					}
					
				public void clickContinue() throws InterruptedException {
					Thread.sleep(2000);
					accept.click();
					}
				public void homepage() throws InterruptedException {
					Boolean lg=logo.isDisplayed();
					System.out.println("MSTOCK LOGO DISPLAY ON HOME PAGE  :"+lg);
					String title=driver.getTitle();
					System.out.println("PAGE TITLE IS: " +title);
					Thread.sleep(2000);
				}

				public void ordClick() throws InterruptedException {
					Thread.sleep(1000);
					ord.click();	
				}
				public void ord_rel_query() throws InterruptedException {
					Thread.sleep(1000);
					orquery.click();
				}
				
				public void popupfaq() {
					String s1= faq_popup.getText();
					System.out.println("Order FAQ POP UP IS OPEN AND HEADER HEADING IS :"+s1);
				}
				
				public void ord_arrowOClick() throws InterruptedException {
					Thread.sleep(2000);
					arwfaq.click();
				}
				
				public void link_Visibility() {
				boolean linkhere1=	faq_clickhere.isDisplayed();
				System.out.println("POST CLICK ON ARROW BUTTOIN FAQ SECTION IS EXPANDED AND BY CLICKING HERE LINK IS VISIBLE  :" + linkhere1);
				}
				
				public void by_clicking_here() throws InterruptedException {
					Thread.sleep(2000);
					faq_clickhere.click();
				}
				
				public void verify_textarea() {
					boolean ordtxt1= ord_textarea.isDisplayed();
					boolean ordtxt2= ord_textarea.isEnabled();
					System.out.println("ORDER QUERY TEXT AREA IS DISPLAYED   :"+ordtxt1 +"     AND IS ENABLED   :"+ordtxt2 );
				}
				
				public void ord_enterquery() throws InterruptedException {
					
					ord_textarea.sendKeys("Test Order Query raises successfully!!!!");	
					Thread.sleep(2000);
				}
				
				public void ord_attch_file() throws InterruptedException {
					ord_attchment.click();
					Thread.sleep(2000);
					 try {
						   
				            // Create an instance of Robot class
				            Robot robot = new Robot();
			                 Thread.sleep(2000);
				            // Copy the file path to the clipboard
				            StringSelection filePath = new StringSelection("C:\\Users\\rahul\\Desktop\\DBP00292.JPG");
				            Thread.sleep(2000);
				            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
				            Thread.sleep(2000);

				            // Press CTRL+V to paste the file path
				            robot.keyPress(KeyEvent.VK_CONTROL);
				            robot.keyPress(KeyEvent.VK_V);
				            Thread.sleep(2000);
				            robot.keyRelease(KeyEvent.VK_V);
				            robot.keyRelease(KeyEvent.VK_CONTROL);
				            Thread.sleep(2000);
				            // Press ENTER to upload the file
				            robot.keyPress(KeyEvent.VK_ENTER);
				            robot.keyRelease(KeyEvent.VK_ENTER);
				        
				            Thread.sleep(2000);
					   
					  } catch (AWTException e) {
				            e.printStackTrace();
					   }
					
				}
				
				public void ord_raise_click() throws InterruptedException {
					ord_raise.click();
					Thread.sleep(2000);
				}
				
				public void ord_upload_img() throws InterruptedException {
					Thread.sleep(2000);
					boolean img1=verify_img.isDisplayed();
					System.out.println("UPLOADED IMG FORMAT IS DISPLAY PROPERLY BELOW TEXT AREA   :"+ img1);
					Thread.sleep(2000);
				}
				
				//************************ positions***************************//
				
				public void posClick() throws InterruptedException {
					Thread.sleep(1000);
					pos.click();	
				}
				public void pos_rel_query() throws InterruptedException {
					Thread.sleep(1000);
					pos_query.click();
				}
				
				public void pos_popupfaq() {
					String poss1= pos_faq_popup.getText();
					System.out.println("Position FAQ POP UP IS OPEN AND HEADER HEADING IS :"+poss1);
				}
				
				public void pos_arrowOClick() throws InterruptedException {
					Thread.sleep(2000);
					pos_arwfaq.click();
				}
				
				public void pos_link_Visibility() {
				boolean poslinkhere=	pos_faq_clickhere.isDisplayed();
				System.out.println("POST CLICK ON ARROW BUTTOIN FAQ SECTION IS EXPANDED AND BY CLICKING HERE LINK IS VISIBLE  :" + poslinkhere);
				}
				
				public void pos_by_clicking_here() throws InterruptedException {
					Thread.sleep(2000);
					pos_faq_clickhere.click();
				}
				
				public void pos_verify_textarea() {
					boolean postxt1= pos_textarea.isDisplayed();
					boolean postxt2= pos_textarea.isEnabled();
					System.out.println("POSITION QUERY TEXT AREA IS DISPLAYED   :"+postxt1 +"     AND IS ENABLED   :"+postxt2 );
				}
				
				public void pos_enterquery() throws InterruptedException {
					
					pos_textarea.sendKeys("Test Position Query raises successfully!!!!");	
					Thread.sleep(2000);
				}
				
				public void pos_attch_file() throws InterruptedException {
					pos_attchment.click();
					Thread.sleep(2000);
					 try {
						   
				            // Create an instance of Robot class
				            Robot robot = new Robot();
			                 Thread.sleep(2000);
				            // Copy the file path to the clipboard
				            StringSelection filePath = new StringSelection("C:\\Users\\rahul\\Desktop\\DBP00292.JPG");
				            Thread.sleep(2000);
				            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
				            Thread.sleep(2000);

				            // Press CTRL+V to paste the file path
				            robot.keyPress(KeyEvent.VK_CONTROL);
				            robot.keyPress(KeyEvent.VK_V);
				            Thread.sleep(2000);
				            robot.keyRelease(KeyEvent.VK_V);
				            robot.keyRelease(KeyEvent.VK_CONTROL);
				            Thread.sleep(2000);
				            // Press ENTER to upload the file
				            robot.keyPress(KeyEvent.VK_ENTER);
				            robot.keyRelease(KeyEvent.VK_ENTER);
				        
				            Thread.sleep(2000);
					   
					  } catch (AWTException e) {
				            e.printStackTrace();
					   }
					
				}
				
				public void pos_raise_click() throws InterruptedException {
					pos_raise.click();
					Thread.sleep(2000);
				}
				
				public void pos_upload_img() throws InterruptedException {
					Thread.sleep(2000);
					boolean posimg1=pos_verify_img.isDisplayed();
					System.out.println("UPLOADED IMG FORMAT IS DISPLAY PROPERLY BELOW TEXT AREA   :"+ posimg1);
					Thread.sleep(2000);
				}
				
				
				
				//************************ portfolio***************************//
				
				public void porClick() throws InterruptedException {
					Thread.sleep(1000);
					por.click();	
				}
				public void por_rel_query() throws InterruptedException {
					Thread.sleep(1000);
					por_query.click();
				}
				
				public void por_popupfaq() {
					String pors1= por_faq_popup.getText();
					System.out.println("Portfolio FAQ POP UP IS OPEN AND HEADER HEADING IS :"+pors1);
				}
				
				public void por_arrowOClick() throws InterruptedException {
					Thread.sleep(2000);
					por_arwfaq.click();
				}
				
				public void por_link_Visibility() {
				boolean porlinkhere=	por_faq_clickhere.isDisplayed();
				System.out.println("POST CLICK ON ARROW BUTTOIN FAQ SECTION IS EXPANDED AND BY CLICKING HERE LINK IS VISIBLE  :" + porlinkhere);
				}
				
				public void por_by_clicking_here() throws InterruptedException {
					Thread.sleep(2000);
					por_faq_clickhere.click();
				}
				
				public void por_verify_textarea() {
					boolean portxt1= por_textarea.isDisplayed();
					boolean portxt2= por_textarea.isEnabled();
					System.out.println("PORTFOLIO QUERY TEXT AREA IS DISPLAYED   :"+portxt1 +"     AND IS ENABLED   :"+portxt2 );
				}
				
				public void por_enterquery() throws InterruptedException {
					
					por_textarea.sendKeys("Test Portfolio Query raises successfully!!!!");	
					Thread.sleep(2000);
				}
				
				public void por_attch_file() throws InterruptedException {
					por_attchment.click();
					Thread.sleep(2000);
					 try {
						   
				            // Create an instance of Robot class
				            Robot robot = new Robot();
			                 Thread.sleep(2000);
				            // Copy the file path to the clipboard
				            StringSelection filePath = new StringSelection("C:\\Users\\rahul\\Desktop\\DBP00292.JPG");
				            Thread.sleep(2000);
				            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
				            Thread.sleep(2000);

				            // Press CTRL+V to paste the file path
				            robot.keyPress(KeyEvent.VK_CONTROL);
				            robot.keyPress(KeyEvent.VK_V);
				            Thread.sleep(2000);
				            robot.keyRelease(KeyEvent.VK_V);
				            robot.keyRelease(KeyEvent.VK_CONTROL);
				            Thread.sleep(2000);
				            // Press ENTER to upload the file
				            robot.keyPress(KeyEvent.VK_ENTER);
				            robot.keyRelease(KeyEvent.VK_ENTER);
				        
				            Thread.sleep(2000);
					   
					  } catch (AWTException e) {
				            e.printStackTrace();
					   }
					
				}
				
				public void por_raise_click() throws InterruptedException {
					por_raise.click();
					Thread.sleep(2000);
				}
				
				public void por_upload_img() throws InterruptedException {
					Thread.sleep(2000);
					boolean porimg1=por_verify_img.isDisplayed();
					System.out.println("UPLOADED IMG FORMAT IS DISPLAY PROPERLY BELOW TEXT AREA   :"+ porimg1);
					Thread.sleep(2000);
				}
				
				
				
				
				//************************ funds***************************//
				
				public void fundsClick() throws InterruptedException {
					Thread.sleep(1000);
					funds.click();	
				}
				public void funds_rel_query() throws InterruptedException {
					Thread.sleep(1000);
					funds_query.click();
				}
				
				public void funds_popupfaq() {
					String fs1= funds_faq_popup.getText();
					System.out.println("Funds FAQ POP UP IS OPEN AND HEADER HEADING IS :"+fs1);
				}
				
				public void funds_arrowOClick() throws InterruptedException {
					Thread.sleep(2000);
					funds_arwfaq.click();
				}
				
				public void funds_link_Visibility() {
				boolean fundslinkhere=	funds_faq_clickhere.isDisplayed();
				System.out.println("POST CLICK ON ARROW BUTTOIN FAQ SECTION IS EXPANDED AND BY CLICKING HERE LINK IS VISIBLE  :" + fundslinkhere);
				}
				
				public void funds_by_clicking_here() throws InterruptedException {
					Thread.sleep(2000);
					funds_faq_clickhere.click();
				}
				
				public void funds_verify_textarea() {
					boolean fundstxt1= funds_textarea.isDisplayed();
					boolean fundstxt2= funds_textarea.isEnabled();
					System.out.println("funds QUERY TEXT AREA IS DISPLAYED   :"+fundstxt1 +"     AND IS ENABLED   :"+fundstxt2 );
				}
				
				public void funds_enterquery() throws InterruptedException {
					
					funds_textarea.sendKeys("Test funds Query raises successfully!!!!");	
					Thread.sleep(2000);
				}
				
				public void funds_attch_file() throws InterruptedException {
					funds_attchment.click();
					Thread.sleep(2000);
					 try {
						   
				            // Create an instance of Robot class
				            Robot robot = new Robot();
			                 Thread.sleep(2000);
				            // Copy the file path to the clipboard
				            StringSelection filePath = new StringSelection("C:\\Users\\rahul\\Desktop\\DBP00292.JPG");
				            Thread.sleep(2000);
				            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
				            Thread.sleep(2000);

				            // Press CTRL+V to paste the file path
				            robot.keyPress(KeyEvent.VK_CONTROL);
				            robot.keyPress(KeyEvent.VK_V);
				            Thread.sleep(2000);
				            robot.keyRelease(KeyEvent.VK_V);
				            robot.keyRelease(KeyEvent.VK_CONTROL);
				            Thread.sleep(2000);
				            // Press ENTER to upload the file
				            robot.keyPress(KeyEvent.VK_ENTER);
				            robot.keyRelease(KeyEvent.VK_ENTER);
				        
				            Thread.sleep(2000);
					   
					  } catch (AWTException e) {
				            e.printStackTrace();
					   }
					
				}
				
				public void funds_raise_click() throws InterruptedException {
					funds_raise.click();
					Thread.sleep(2000);
				}
				
				public void funds_upload_img() throws InterruptedException {
					Thread.sleep(2000);
					boolean fundsimg1=funds_verify_img.isDisplayed();
					System.out.println("UPLOADED IMG FORMAT IS DISPLAY PROPERLY BELOW TEXT AREA   :"+ fundsimg1);
					Thread.sleep(2000);
				}
				
				
				
}
