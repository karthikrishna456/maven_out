package com.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Seleniumaddinproject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// ---> Wait method

		driver.manage().window().maximize();// --> windox maximize

		driver.switchTo().frame("singleframe");// --> option method 1 for console the frame, it's eastest method.
//		              (or)
		WebElement single = driver.findElement(By.id("singleframe"));// --> option method 2 for console the frame, it's
																		// normal method.
		driver.switchTo().frame(single);

		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("this is single frame");

		System.out.println("single frame is done");

		// switch out of the frame

		driver.switchTo().defaultContent();

		// find the webElement of nested frame or multiple frame

		driver.switchTo().frame("//iframe[@src='MultipleFrames.html']");
		// (or)
		WebElement multiframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multiframe);

		driver.switchTo().frame("//iframe[@src='SingleFrame.html']");

		// (or)

		WebElement singleframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(singleframe);

		WebElement textframe = driver.findElement(By.xpath("(//input[@type='text'])"));
		textframe.sendKeys("this is nested frame");

		System.out.println("nestedframe is done ");

	}

}
