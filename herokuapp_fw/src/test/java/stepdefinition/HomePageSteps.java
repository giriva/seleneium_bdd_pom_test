package stepdefinition;

import cucumber.api.java.en.Given;
import managers.PageObjectManager;
import pageobjects.HomePage;

public class HomePageSteps {

	HomePage homePage;
	PageObjectManager pageObjectManager;
	
	public  HomePageSteps(PageObjectManager pageObjectManager) {
		homePage = pageObjectManager.getHomePageObject();
	}
	
	@Given("^user is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		homePage.getHome();
	}
	
	@Given("^user clicks on the challenge DOM$")
	public void user_clicks_on_the_challenge_DOM() throws Throwable {
		homePage.clickOnChallenging();
	}

	
}
