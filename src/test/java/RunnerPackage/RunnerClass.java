package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features="src/test/java/FeaturePackage/Login.feature",// mention the path of the feature file
		glue ="StepDefinition" ,dryRun =false ,
		plugin={"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","rerun:target/failererun.txt"}
		//, tags= "@reg and not @sanity"
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

	
		
		
		
	

}
