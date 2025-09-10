package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;

import pages.HomePage;
import testBase.BaseClass;

public class TC_008_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testCheckoutElementVisibilityAndText_HeaderUI(){
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isCheckoutIconDisplayed());
		Assert.assertTrue(homePage.isCheckoutLabelDisplayed());
		Assert.assertTrue(homePage.getCheckoutText().contains("Checkout"));
	}

}
