package managers;

import org.openqa.selenium.WebDriver;

import pageobjects.ChallengingDOMPage;
import pageobjects.DynamicallyLoadedPage;
import pageobjects.ExamplePage;
import pageobjects.HomePage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homepage;
	private ChallengingDOMPage challengingDOMPage;
	private ExamplePage examplePage;
	private DynamicallyLoadedPage dynamicallyLoadedPage;
	
	public PageObjectManager(WebDriver driver){	
		this.driver = driver;
	}

	public HomePage getHomePageObject(){
		return(homepage == null) ? new HomePage(driver) : homepage;
	}
	
	public ChallengingDOMPage getChallengingDOMPage(){
		return(challengingDOMPage == null) ? new ChallengingDOMPage(driver) : challengingDOMPage;
	}
	
	public DynamicallyLoadedPage getDynamicallyLoadedPage(){
		return(dynamicallyLoadedPage == null) ? new DynamicallyLoadedPage(driver) : dynamicallyLoadedPage;
	}
	
	public ExamplePage getExamplePage(){
		return(examplePage == null) ? new ExamplePage(driver) : examplePage;
	}
	
	}
