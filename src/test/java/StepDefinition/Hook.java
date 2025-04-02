package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.de.Aber;

public class Hook {
	
	@Before
	 public void beforehook()
	 {
		System.out.println("before");
	 }
	@After
	 public void Afterhook()
	 {
		System.out.println("after");
	 }
}
