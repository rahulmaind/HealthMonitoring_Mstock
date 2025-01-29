package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Help_module_POM {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement pass;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//button[@class=\"subbtn\"]")
	private WebElement accept;
	
	@FindBy(xpath="//img[@id=\"logo\"]")
	private WebElement logo;
	
	@FindBy(xpath="//img[@class=\"hamburger\"]")
	private WebElement hamburger;
	
	@FindBy(xpath="//p[text()='Help']")
	private WebElement clkhelp;
	
	@FindBy(xpath="//span[text()=' Write to us here']")
	private WebElement wrt;
	
	
	
	
	
	
	
	public Help_module_POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	public void enterUsername() {
	username.sendKeys("7972160522");
	    }
	
	public void enterPass() {
		pass.sendKeys("MAI$nd1996aa");
		}
		
	public void clickLogin() {
		loginbtn.click();
		}
		
	public void clickContinue() {
		accept.click();
		}
	
	public void clickhamburger() {
		Boolean lg=logo.isDisplayed();
		System.out.println("USER IS ON MSTOCK HOME PAGE  :"+lg);
		String title=driver.getTitle();
		System.out.println("PAGE TITLE IS: " +title);
		hamburger.click();
	  }
	public void clickHelp() {
		clkhelp.click();
	  }
	
	public void helpMainPage() {
		System.out.println("HELP MAIN PAGE TITLE IS  :" + driver.getTitle());
		//WebElement jss=driver.findElement(By.xpath("//span[text()=' Write to us here']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wrt);
		wrt.click();
		
		
		
		
		
	  }
	
}
