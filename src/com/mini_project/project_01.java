package com.mini_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class project_01 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Seleniumaddinproject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Actions ac = new Actions(driver);

		driver.get(
				"https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gclid=Cj0KCQiAic6eBhCoARIsANlox85oGt4N6GdOrbQSedX0BLpwoJDOM255KqFwaGaGK5VPdg_HcKbyeQQaAmMOEALw_wcB");

		driver.manage().window().maximize();

		WebElement sign = driver.findElement(By.xpath("//button[text()='Sign in']"));
		ac.moveToElement(sign).build().perform();
		ac.click().build().perform();

		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		ac.moveToElement(signin).build().perform();
		ac.click().build().perform();
  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement mobileno = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		mobileno.sendKeys("8610688420");

		WebElement proceed = driver.findElement(By.xpath("//button[@id='submitVerification']"));
		ac.moveToElement(proceed).build().perform();
		ac.click().build().perform();

		WebElement otp = driver.findElement(By.xpath("//input[@placeholder=\"OTP\"]"));
		Scanner s = new Scanner(System.in);// using SCANNER METHOD for enter the value for example OTP.(JAVA_CONCEPT)
		System.out.println("enter the otp");
		String num = s.next();
		otp.sendKeys(num);

		WebElement verify = driver.findElement(By.xpath("//button[text()='verify']"));
		ac.moveToElement(verify).build().perform();
		ac.click().build().perform();

		WebElement makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
		ac.moveToElement(makeup).build().perform();

		WebElement foundation = driver.findElement(By.xpath("(//a[text()='Foundation'])[2]"));
		ac.moveToElement(foundation).build().perform();
		ac.click().build().perform();

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.print(title);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String windows : windowHandles) {
			String title1 = driver.switchTo().window(windows).getTitle();
		}

		JavascriptExecutor z = (JavascriptExecutor) driver;
		z.executeScript("window.scrollBy(0,3000)");

		WebElement studio = driver.findElement(By.xpath("//div[text()='M.A.C Studio Fix Fluid SPF 15 Mini']"));
		ac.moveToElement(studio).build().perform();

		WebElement shades = driver.findElement(By.xpath("(//button[text()='Preview Shades'])[12]"));
		ac.moveToElement(shades).build().perform();
		ac.click().build().perform();

		WebElement bag = driver.findElement(By.xpath("//span[text()='Add to Bag']"));
		ac.moveToElement(bag).build().perform();
		ac.click().build().perform();

		WebElement count = driver.findElement(By.xpath("//span[@class='cart-count']"));
		ac.moveToElement(count).build().perform();
		ac.click().build().perform();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);

		WebElement pro = driver.findElement(By.xpath("//span[text()='Proceed']"));
		ac.moveToElement(pro).build().perform();
		ac.click().build().perform();

		WebElement address = driver.findElement(By.xpath("//p[text()='Add New Address']"));
		ac.moveToElement(address).build().perform();
		ac.click().build().perform();

		Thread.sleep(500);

		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		pincode.click();
		pincode.sendKeys("600049");

		Thread.sleep(500);

		WebElement flatNo = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		flatNo.click();
		flatNo.sendKeys("30");

		Thread.sleep(500);

		WebElement area = driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		area.click();
		area.sendKeys("villivakkam");

		Thread.sleep(500);

		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.click();
		name.sendKeys("karthick");

		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phone.click();
		phone.sendKeys("8610688420");

		Thread.sleep(500);

		WebElement gmail = driver.findElement(By.xpath("//input[@placeholder='Email ID (Optional)']"));
		gmail.click();
		gmail.sendKeys("karthikrishna456@gamil.com");

		WebElement ship = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
		ac.moveToElement(ship).build().perform();
		ac.click().build().perform();

		WebElement delivery = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
		ac.moveToElement(delivery).build().perform();
		ac.click().build().perform();

		WebElement order = driver.findElement(By.xpath("//button[text()='Place order']"));
		ac.moveToElement(order).build().perform();
		ac.click().build().perform();

		System.out.println("NYKAA PROJECT DONE..");

	}
}
