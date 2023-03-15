package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Driver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\geckodriver.exe");
	
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("https://www.youtube.com/");
	
	System.out.println("done");
	
	
	}

	

	
		
	
	
	
	
}
