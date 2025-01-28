package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@CucumberOptions(features="Feature/zero-brokerage-on-delivery.feature", glue= {"step"},plugin= {"pretty"},
//publish= true)


@CucumberOptions(
		
		  features={"C:\\Users\\rahul.nityo\\OneDrive - Mirae Asset Capital Markets (India) Pvt. Ltd\\Desktop\\HealthMonitoring\\src\\main\\resources\\Feature\\5_trading-account.feature"},
		  glue= {"steps"},
		plugin= {"pretty"}
		//tags= "@TradingAccount or @MF or @ZeroBrokerage or @MstockPage or @SEMOpendemataccount or @MTF or @RaN or @Pricing or @MTFCalculator"
		//publish=true,
     
		  )
		

//@CucumberOptions(features="C:\\Users\\rahul.nityo\\OneDrive - Mirae Asset Capital Markets (India) Pvt. Ltd\\Desktop\\HealthMonitoring\\src\\main\\resources\\Feature\\5_trading-account.feature",
//glue= {"step"},tags= "@DematAccountLanding",plugin= {"pretty","html:targethtml/Htmlreport"})

public class runner_zero extends AbstractTestNGCucumberTests{

}
