package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_007_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	


	@Feature("Header Elements")
	@Story("TC_007_HOMEPAGE - Verify Shopping Cart Display")
	@Test(description = "Verify that the shopping cart icon and label are visible in the header.")
	@Severity(SeverityLevel.BLOCKER)
	public void testShoppingCartElementVisibilityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isShoppingCartIconDisplayed());
		Assert.assertTrue(homePage.isShoppingCartLabelDisplayed());
		Assert.assertTrue(homePage.getShoppingCartText().contains("Shopping Cart"));
	}

}
