package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import testBase.BaseClass;

public class TC_001_HOMEPAGE extends BaseClass {

	HomePage homePage;
	
	@Test
	public void testPageURLTitle() {
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.getPageTitle(), "Your Store");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=common/home");
	}

}
	

