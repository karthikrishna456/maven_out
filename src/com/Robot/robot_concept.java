package com.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot_concept {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Seleniumaddinproject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));

		Actions ac = new Actions(driver);

		ac.moveToElement(email).build().perform();

		Robot rb = new Robot();

		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_A);

		rb.keyPress(KeyEvent.VK_K);
		rb.keyRelease(KeyEvent.VK_A);

		System.out.println("done");

	}

}
