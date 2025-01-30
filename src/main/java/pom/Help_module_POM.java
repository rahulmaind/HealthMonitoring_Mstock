package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;



public class Help_module_POM {

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
	
	@FindBy(xpath="//img[@class=\"hamburger\"]")
	private WebElement hamburger;
	
	@FindBy(xpath="//p[text()='Help']")
	private WebElement clkhelp;
	
	@FindBy(xpath="(//a[@class='toggleclickrqh']//span)[1]")//span[text()=' Write to us here']
	private WebElement wrt;
	
	@FindBy(id="queries_queryDescription")
	private WebElement queryinputbox;
	
	@FindBy(xpath="//input[@id='btnHomeRaise']")
	private WebElement raisebtn;
	
	@FindBy(xpath="//h3[text()='Thank You']")
	private WebElement thankyoupopup;
	
	@FindBy(xpath="//div[@class='modal-content viewimg-popup']//div//button[@onclick='closePopUp()']")
	private WebElement popupclose1;
	
	@FindBy(xpath="//span[text()='Attach your Screen']")
	private WebElement upload1;
	
	@FindBy(xpath="//div[@class='file-upload-filename']")
	private WebElement filename;
	
	
	
	public Help_module_POM(WebDriver driver) {
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
	public void clickhamburger() throws InterruptedException {
	
		hamburger.click();
	  }
	public void clickHelp() throws InterruptedException {
		Thread.sleep(2000);
		clkhelp.click();
		Thread.sleep(2000);
	  }
	
	public void helpMainPage() throws InterruptedException {
		Thread.sleep(2000);
		//Get the list of all open tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        // Switch to the new tab
        driver.switchTo().window(tabs.get(1));
        
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle() +"AND HELP PAGE OPEN SUCCESSFULLY");
		//String helpurl=driver.getCurrentUrl();
		//System.out.println("HELP CURRENT PAGE URL IS:  "+helpurl);
		//WebElement jss=driver.findElement(By.xpath("//span[text()=' Write to us here']"));
		Thread.sleep(2000);
	}
			

	public void helppageloadtime() {
		 try {
			 String helpurl=driver.getCurrentUrl();
			 System.out.println("HELP CURRENT PAGE URL IS:  "+helpurl);
	            
	            long startTime = System.currentTimeMillis();

	            // Navigate to the page
	            driver.get(helpurl);

	            // Wait for the page to load completely
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            while (!js.executeScript("return document.readyState").toString().equals("complete")) {
	                Thread.sleep(100); // Check every 100ms
	            }

	            // End measuring time
	            long endTime = System.currentTimeMillis();

	            // Calculate load time
	            long loadTime = endTime - startTime;
	            System.out.println("TIME TAKEN TO LOAD HELP PAGE IS  : " + loadTime + " ms");
	        } catch (InterruptedException e) {
	            System.err.println("ERROR WHILE WAITING FOR THE PAGE TO LOAD: " + e.getMessage());
	        }

	}
	
	
	public void scrolldownhelppage() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,1000)");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wrt);
		Thread.sleep(3000);
		wrt.click();
	}
	
	
	   public void queryTextInput() {
		   
		   Boolean qti1=queryinputbox.isDisplayed();
		   Boolean qti2=queryinputbox.isEnabled();
		   System.out.println("QUERY INPUT TEXT BOX IS DISPLAY AND ITS EDITABLE:  "+qti1+qti2);
	}
	   
	   public void addAttachquery() throws InterruptedException {
		 queryinputbox.sendKeys("Test Description Added");
		 Thread.sleep(2000);
		 //raisebtn.click();
	}
	   public void uploaddoc() throws InterruptedException, AWTException {
		   upload1.click();
		   
		  try {
			   
	            // Create an instance of Robot class
	            Robot robot = new Robot();
                 Thread.sleep(2000);
	            // Copy the file path to the clipboard
	            StringSelection filePath = new StringSelection("D:\\photo\\screen1.PNG");
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
		   
		   raisebtn.click();
		  } catch (AWTException e) {
	            e.printStackTrace();
		   }
		  Thread.sleep(2000);
		  String fn=filename.getText();
		  System.out.println("UPLOADED FILE NAME IS  :"+ fn);
	   }
	   
	  
	   
	   
				 public void querypopup1() throws InterruptedException {
		   
           String expectedMessage="Thank You";
           String actualMessage= thankyoupopup.getText();
 
           if(actualMessage.equals(expectedMessage)) {
        	   System.out.println("Success message verified: " + actualMessage);
           } 
           
           else {
               System.out.println("Success message verification failed. Expected: " + expectedMessage + ", but got: " + actualMessage);
               }
           Thread.sleep(2000);
           popupclose1.click();
		}
	   
	   }
          
	   
	
	


