package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		  features={"C:\\Users\\rahul.nityo\\git\\src\\main\\resources\\Help Module\\Helpmodule.feature"},
		  glue= {"steps"},
		plugin= {"pretty"}
		//tags= "@TradingAccount or @MF or @ZeroBrokerage or @MstockPage or @SEMOpendemataccount or @MTF or @RaN or @Pricing or @MTFCalculator"
		//publish=true,
   
		  )
		

public class HelpModule_runner extends AbstractTestNGCucumberTests{

	
	
	
	
}
