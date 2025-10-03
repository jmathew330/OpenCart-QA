package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_002_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("UI Basics")
	@Story("TC_002_HOMEPAGE - Verify Presence of Logo")
	@Test(description = "Verify that the homepage logo is visible and displays correct text.")
	@Severity(SeverityLevel.MINOR)
	public void testLogoVisibilityAndText() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isLogoDisplayed());
		Assert.assertTrue(homePage.getLogoText().contains("Qafox.com"));
	}

}
