package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import testBase.BaseClass;

public class TC_010_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testSearchBarPlaceholderTextVisibility_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSearchBarPlaceholderText().contains("Search"));
	}

}
