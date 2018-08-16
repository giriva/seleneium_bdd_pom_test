package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;

public class ChallengingDOMPage {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public ChallengingDOMPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS , using= "div.row:nth-child(4) > div:nth-child(1)")
	private WebElement redButton;	

	public void clickRedButton(){
		redButton.click();
	}
	
	public String getLabel(){
		return redButton.getText();
	}
}
