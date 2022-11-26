package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ElementUtil {

	private WebDriver driver;
	private Select select;
	private Actions act;

	public static Map<String, String> pageElements; //= new HashMap<>();

	//private static final String ELEMENT_NOT_FOUND_ERROR = "element is not available on the page : ";

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);		

	}

	public void doSendKeys(By locator, String value) {
		WebElement ele = getElement(locator);
		ele.clear();
		ele.sendKeys(value);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public WebElement getElement(By locator) {
		WebElement ele = driver.findElement(locator);
		return ele;		
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");
	}

	// Age selection
	public void doSelectOption(String value)	{
		
		WebElement ele = driver.findElement(By.xpath("//input[contains(@value,'"+ value +"')]"));	
		System.out.println("WebElement:"+ ele);			
		ele.click();
		
	}
	public void doMultiOption(String value) {

		WebElement ele = driver.findElement(By.xpath("//label[text()='" + value + "']"));//label[text()='Multi-Symptom Cold & Flu Solutions']
		System.out.println("WebElement:" + ele);
		Actions act = new Actions(driver);
		//Double click on element
		//WebElement ele = driver.findElement(By.xpath("XPath of the element")); 
		act.doubleClick(ele).build().perform();
		
		
	}
	public String waitForUrlContains(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		} else {
			return null;
		}
	}

	// Age selection
	public void doSelectCategory(String value) {

		WebElement ele = driver.findElement(By.xpath("(//p[contains(text(),'" + value + "')])[2]"));
		System.out.println("WebElement:" + ele);		
		ele.click();
		// return ele;
	}
	public void doClickWithWait(By locator, int timeOut) {
		waitForElementPresence(locator, timeOut).click();

	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean doEleIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean isSingleElementPresnt(By locator) {
		List<WebElement> list = getElements(locator);
		System.out.println(list.size());
		if (list.size() == 1) {
			System.out.println("single ele is present on the page");
			return true;
		} else {
			System.out.println("no search or multiple search present on the page");
			return false;
		}
	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	// ******************Drop Down utils*****************//
	// only when html tag = <select>
	public void doSelectDropDownByIndex(By locator, int index) {
		select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(By locator, String text) {
		select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public List<WebElement> getDropDownOptions(By locator) {
		select = new Select(getElement(locator));
		return select.getOptions();
	}

	public int getDropDownOptionsCount(By locator) {
		return getDropDownOptions(locator).size();
	}

	public void doSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

	
	public WebElement retryingElement(By locator, int timeOut, int pollingTime) {

		WebElement element = null;

		int attempts = 0;

		while (attempts < timeOut) {

			try {
				element = getElement(locator);
				System.out.println("element is found in attempt: " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + " : " + " for " + locator);

				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;

		}

		if (element == null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("element is not found exception ...tried for : " + timeOut + " secs"
						+ " with the interval of : " + pollingTime + " ms");

			}

		}

		return element;

	}
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	//WebDriverWait(driver, Duration.ofSeconds(timeOut));
}
