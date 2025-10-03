package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_004_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Header Elements")
	@Story("TC_004_HOMEPAGE - Verify Phone Number Display")
	@Test(description = "Verify the phone icon and phone number are visible in the header.")
	@Severity(SeverityLevel.MINOR)
	public void testPhoneElementVisibilityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isPhoneIconDisplayed());
		Assert.assertTrue(homePage.isPhoneNumberLabelDisplayed());
		Assert.assertTrue(homePage.getPhoneNumberText().contains("123456789"));
	}

}
