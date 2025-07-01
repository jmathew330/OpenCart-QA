package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;

public class TC_005_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Test
	public void testMyAccountDropDownElementVisibilityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isMyAccountIconDisplayed());
		Assert.assertTrue(homePage.isMyAccountDropDownDisplayed());
		homePage.openMyAccountDropdown();
		Assert.assertTrue(homePage.getMyAccountDropDownText().contains("My Account"));
		Assert.assertTrue(homePage.isRegisterOptionDisplayed());
		Assert.assertTrue(homePage.getRegisterOptionText().contains("Register"));
		Assert.assertTrue(homePage.isLoginOptionDisplayed());
		Assert.assertTrue(homePage.getLoginOptionText().contains("Login"));
	}

}
