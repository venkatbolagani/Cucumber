package pageObject;


import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.ElementUtil;

public class ReliefPage {
	WebDriver driver;
	ElementUtil eleUtil;	
	
	private By reliefText = By.xpath("//h1[text()='What type of relief are you looking for?']");
	//private By nextBtn = By.xpath("//button[text()='Next']");
	//private static final Logger LOG = Logger.getLogger(SelectReliefPage.class);
	
	
	public ReliefPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}
	
	
	public void selectRelief() {
		verifyProductText();
		eleUtil.doSelectOption("Day and Night Combo");
		
	}
	
	public void verifyProductText() {
		//String expectedText = AppConstants.PRODUCT_RELIEF_HEADING_TEXT;
		//System.out.println(expectedText);
		eleUtil.waitForElementPresence(reliefText,20);
		String actualText = eleUtil.doGetText(reliefText);
		//Assert.assertEquals(actualText, expectedText);	
	}
	public void selectRelief(String value) {
		verifyProductText();
		//eleUtil.pageElements.put("5",GetInputData.getHashmapvalue("DT_Relief"));
		//pageElements.add(GetInputData.getHashmapvalue("DT_Relief"));
		eleUtil.doSelectOption(value);
		
	}

}
