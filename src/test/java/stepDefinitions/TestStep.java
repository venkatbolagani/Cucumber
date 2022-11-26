package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObject.FormPage;
import pageObject.TestPage;

public class TestStep {
	
	TestContext testContext;
	TestPage testPage;
	WebDriver driver;

public TestStep(TestContext context) {
	testContext = context;		
	testPage = testContext.getPageObjectManager().gettestpage();
	}
	
@When("^Then verify articals and links should be aligned properly$")
public void then_verify_articals_and_links_should_be_aligned_properly(DataTable dataTable) throws Throwable {
	
	
	testPage.verify_articals(dataTable);
}
	

}
