package testCases.Homepage;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import pages.HomePage;
import testBase.BaseClass;

public class TC_020_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testFooterHyperlinksVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFooter();
		Assert.assertTrue(homePage.isFooterHyperlinksDisplayed());
	}
	
	@Test
	public void testFooterHyperlinksText() {
		homePage = new HomePage(driver);
		String actualFooterHyperlinksTextString = homePage.getFooterHyperlinksText();
		List<String> actualFooterHyperlinksText = Arrays.asList(actualFooterHyperlinksTextString.split(";\\s*"));
		List<String> expectedFooterHyperlinksText = Arrays.asList("About Us", "Delivery Information", "Privacy Policy", "Terms & Conditions", "Contact Us", "Returns", "Site Map", "Brands", "Gift Certificates", "Affiliate", "Specials", "My Account", "Order History", "Wish List", "Newsletter");
		Assert.assertEquals(actualFooterHyperlinksText,expectedFooterHyperlinksText);
	}

}
