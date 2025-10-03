package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_014_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Slideshow")
	@Story("TC_014_HOMEPAGE - Verify Slider Images Sequence")
//	@Test(description = "Verify that slideshow displays correct images in proper sequence.")
	@Severity(SeverityLevel.MINOR)
	public void testImageGalleryPicturesVisibility_iPhone() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isIPhoneImageDisplayed());
	}
	
	@Feature("Slideshow")
	@Story("TC_014_HOMEPAGE - Verify Slider Images Sequence")
//	@Test(description = "Verify that slideshow displays correct images in proper sequence.")
	@Severity(SeverityLevel.MINOR)
	public void testImageGalleryPicturesVisibility_MacBookAir() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isMacBookAirImageDisplayed());
	}

}
