package config;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class MainDriver {
	private static WebDriver driver;
	
//	For this assignment I am only using ChromeDriver, but we can change the driver from chrome to firefox 
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void quit() {
		driver.quit();
	}

}
