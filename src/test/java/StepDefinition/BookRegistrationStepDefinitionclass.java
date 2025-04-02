package StepDefinition;

import java.awt.Desktop.Action;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.Slicing;
import utility.Testcontextsetup;

public class BookRegistrationStepDefinitionclass {

	WebDriver driver;
	Testcontextsetup context;
	
	public BookRegistrationStepDefinitionclass ( Testcontextsetup context) 
	{ 
		this.context = context;
	}
		
		@Given("user launches Book application")
		public void user_launches_book_application() throws InterruptedException {
			context.driver = new ChromeDriver();
			
			context.driver.manage().window().maximize(); 
			context.driver.get("https://www.bookswagon.com/login");
			Thread.sleep(3000);
		}
		@Given("User clicks on MY Account")
		public void user_clicks_on_my_account() {
			WebElement element1= context.driver.findElement(By.xpath("//span[@id='ctl00_lblUser']")); 
			Actions action = new Actions(context.driver);
			
			action.moveToElement(element1).perform();
		}
		
		@When("User enters Mobile , Password")
		public void user_enters_mobile_password() throws InterruptedException {
			context.driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).sendKeys("8778864433");
			context.driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']")).sendKeys("asha@17");
			context.driver.findElement(By.xpath("//a[@id='ctl00_phBody_SignIn_btnLogin']")).click();
			Thread.sleep(3000);
		}
		@When("clicks on Login button")
		public void clicks_on_login_button() {
			context.driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).click();
		}
		@Then("User should Land on the Home Page")
		public void user_should_land_on_the_home_page() {
		   String str = "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com";
		   String str1 = driver.getTitle();
		   Assertions.assertEquals(str, str1);
		   driver.quit();		}
		
		@When("User enters {string} , {string}")
		public void user_enters(String mobile, String password) throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).sendKeys(mobile);
			driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']")).sendKeys(password);
			Thread.sleep(3000);
		    
		}
		
		@When("User enters required data")
		public void user_enters_required_data(DataTable dataTable) {
			
		   List<List<String>> data = dataTable.asLists();
		   driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).sendKeys(data.get(0).get(0)); 
		   driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']")).sendKeys(data.get(0).get(1)); 
		}
		

	}


