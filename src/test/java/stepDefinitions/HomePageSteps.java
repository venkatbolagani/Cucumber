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

public class HomePageSteps {
		TestContext testContext;
		HomePage homepage;
		WebDriver driver;
	
	public HomePageSteps(TestContext context) {
		testContext = context;		
		homepage = testContext.getPageObjectManager().gethomepage();		
	}
	
	@Given("^user is on HomePage$")
	public void user_is_on_Home_Page() {
		homepage.navigateTo_HomePage();
		homepage.doClickCategory("Cold, Cough, & Flu");		
	}

	 
}
