package runner;

import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		  features={"src\\main\\resources\\Help Module\\Helpmodule.feature"},
		  glue= {"steps"},
		plugin= {"pretty", "html:target1/cucumber-html-report.htm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags= "@secondTest or @thirdTest")
		//publish=true)
   
		  
		

public class HelpModule_runner extends AbstractTestNGCucumberTests{

	
	
	
	
}
