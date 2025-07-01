package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_012_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testNavLinksTextVisibility() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getDesktopNavLinkText().contains("Desktops"));
		Assert.assertTrue(homePage.getLaptopsNotebooksNavLinkText().contains("Laptops & Notebooks"));
		Assert.assertTrue(homePage.getComponentsNavLinkText().contains("Components"));
		Assert.assertTrue(homePage.getTabletsNavLinkText().contains("Tablets"));
		Assert.assertTrue(homePage.getSoftwareNavLinkText().contains("Software"));
		Assert.assertTrue(homePage.getPhonesPDASNavLinkText().contains("Phones & PDAs"));
		Assert.assertTrue(homePage.getCamerasNavLinkText().contains("Cameras"));
		Assert.assertTrue(homePage.getMP3PlayersNavLinkText().contains("MP3 Players"));
	}

}
