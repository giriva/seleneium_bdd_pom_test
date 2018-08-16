package stepdefinition;

import cucumber.api.java.en.Given;
import managers.PageObjectManager;
import pageobjects.ChallengingDOMPage;
import pageobjects.DynamicallyLoadedPage;

public class DynamicLoadingSteps {
	
	DynamicallyLoadedPage dynamicallyLoadedPage;
	PageObjectManager pageObjectManager;
	
	public  DynamicLoadingSteps(PageObjectManager pageObjectManager) {
		dynamicallyLoadedPage = pageObjectManager.getDynamicallyLoadedPage();
	}
	
	@Given("^user clicks on Dynamic loading$")
	public void user_clicks_on_Dynamic_loading() throws Throwable { 
		dynamicallyLoadedPage.clickExample2();
	}

}
