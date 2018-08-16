package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.Util;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageobjects.ChallengingDOMPage;

public class ChallengingDOMSteps {
	
	ChallengingDOMPage challengingDOMPage;
	PageObjectManager pageObjectManager;
	Util util;
	String beforeClick;
	String afterClick;
	
	
	public  ChallengingDOMSteps(PageObjectManager pageObjectManager) {
		challengingDOMPage = pageObjectManager.getChallengingDOMPage();
	}

	@When("^user clicks red button$")
	public void user_clicks_red_button() throws Throwable {
		beforeClick = challengingDOMPage.getLabel();
		challengingDOMPage.clickRedButton();
	}
	
	@Then("^label of the red button changes$")
	public void label_of_the_red_button_changes() throws Throwable {
	util.getWait().until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[id$='56a58642d71d'][class='button alert']")));
	afterClick = challengingDOMPage.getLabel();
	if(beforeClick == afterClick){
		System.out.println("label not changed");
	}else
	{
		System.out.println("label changed");
	}
	}
}
