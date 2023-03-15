package com.switch2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_01 {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	}
	
	
	
}
