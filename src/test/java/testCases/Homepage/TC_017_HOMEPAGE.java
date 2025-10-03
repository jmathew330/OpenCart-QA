package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_017_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Feature("Featured Section")
	@Story("TC_017_HOMEPAGE - Verify Featured Product Action Buttons")
	@Test(description = "Verify each featured product has buttons: Add to Cart, Add to Wish List, Compare.")
	@Severity(SeverityLevel.BLOCKER)
	public void testFeaturedAddToCartButtonVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFeaturedImagesAddToCartButtons();
		Assert.assertTrue(homePage.isFeaturedImagesAddToCartButtonsDisplayed());
	}
	

	@Feature("Featured Section")
	@Story("TC_017_HOMEPAGE - Verify Featured Product Action Buttons")
	@Test(description = "Verify each featured product has buttons: Add to Cart, Add to Wish List, Compare.")
	@Severity(SeverityLevel.BLOCKER)
	public void testFeaturedAddToWishListButtonVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFeaturedWishListButtons();
		Assert.assertTrue(homePage.isFeaturedWishListButtonsDisplayed());
	}
	

	@Feature("Featured Section")
	@Story("TC_017_HOMEPAGE - Verify Featured Product Action Buttons")
	@Test(description = "Verify each featured product has buttons: Add to Cart, Add to Wish List, Compare.")
	@Severity(SeverityLevel.BLOCKER)
	public void testFeaturedCompareThisProductButtonVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFeaturedCompareProductButtons();
		Assert.assertTrue(homePage.isFeaturedCompareProductButtonsDisplayed());
	}

}
