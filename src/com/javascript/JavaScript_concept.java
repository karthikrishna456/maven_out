package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Seleniumaddinproject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1jyasdi57f_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=4632358371447929508&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-295905178780&hydadcr=14451_2154369&gclid=Cj0KCQiAn4SeBhCwARIsANeF9DKF9_6wxgBWn7kBnSiQKABfC1cWEerJdpzSqH0DPlBPqMr_VMtCcr0aArjnEALw_wcB");

		JavascriptExecutor js = (JavascriptExecutor) driver; // JavaScriptExecutor SYNTAX

		js.executeScript("window.scrollBy(0,3000)");// 1. method of using is (just
		// scroll the window in automated) SCROLL DOWN

		System.out.println("done is up");

//		js.executeScript("window.scrollBY(-5000,3000)"); 2. SCROLL UP METHOD

		// 3. method

		WebElement youtube = driver.findElement(By.xpath("//a[text()='Instagram']"));

		js.executeScript("arguments[0].scrollIntoView();", youtube);

		System.out.println("done");
	}

}
