package commons;

import org.openqa.selenium.support.ui.WebDriverWait;

import managers.ConfigFileReader;
import managers.WebDriverManager;

public class Util {
	
	WebDriverManager webDriverManager;
	ConfigFileReader configFileReader;
	
	public WebDriverWait getWait(){
		return new WebDriverWait(webDriverManager.getDrvier(), configFileReader.getSeconds());
	}
}
