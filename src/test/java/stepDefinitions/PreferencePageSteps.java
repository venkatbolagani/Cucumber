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

public class PreferencePageSteps {
		TestContext testContext;
		PreferencePage selectedproductspage;
		WebDriver driver;
	
	public PreferencePageSteps(TestContext context) {
		testContext = context;		
		selectedproductspage = testContext.getPageObjectManager().getselectedproductspage();
	}
	
	
	@Then("^verify the selected preferences Page$")
	public void verify_the_selected_preferences_Page() {
		selectedproductspage.viewPreference();
	    
	}

	
}
