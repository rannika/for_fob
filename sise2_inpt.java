package sisetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class sise2_inpt {
	@Test(description="typing Näidis to filter_input")
	public void filterInput() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anni\\Desktop\\Selenium\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.siseveeb.ee/");
		// driver.manage().window().maximize();
				driver.findElement(By.id("filter_input")).sendKeys("Näidis");
				Thread.sleep(3000); 
				driver.close();
			
	}

}
