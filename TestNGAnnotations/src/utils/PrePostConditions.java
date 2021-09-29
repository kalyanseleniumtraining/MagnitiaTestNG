package utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class PrePostConditions {
	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("http://ebay.com");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
