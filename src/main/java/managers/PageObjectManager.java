package managers;

import org.openqa.selenium.WebDriver;
import pageObject.HomePage;
import pageObject.FormPage;
import pageObject.StrengthPage;
import pageObject.SelectAgePage;
import pageObject.ReliefPage;
import pageObject.PreferencePage;
import pageObject.SymptomsPage;
import pageObject.TestPage;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage homepage;
	private SymptomsPage symptomspage;
	private SelectAgePage selectagepage;
	private ReliefPage selectreliefpage;
	private StrengthPage productstrengthpage;
	private FormPage productformpage;
	private PreferencePage selectedproductspage;
	private TestPage testPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage gethomepage(){
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}
	
	public SymptomsPage getsymptomspage() {
		return (symptomspage == null) ? symptomspage = new SymptomsPage(driver) : symptomspage;
	}
			
	public SelectAgePage getselectagepage() {
		return (selectagepage == null) ? selectagepage = new SelectAgePage(driver) : selectagepage;
	}
	
	public ReliefPage getselectreliefpage() {
		return (selectreliefpage == null) ? selectreliefpage = new ReliefPage(driver) : selectreliefpage;
	}
	public StrengthPage getproductstrengthpage() {
		return (productstrengthpage == null) ? productstrengthpage = new StrengthPage(driver) : productstrengthpage;
	}
	
	public PreferencePage getselectedproductspage() {
		return (selectedproductspage == null) ? selectedproductspage = new PreferencePage(driver) : selectedproductspage;
	}
	
	public TestPage gettestpage() {
		return (testPage == null) ? testPage = new TestPage(driver) : testPage;
	}
	
	public FormPage getproductformpage() {
		return (productformpage == null) ? productformpage = new FormPage(driver) : productformpage;
	}
}
