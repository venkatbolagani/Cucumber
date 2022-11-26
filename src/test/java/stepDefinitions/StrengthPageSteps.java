package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.TestContext;
import cucumber.api.java.en.And;
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

public class StrengthPageSteps {
		TestContext testContext;
		StrengthPage productstrengthpage;
		
		WebDriver driver;
	
	public StrengthPageSteps(TestContext context) {
		testContext = context;		
		productstrengthpage = testContext.getPageObjectManager().getproductstrengthpage();

	}
	
	
	@When("^user is on product strength Page$")
	public void user_is_on_product_strength_Page() {
		productstrengthpage.selectProductstrength("Maximum Strength / Extra Strength / Severe");
		//
	}

	@When("^user is on \"([^\"]*)\" strength Page$")
    public void user_is_on_product_strength_page(String strength) {
		productstrengthpage.selectProductstrength(strength);
    }

}
