package com.dropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_concept {

	public static void main (String[] arg) {
		
		System.setProperty("webdriver.chrome.driver ", 
				"C:\\Users\\Karthick\\eclipse-workspace\\Seleniumaddinproject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		
	}
	
	
	
}
