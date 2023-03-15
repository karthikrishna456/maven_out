  package com.windows_handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_handling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Seleniumaddinproject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486459496700&hvpos=&hvnetw=g&hvrand=9339699856437067681&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=CjwKCAiAzp6eBhByEiwA_gGq5G3ZsnzkdrQ1FqW49DU5BqzdL8youSFlFxmhu3amOG1lTFOXDtOI1hoCvvsQAvD_BwE");
 
		Actions ac = new Actions(driver);
		Robot rb = new Robot();

		WebElement customer = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));

		ac.moveToElement(customer).build().perform();
		ac.contextClick(customer).build().perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement electronics = driver.findElement(By.xpath("(//a[text()=' Electronics '])[1]"));

		ac.moveToElement(electronics).build().perform();
		ac.contextClick(electronics).build().perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));

		ac.moveToElement(fashion).build().perform();
		ac.contextClick(fashion).build().perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		String windowHandle = driver.getWindowHandle();

		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();

//		for (String handles : windowHandles) {// TYPE for-- select the foreach.//
//
//			String title = driver.switchTo().window(handles).getTitle();// in the above mentioned code is option method
																		// for testing----> for open all TAB folder.
		String ele = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for (String brk : windowHandles) {
			
			if (driver.switchTo().window(brk).getTitle().equals(ele)) {
				break;
			}
			
			
		}
		
		System.out.println("done...");

		}

	}


