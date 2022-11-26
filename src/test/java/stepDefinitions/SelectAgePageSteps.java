package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObject.SelectAgePage;


public class SelectAgePageSteps {
		TestContext testContext;
		
		SelectAgePage selectagepage;

		WebDriver driver;
	
	public SelectAgePageSteps(TestContext context) {
		testContext = context;		
		selectagepage = testContext.getPageObjectManager().getselectagepage();

	}
	
	

	@When("^user is on person you are shopping$")
	public void user_is_on_person_you_are_shopping() {
		
		selectagepage.AdultAge("Adult, child ages 12 and older");   
	   
	}
	@When("^user is on person \"([^\"]*)\"$")
	public void user_is_on_person_something(String age) {
		selectagepage.AdultAge(age); 
	}
	
	
	
}
