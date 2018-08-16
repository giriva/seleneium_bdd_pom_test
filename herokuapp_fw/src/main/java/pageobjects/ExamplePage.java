package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;

public class ExamplePage {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public ExamplePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH , using= "//*[@id=\"start\"]/button")
	private WebElement startButton;	
	
	@FindBy(how = How.XPATH , using= "//*[@id=\\\"finish\\\"]/h4")
	private WebElement helloWorld;	
	
	
	public void clickStartButton(){
		startButton.click();
	}
	
	public String getHelloText(){
		
		String text = helloWorld.getText();
		
		return text;
		
		
	}

}
