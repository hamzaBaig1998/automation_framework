package tests;
import pages.CarbohydrateCalculatorPage;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CarbohydratesTest extends BaseTest{
	private String age="100";
	
	@Test
	public void verifyErrorMessageForAgeExceeding80() {
		CarbohydrateCalculatorPage calculatorPage= new CarbohydrateCalculatorPage(driver);
		
		navigateToPage("https://www.calculator.net/carbohydrate-calculator.html");
		
		calculatorPage.enterAge(age);
		calculatorPage.clickCalculateBtn();
		boolean isWarningTextPresent=calculatorPage.verifyPageContainsAgeWarning();
		
		Assert.assertTrue(isWarningTextPresent,"The page contains warning.");
	}
}
