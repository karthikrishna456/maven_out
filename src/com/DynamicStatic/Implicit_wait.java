package com.DynamicStatic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthickpriya");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("priya");

		WebElement login = driver.findElement(By.name("login"));
		login.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File shot = new File("C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Screen\\iufwufhw.jpg");
		FileUtils.copyFile(screenshotAs, shot);

		System.out.println("screendone");
	}

}
