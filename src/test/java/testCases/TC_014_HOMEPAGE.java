package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_014_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testImageGalleryPicturesVisibility_iPhone() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isIPhoneImageDisplayed());
	}
	
	@Test
	public void testImageGalleryPicturesVisibility_MacBookAir() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isMacBookAirImageDisplayed());
	}

}
