package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_018_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testCompanyLogosVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToCompanyLogosSwiper();
		System.out.println(homePage.isCompanyLogosDisplayed());
		//Assert.assertTrue(homePage.isCompanyLogosDisplayed());
	}

}
