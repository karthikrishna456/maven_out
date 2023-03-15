package Xpath_in_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");

		WebDriver karthi = new ChromeDriver();

		karthi.manage().window().maximize();

		karthi.get("https://www.flipkart.com/");
		
//		String currentUrl = karthi.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//		String title = karthi.getTitle();
//		System.out.println(title);

		System.out.println("done");

	}

}
