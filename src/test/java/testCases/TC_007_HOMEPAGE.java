package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;

public class TC_007_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Test
	public void testShoppingCartElementVisibilityAndText_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isShoppingCartIconDisplayed());
		Assert.assertTrue(homePage.isShoppingCartLabelDisplayed());
		Assert.assertTrue(homePage.getShoppingCartText().contains("Shopping Cart"));
	}

}
