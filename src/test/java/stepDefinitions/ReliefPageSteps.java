package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.FormPage;
import pageObject.StrengthPage;
import pageObject.SelectAgePage;
import pageObject.ReliefPage;
import pageObject.PreferencePage;
import pageObject.SymptomsPage;
import pageObject.HomePage;

public class ReliefPageSteps {
		TestContext testContext;
		ReliefPage selectreliefpage;
		WebDriver driver;
	
	public ReliefPageSteps(TestContext context) {
		testContext = context;		
		selectreliefpage = testContext.getPageObjectManager().getselectreliefpage();
	}
	
	@When("^user is on type of relief page$")
	public void user_is_on_type_of_relief_page()  {
		selectreliefpage.selectRelief("Day Time / Any Time / Non Drowsy");
	   
	}

	@When("^user is on type of \"([^\"]*)\" page$")
    public void user_is_on_type_of_relief_page(String relief) {
		selectreliefpage.selectRelief(relief);
    }

	
}
