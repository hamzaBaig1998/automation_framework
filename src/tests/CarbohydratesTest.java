package tests;
import pages.CarbohydrateCalculatorPage;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CarbohydratesTest extends BaseTest{
	private String age="100";
	private String search="Calorie Calculator";
	
	
	@Test
	public void VerifyFormValidationForAgeField() {
		CarbohydrateCalculatorPage calculatorPage= new CarbohydrateCalculatorPage(driver);
		navigateToPage("https://www.calculator.net/carbohydrate-calculator.html");
		
		calculatorPage.enterAge(age);
		calculatorPage.clickCalculateBtn();
		boolean isWarningTextPresent=calculatorPage.verifyPageContainsAgeWarning();
		
		Assert.assertTrue(isWarningTextPresent,"The page contains warning.");
	}
	
	@Test
	public void VerifyUserCanSearchForDifferentCalculators() {
		CarbohydrateCalculatorPage calculatorPage= new CarbohydrateCalculatorPage(driver);
		navigateToPage("https://www.calculator.net/carbohydrate-calculator.html");
		
		calculatorPage.searchCalculator(search);
		calculatorPage.clickSearchedCalculator(search);
		
		boolean isNavigatedToPage=calculatorPage.verifyTitleOfPage(search);
		
		Assert.assertTrue(isNavigatedToPage,"User is navigated to the searched calculator");
	}

}
