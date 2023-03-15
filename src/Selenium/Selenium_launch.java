package Selenium;

import javax.swing.filechooser.FileSystemView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_launch {

public static void main(String[] args) {
	
	// ethu just Automation testing selenium process work pandrathu.
	
	System.setProperty("webdriver.chrome.driver",// ethu key
			"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");//ethu value

	
	WebDriver driver = new ChromeDriver();// SELENIUM syntax 
	
	driver.get("https://www.instagram.com/");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	System.out.println("verifed");// ETHU JUST OUR PROCESS OVER ACHA illayanu pakkarathu kaga    
}
	
	
	

}
