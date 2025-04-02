package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features="@target/failererun.txt",// mention the path of the feature file
		glue ="StepDefinition" ,
				plugin={"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		//, tags= "@reg and not @sanity"
		)
public class Failedrerunner extends AbstractTestNGCucumberTests{

	
		
		
		
	

}
