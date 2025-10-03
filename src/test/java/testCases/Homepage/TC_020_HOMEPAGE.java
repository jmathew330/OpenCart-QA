package testCases.Homepage;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_020_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Footer Content")
	@Story("TC_020_HOMEPAGE - Verify Footer Hyperlinks Grouping")
	@Test(description = "Verify all footer links are grouped under correct headings.")
	@Severity(SeverityLevel.NORMAL)
	public void testFooterHyperlinksVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFooter();
		Assert.assertTrue(homePage.isFooterHyperlinksDisplayed());
	}
	
	@Feature("Footer Content")
	@Story("TC_020_HOMEPAGE - Verify Footer Hyperlinks Grouping")
	@Test(description = "Verify all footer links are grouped under correct headings.")
	@Severity(SeverityLevel.NORMAL)
	public void testFooterHyperlinksText() {
		homePage = new HomePage(driver);
		String actualFooterHyperlinksTextString = homePage.getFooterHyperlinksText();
		List<String> actualFooterHyperlinksText = Arrays.asList(actualFooterHyperlinksTextString.split(";\\s*"));
		List<String> expectedFooterHyperlinksText = Arrays.asList("About Us", "Delivery Information", "Privacy Policy", "Terms & Conditions", "Contact Us", "Returns", "Site Map", "Brands", "Gift Certificates", "Affiliate", "Specials", "My Account", "Order History", "Wish List", "Newsletter");
		Assert.assertEquals(actualFooterHyperlinksText,expectedFooterHyperlinksText);
	}

}
