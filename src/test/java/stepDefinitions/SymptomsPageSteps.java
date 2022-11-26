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

public class SymptomsPageSteps {
		TestContext testContext;
		SymptomsPage symptomspage;	
		
		WebDriver driver;
	
	public SymptomsPageSteps(TestContext context) {
		testContext = context;		
		symptomspage = testContext.getPageObjectManager().getsymptomspage();
		
	}
	

	@When("^user on symptoms or conditions Page$")
	public void user_on_symptoms_or_conditions_Page() {	    
		symptomspage.selectSymptoms("Sore Throat");
	}

	@When("^user on \"([^\"]*)\" Page$")
	 public void user_on_symptoms_page(String symptom) {
		 symptomspage.selectSymptoms(symptom);
	 }
	@When("^user on multi \"([^\"]*)\" Page$")
    public void user_on_multi_symptoms_page(String symptom) throws Throwable {
		symptomspage.multiSymptoms(symptom);
    }
	
}
