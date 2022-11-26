package pageObject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.ElementUtil;

public class SymptomsPage {
	WebDriver driver;
	ElementUtil eleUtil;	
	
	private By symptomsText = By.xpath("//h1[text()='What symptoms or conditions are you shopping for?']");
	private By nextBtn = By.xpath("//button[text()='Next']");
		
	public SymptomsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}
	
	
	public void selectSymptoms() {
		verifySymptomsText();
		eleUtil.doSelectOption("Cough");
	
	}
	
	public void doClickNext() {
		eleUtil.doClickWithWait(nextBtn, 10);
	}	

	public void verifySymptomsText() {
		//String expectedText = AppConstants.SYMPTOMS_HEADING_TEXT;
		//System.out.println(expectedText);
		String actualText = eleUtil.doGetText(symptomsText);
			
	}
	

	public void verifyGetText() {
		eleUtil.doGetText(symptomsText);
	}
	
	public void selectSymptoms(String value) {
		verifySymptomsText();
		
		//pageElements.add(GetInputData.getHashmapvalue("DT_Symptoms"));
		eleUtil.doSelectOption(value);
		
		verifyGetText();
		doClickNext();
	}
	public void multiSymptoms(String value) {
		verifySymptomsText();
	
		//pageElements.add(GetInputData.getHashmapvalue("DT_Symptoms"));
		eleUtil.doMultiOption(value);
		
		verifyGetText();
		doClickNext();
	}

}
