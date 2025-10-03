package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_003_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("UI Basics")
	@Story("TC_003_HOMEPAGE - Verify Currency Dropdown Options")
	@Test(description = "Verify the currency dropdown contains all expected options.")
	@Severity(SeverityLevel.NORMAL)
	public void testCurrencyDropDownElementVisibilityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isCurrencyDropDownDisplayed());
		Assert.assertTrue(homePage.getCurrencyDropdownText().contains("Currency"));
		homePage.openCurrencyDropdown();
		Assert.assertTrue(homePage.isEuroOptionDisplayed());
		Assert.assertTrue(homePage.isPoundOptionDisplayed());
		Assert.assertTrue(homePage.isUSOptionDisplayed());
		Assert.assertTrue(homePage.getEuroOptionText().contains("€Euro"));
		Assert.assertTrue(homePage.getPoundOptionText().contains("£Pound Sterling"));
		Assert.assertTrue(homePage.getUSOptionText().contains("$US Dollar"));
	}

}
