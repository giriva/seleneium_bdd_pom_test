package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;

public class DynamicallyLoadedPage {

	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public DynamicallyLoadedPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH , using= "//*[@id=\"content\"]/div/a[2]")
	private WebElement example2;	
	
	public void clickExample2(){
		example2.click();
	}
	
	
}
