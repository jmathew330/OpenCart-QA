package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_005_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Feature("Header Elements")
	@Story("TC_005_HOMEPAGE - Verify My Account Options")
	@Test(description = "Verify the My Account dropdown contains correct options.")
	@Severity(SeverityLevel.BLOCKER)
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
