package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import selenium.ElementUtil;

public class PreferencePage {
	WebDriver driver;
	ElementUtil eleUtil;
	
	private By viewPreferences = By.xpath("//button[text()='View Selected Preferences']");
	private By preferencesText = By.xpath("//h3[contains(text(),'product(s) that match your selected preferences')]");
	//private static final Logger LOG = Logger.getLogger(SelectedProductPreferencePage.class);
	//ArrayList <String> pageElements;
	public PreferencePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}
	
	public void viewPreference() {	
		//getSelectedPreferPageUrl();
		eleUtil.scrollUp();		
		doClickNext();
		//verifySymptomsText();
	}
	
	
	public void doClickNext() {		
		eleUtil.doClickWithWait(viewPreferences, 20);
	}
	

	public void verifySymptomsText() {
		//String expectedText = AppConstants.SELECTED_PREFERENCES_HEADING_TEXT;
		//System.out.println(expectedText);
		//eleUtil.waitForElementToBeVisibleWithFluentWait(preferencesText,10,10);
		//String actualText = eleUtil.doGetText(preferencesText);
		//Assert.assertEquals(actualText, expectedText);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//WebElement element = driver.findElement(By.xpath("//div[contains(@class,'MuiAccordionDetails')]/div/div/following-sibling::div"));
		//jse.executeScript("return arguments[0].text", element);
		//System.out.println(jse.executeScript("return arguments[0].text", element));
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'MuiAccordionDetails')]/div/div/following-sibling::div"));
		//List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'MuiAccordionDetails')]/div/div"));
		System.out.println(ele.size());
		for(int i=0; i<ele.size();i++) {
			String text = ele.get(i).getText();
			System.out.println(text);
		//	LOG.info(ele.get(i).getText());
			//LOG.info(eleUtil.pageElements.get("+i+"));
			//Assert.assertEquals(ele.get(i).getText(),eleUtil.pageElements.get("+i+"));			
		}
		
//		Set keys = eleUtil.pageElements.keySet();
//		System.out.println("All keys are: " + keys);
//		// To get all key: value		
//		System.out.println(eleUtil.pageElements.get(keys));
//		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'MuiDialogContent')]//div[contains(@class,'MuiCollapse-root')]")).getText());
//		//Assert.assertEquals(driver.findElement(By.xpath("//div[text()='ADULT, CHILD AGES 12 AND OLDER']")).getText(),eleUtil.pageElements.get(0));
		
		
	}
	

}
