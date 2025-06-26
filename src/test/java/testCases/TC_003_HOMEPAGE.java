package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;

public class TC_003_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testCurrencyDropDownElement_HeaderUI() {
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
