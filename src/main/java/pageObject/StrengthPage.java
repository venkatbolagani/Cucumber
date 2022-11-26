package pageObject;


import selenium.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class StrengthPage {
	WebDriver driver;
	ElementUtil eleUtil;	

	private By nextBtn = By.xpath("//button[text()='Next']");
	private By productText = By.xpath("//h1[text()='What type of product strength you are looking for?']");
	
	//private static final Logger LOG = Logger.getLogger(ProductStrengthPage.class);
	
	public StrengthPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}
	
	
	public void selectProductstrength() {
		verifyProductText();
		eleUtil.doSelectOption("Maximum Strength / Extra Strength / Severe");
		
	}
	
	public void verifyProductText() {
		
		eleUtil.waitForElementPresence(productText,10);
		String actualText = eleUtil.doGetText(productText);
		//Assert.assertEquals(actualText, expectedText);		
	}
	
	public void selectProductstrength(String value) {
		verifyProductText();	
		eleUtil.doSelectOption(value);
		
	}
}
