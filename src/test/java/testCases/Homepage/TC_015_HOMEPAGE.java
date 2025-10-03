package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_015_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Featured Section")
	@Story("TC_015_HOMEPAGE - Verify “Featured” Section Heading")
	@Test(description = "Verify that the heading text \"Featured\" is shown above the featured products.")
	@Severity(SeverityLevel.MINOR)
	public void testFeaturedHeadingVisibilityAndText() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isFeaturedHeadingDisplayed());
		Assert.assertTrue(homePage.getFeaturedHeadingText().contains("Featured"));
	}

}
