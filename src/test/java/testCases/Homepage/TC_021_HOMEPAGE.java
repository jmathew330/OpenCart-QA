package testCases.Homepage;


import org.testng.annotations.Test;
import org.testng.Assert;

import pages.HomePage;
import testBase.BaseClass;

public class TC_021_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Test(priority=1)
	public void testDesktopsMenuPageRedirection_PC() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToDesktopLink();
		homePage.clickDesktopLink_PC();
		Assert.assertEquals(homePage.getPageTitle(), "PC");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=20_26");
		Assert.assertTrue(homePage.getDesktopsLink_PC_HeadingText().contains("PC"));
	}

	@Test(priority=2)
	public void testDesktopsMenuPageRedirection_Mac() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToDesktopLink();
		homePage.clickDesktopLink_Mac();
		Assert.assertEquals(homePage.getPageTitle(), "Mac");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=20_27");
		Assert.assertTrue(homePage.getDesktopsLink_Mac_HeadingText().contains("Mac"));
	}
	
	@Test(priority=3)
	public void testDesktopsMenuPageRedirection_Desktops() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToDesktopLink();
		homePage.clickDesktopLink_Desktops();
		Assert.assertEquals(homePage.getPageTitle(), "Desktops");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=20");
		Assert.assertTrue(homePage.getDesktopsLink_Desktops_HeadingText().contains("Desktops"));
	}

}
