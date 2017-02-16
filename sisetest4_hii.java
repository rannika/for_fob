package sisetest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sisetest4_hii {

		@Test
		public void findLinkHiiu() throws InterruptedException {
		//public static void main(String[] args) throws InterruptedException {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Anni\\Desktop\\Selenium\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.siseveeb.ee/");
			// driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		//	WebElement link;
			driver.findElement(By.id("filter_input")).sendKeys("Hiiu");
			driver.findElement(By.partialLinkText("Hiiu")).click();		
			
			boolean status =driver.findElement(By.partialLinkText("Hiiu")).isDisplayed();
			Assert.assertTrue(status);
			Thread.sleep(5000);
				driver.quit(); 
		}

	}