package pageObject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.ElementUtil;


public class FormPage {
	WebDriver driver;
	ElementUtil eleUtil;	

	//private By nextBtn = By.xpath("//button[text()='Next']");
	private By formText =  By.xpath("//h1[text()='What is your product form preference?']");
	
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}
	
	
	public void selectProductForm() {
		verifyProductFormText();
		eleUtil.doSelectOption("Liquid / Syrup");
		
	}
	
	public void verifyProductFormText() {
		//String expectedText = AppConstants.PRODUCT_FORM_HEADING_TEXT;
		//System.out.println(expectedText);
		eleUtil.waitForElementPresence(formText,10);
		String actualText = eleUtil.doGetText(formText);
		//Assert.assertEquals(actualText, expectedText);	
	}
	public void selectProductForm(String value) {
		verifyProductFormText();		
		//eleUtil.pageElements.put("6",GetInputData.getHashmapvalue("DT_ProductForm"));
		eleUtil.doSelectOption(value);
		
	}


}
