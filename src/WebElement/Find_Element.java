package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Karthick\\eclipse-workspace\\Selenium add in project\\Driver\\chromedriver.exe");

		WebDriver karthi = new ChromeDriver();// selenium syntax

		karthi.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

//		WebElement ID = karthi.findElement(By.id("email"));// find element syntax (crtl + 2 =l press make written type)
//
//		ID.sendKeys("karthi@123.com");
//
//		WebElement ID1 = karthi.findElement(By.name("pass"));
//   
//		ID1.sendKeys("priyakarthick");// sendkeys use for the only Input values
//
//		WebElement user1 = karthi.findElement(By.name("login"));
//		user1.click();// for only using this method is once click the button in automatic testing
		// process

		WebElement frist = karthi.findElement(By.xpath("//input[@type='text']"));

		frist.sendKeys("karthi");

		WebElement last = karthi.findElement(By.xpath("(//input[@type='text'])[2]"));
		last.sendKeys("krishna");
	}

}
