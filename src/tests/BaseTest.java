package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import config.MainDriver;

import org.testng.annotations.AfterClass;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver= MainDriver.getDriver();
	}
	
	protected void navigateToPage(String url) {
		driver.get(url);
	}
	
	@AfterClass
	public void teardown() {
		MainDriver.quit();
	}
	
}
