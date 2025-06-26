package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.HomePage;
import testBase.BaseClass;

public class TC_006_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Test
	public void testWishListElement_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isWishListIconDisplayed());
		Assert.assertTrue(homePage.isWishListLabelDisplayed());
		Assert.assertTrue(homePage.getWishListText().contains("Wish List"));
	}

}
