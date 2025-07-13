package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_019_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Test
	public void testFooterHeadingsVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFooter();
		Assert.assertTrue(homePage.isFooterHeadingsDisplayed());
	}
	
	@Test
	public void testFooterHeadingsText() {
		homePage = new HomePage(driver);
		String actualFooterHeadingsTextString = homePage.getFooterHeadingsText();
		List<String> actualFooterHeadingsText = Arrays.asList(actualFooterHeadingsTextString.split(";\\s*"));
		List<String> expectedFooterHeadingsText = Arrays.asList("Information", "Customer Service", "Extras", "My Account");
		Assert.assertEquals(actualFooterHeadingsText, expectedFooterHeadingsText);
	}

}
