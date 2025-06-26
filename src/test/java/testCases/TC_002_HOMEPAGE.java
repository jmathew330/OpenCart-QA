package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import testBase.BaseClass;

public class TC_002_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testLogo() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isLogoDisplayed());
		Assert.assertTrue(homePage.getLogoText().contains("Qafox.com"));
	}

}
