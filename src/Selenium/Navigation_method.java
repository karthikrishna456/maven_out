package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// syntax

		driver.manage().window().maximize();// windows maximize agarathuku use pandrathu.(syntax)

		driver.get("https://www.instagram.com/");

		String title = driver.getTitle();// webdriver method
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();// webdriver method
		System.out.println(currentUrl);

		driver.navigate().to("https://www.facebook.com/");// --> NAVIGATE METHOD (to)

		String title1 = driver.getTitle();// webdriver method
		System.out.println(title1);

		String currentUrl1 = driver.getCurrentUrl();// webdriver method
		System.out.println(currentUrl1);

		driver.navigate().back();//-->NAVIGATE METHOD( return back to previous Url)

		driver.navigate().forward();// --> NAVIGATE METHOD (same process in BACK method )

	 driver.navigate().refresh();//--> NAVIGATE METHOD (once URL create achina again refresh pannum URL)

		driver.quit();//--> NAVIGATE METHOD (URL minimize agum)

		driver.close();//--->NAVIGATE METHOD (total close agum)

		System.out.println("done");

	}

}
