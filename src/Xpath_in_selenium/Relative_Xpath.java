package Xpath_in_selenium;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.basic.BasicFileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");

		WebDriver karthi = new ChromeDriver();// selenium syntax

		karthi.get("https://www.flipkart.com/");
		
		TakesScreenshot ts = (TakesScreenshot) karthi;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File shot = new File("C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Screen\\iufwufhw.png");
		FileUtils.copyFile(screenshotAs, shot);
		
		System.out.println("screendone");
		


	}
}
