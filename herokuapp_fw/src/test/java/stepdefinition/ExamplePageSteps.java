package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageobjects.ExamplePage;

public class ExamplePageSteps {
	
	ExamplePage examplePage;
	PageObjectManager pageObjectManager;
	
	public  ExamplePageSteps(PageObjectManager pageObjectManager) {
		examplePage = pageObjectManager.getExamplePage();
	}

	@When("^user clicks on start button$")
	public void user_clicks_on_start_button() throws Throwable {
		examplePage.clickStartButton();
	}

	@Then("^Hello World test appears$")
	public void hello_World_test_appears() throws Throwable {
		String HelloText = examplePage.getHelloText();
		System.out.println(HelloText);
	}


	
	
	
	
}
