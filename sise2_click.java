package sisetest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sise2_click {
	@Test(description="Clicks and Navigates to the Näidiskeskkond page")
	
	public void openNaidisPage() throws InterruptedException {
			WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anni\\Desktop\\Selenium\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.siseveeb.ee/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.findElement(By.id("filter_input")).sendKeys("Näidis");
				
		driver.findElement(By.linkText("Näidiskeskkond")).click();
		Thread.sleep(3000);
		boolean status =driver.findElement(By.id("mainmenu")).isDisplayed();
		Assert.assertTrue(status);
		  System.out.println("Näidiskeskkond click is OK");
		  driver.quit();  
	}

}
