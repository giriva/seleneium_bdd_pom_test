package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;

public class HomePage {

	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH , using= "//*[@id=\"content\"]/ul/li[4]/a")
	private WebElement challengingDOM;	
	
	@FindBy(how = How.XPATH , using= "//*[@id=\"content\"]/ul/li[12]/a")
	private WebElement dynamicLoading;	
	
	
	public void getHome(){
		driver.get(configFileReader.getURl());
	}
	public void clickOnChallenging(){
		challengingDOM.click();
	}
	public void clickOnDynamicLoading(){
		dynamicLoading.click();
	}
	
	
	
	
}
