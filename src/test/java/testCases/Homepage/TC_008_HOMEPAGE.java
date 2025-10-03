package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_008_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Header Elements")
	@Story("TC_008_HOMEPAGE - Verify Checkout Link")
	@Test(description = "Verify that the checkout link and icon are present in the header.")
	@Severity(SeverityLevel.BLOCKER)
	public void testCheckoutElementVisibilityAndText_HeaderUI(){
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isCheckoutIconDisplayed());
		Assert.assertTrue(homePage.isCheckoutLabelDisplayed());
		Assert.assertTrue(homePage.getCheckoutText().contains("Checkout"));
	}

}
