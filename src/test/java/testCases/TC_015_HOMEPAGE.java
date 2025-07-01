package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_015_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testFeaturedHeadingVisibilityAndText() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isFeaturedHeadingDisplayed());
		Assert.assertTrue(homePage.getFeaturedHeadingText().contains("Featured"));
	}

}
