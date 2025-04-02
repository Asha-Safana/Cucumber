package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import org.testng.Assert;


import io.cucumber.java.en.Then;
import utility.Testcontextsetup;

public class BookLoginstepDefinition {

WebDriver driver;
Testcontextsetup context;

public BookLoginstepDefinition ( Testcontextsetup context) 
{ 
	this.context = context;
}
	
	@Then("Login Link should appear")
	public void login_link_should_appear() {
boolean value = context.driver.getCurrentUrl().contains("asha");
        
        // Assertion
Assert.assertTrue(value, "Custom failure message");

        context.driver.quit();
	}
}
		