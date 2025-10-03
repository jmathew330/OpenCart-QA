package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_006_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Feature("Header Elements")
	@Story("TC_006_HOMEPAGE - Verify Wish List Display")
	@Test(description = "Verify that the wish list link and item count are visible.")
	@Severity(SeverityLevel.MINOR)
	public void testWishListElementVisibiityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isWishListIconDisplayed());
		Assert.assertTrue(homePage.isWishListLabelDisplayed());
		Assert.assertTrue(homePage.getWishListText().contains("Wish List"));
	}

}
