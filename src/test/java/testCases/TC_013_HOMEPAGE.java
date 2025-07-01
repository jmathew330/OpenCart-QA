package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_013_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test(priority=1)
	public void testNavDropdownLinksVisibility_Desktops_HeaderUI() {
		homePage = new HomePage(driver);
		homePage.hoverToDesktopLink();
		String actualText = homePage.getDesktopsDropdownNavLinkText();
		String expectedText = "PC (0), Mac (1)";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=2)
	public void testNavDropdownLinksVisibility_LaptopsNotebooks_HeaderUI() {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		String actualText = homePage.getLaptopNotebooksDropdownNavLinkText();
		String expectedText = "Macs (0), Windows (0)";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=3)
	public void testNavDropdownLinksVisibility_Components_HeaderUI() {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		String actualText = homePage.getComponentsDropdownNavLinkText();
		String expectedText = "Mice and Trackballs (0), Monitors (2), Printers (0), Scanners (0), Web Cameras (0)";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=4)
	public void testNavDropdownLinksVisibility_MP3Players_HeaderUI() {
		homePage = new HomePage(driver);
		homePage.hoverToMP3PlayersLink();
		String actualText = homePage.getMP3DropdownNavLinkText();
		String expectedText = "test 11 (0), test 12 (0), test 15 (0), test 16 (0), test 17 (0), test 18 (0), test 19 (0), test 20 (0), test 21 (0), test 22 (0), test 23 (0), test 24 (0), test 4 (0), test 5 (0), test 6 (0), test 7 (0), test 8 (0), test 9 (0)";
		Assert.assertEquals(actualText, expectedText);
	}

}
