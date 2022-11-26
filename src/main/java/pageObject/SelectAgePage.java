package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.ElementUtil;


public class SelectAgePage {
	WebDriver driver;
	ElementUtil eleUtil;
	private By disclaimer = By.xpath("//div[@class='css-tmzyiv']//p[@class='ccf-question-heading text-primary']");
	private By continueBtn = By.xpath("//div[@class='css-tmzyiv']//button[text()='Continue']");
	private By ageText = By.xpath("//h1[text()='How old is the person you are shopping for?']");

	
	public SelectAgePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}

	
	public void AdultAge() {
		verifyAgeText();
		eleUtil.doSelectOption("Adult, child ages 12 and older");
		
		
		//doClickContinue();
	
	}

	
	public String getDisclaimerHeader(String mainProductName) {
		String disclaimerHeader = eleUtil.doGetText(disclaimer);
		System.out.println("product header is : " + disclaimerHeader);
		return disclaimerHeader;
	}


	public void verifyGetText() {
		eleUtil.doGetText(disclaimer);
	}



	public void doClickContinue() {
		eleUtil.doClickWithWait(continueBtn, 10);
	}
	public void verifyAgeText() {
		//String expectedText = AppConstants.PERSON_AGE_HEADING_TEXT;
		//System.out.println(expectedText);
		String actualText = eleUtil.doGetText(ageText);
		//Assert.assertEquals(actualText, expectedText);	
	}

	
	public void AdultAge(String age) {
		verifyAgeText();
		eleUtil.doSelectOption(age);
		doClickContinue();	
		
	}
	
}
