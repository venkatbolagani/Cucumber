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

public class FormPageSteps {
		TestContext testContext;
		FormPage productformpage;
		WebDriver driver;
	
	public FormPageSteps(TestContext context) {
		testContext = context;		
		productformpage = testContext.getPageObjectManager().getproductformpage();
		}
	
	
	@When("^user is on product form page$")
	public void user_is_on_product_form_page() {
		productformpage.selectProductForm("Spray / Pump / Mist");
	   
	}
	

	@When("^user is on \"([^\"]*)\" form page$")
    public void user_is_on_product_form_page(String product) throws Throwable {
		productformpage.selectProductForm(product);
    }
	
}
