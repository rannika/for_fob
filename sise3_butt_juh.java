package sisetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class sise3_butt_juh {
	@Test(description="Clicks and Navigates to the Juhendid page")
	
	public void openJuhPage() throws InterruptedException {
	// public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anni\\Desktop\\Selenium\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.siseveeb.ee/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement link;
		link = driver.findElement(By.linkText("Juhendid"));
		link.click();
		boolean status =driver.findElement(By.linkText("Parent Directory")).isDisplayed();
		Assert.assertTrue(status);
		Thread.sleep(5000);
			driver.quit(); 
			
			}

}
