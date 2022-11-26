package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;
import selenium.SendMail;


public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	private ScenarioContext scenarioContext;
	private SendMail sendmail;
	
	public TestContext(){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		scenarioContext = new ScenarioContext();
		sendmail = new SendMail();
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
	public SendMail getSendMail() {
		return sendmail;
	}

}
