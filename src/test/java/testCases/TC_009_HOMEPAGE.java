package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_009_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testSearchBarVisibility_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isSearchBoxDisplayed());
		Assert.assertTrue(homePage.isSearchButtonDisplayed());
	}

}
