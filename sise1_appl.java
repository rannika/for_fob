package sisetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
 

public class sise1_appl {
@Test
public void siseapplic() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anni\\Desktop\\Selenium\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.siseveeb.ee");
			driver.manage().window().maximize();
			driver.close();
		
			System.out.println("Siseveeb is OK");
		
	}

}