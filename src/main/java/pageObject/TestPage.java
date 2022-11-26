package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import junit.framework.Assert;
import selenium.ElementUtil;

public class TestPage {
	
	
	WebDriver driver;
	ElementUtil eleUtil;	

	//private By nextBtn = By.xpath("//button[text()='Next']");
	//private By formText =  By.xpath("//h1[text()='What is your product form preference?']");
	
	
	public TestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
	}
	
	
	
	public void verify_articals(DataTable dataTable) {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	
	List<String> articles=dataTable.asList(String.class);
	List<WebElement> articalesEleList=driver.findElements(By.xpath("//span[@class='subsection-headline the-global-title']/a"));
	List<String> articlActual=new ArrayList<String>();
			
	for(WebElement ele:articalesEleList){
		articlActual.add(ele.getText());
	}
	for (int i=0;i<articlActual.size();i++) {
		
		String actual=articlActual.get(i);
		String exp=articles.get(i);
		Assert.assertEquals(actual, exp);
			}
	
	//driver.findElement(By.id("nav")).click();
	}
	

}
