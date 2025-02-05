package runner;


import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		  features={"src\\main\\resources\\onscreen\\OPFPF.feature"},
		  glue= {"steps"},
		plugin= {"pretty", "html:target1/cucumber-html-report.htm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags= "@verifySentQuery")
        //tags= "@orders or @positions or @portfolio or @funds")
		//publish=true)
   



public class OPFPF_runner extends AbstractTestNGCucumberTests {

}
