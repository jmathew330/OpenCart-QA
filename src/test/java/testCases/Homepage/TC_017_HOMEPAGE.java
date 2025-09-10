package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import testBase.BaseClass;

public class TC_017_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Test
	public void testFeaturedAddToCartButtonVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFeaturedImagesAddToCartButtons();
		Assert.assertTrue(homePage.isFeaturedImagesAddToCartButtonsDisplayed());
	}
	
	@Test
	public void testFeaturedAddToWishListButtonVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFeaturedWishListButtons();
		Assert.assertTrue(homePage.isFeaturedWishListButtonsDisplayed());
	}
	
	@Test
	public void testFeaturedCompareThisProductButtonVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFeaturedCompareProductButtons();
		Assert.assertTrue(homePage.isFeaturedCompareProductButtonsDisplayed());
	}

}
