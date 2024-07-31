package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarbohydrateCalculatorPage {
	private WebDriver driver;
	
	public CarbohydrateCalculatorPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterAge(String age) {
		WebElement ageInput= driver.findElement(By.xpath("//*[@id=\"cage\"]"));
		ageInput.clear();
		ageInput.sendKeys(age);
	}
	
	public void clickCalculateBtn() {
		WebElement calculateBtn= driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/form/table[4]/tbody/tr[3]/td[2]/input[3]"));
		calculateBtn.click();
	}
	
	public boolean verifyPageContainsAgeWarning() {
		WebElement warningElement= driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/font"));
		return warningElement.getText().contains("Please provide an age between 18 and 80.");
	}
	
}
