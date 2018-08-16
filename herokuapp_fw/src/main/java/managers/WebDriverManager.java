package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	
	ConfigFileReader configFileReader = null;
	
	public WebDriver getDrvier(){
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	
}
