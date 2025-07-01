package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.HomePage;
import testBase.BaseClass;

public class TC_004_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testPhoneElementVisibilityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isPhoneIconDisplayed());
		Assert.assertTrue(homePage.isPhoneNumberLabelDisplayed());
		Assert.assertTrue(homePage.getPhoneNumberText().contains("123456789"));
	}

}
