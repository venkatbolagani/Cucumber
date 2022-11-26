package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.ElementUtil;




public class HomePage{
	 WebDriver driver;	
	 ElementUtil eleUtil;
		private By Cough = By.xpath("(//p[text()='Cold, Cough, & Flu'])[2]");  //loginBtn
		private By coldCough = By.xpath("(//p[contains(text(),'Cough')])[2]");  //loginBtn
	
	// 2. page const....
	public HomePage(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);	
		eleUtil = new ElementUtil(driver);			
	}
	

	// 3. page actions:
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void  doClickCategory() {
		//driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		eleUtil.doSelectOption("Adult, child ages 12 and older");
		eleUtil.doClickWithWait(coldCough,10);
		
		
	}
	
	public void  doClickCategory(String value) {
		
		//pageElements.put("0",GetInputData.getHashmapvalue("DT_Category"));
		//eleUtil.doSelectOption("Adult, child ages 12 and older");
		eleUtil.doSelectCategory(value);
		
	}
	
	

}
