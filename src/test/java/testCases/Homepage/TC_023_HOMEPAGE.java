package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import testBase.BaseClass;

public class TC_023_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test(priority=1)
	public void testComponentsMenuPageRedirection_MiceTrackballs() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_MiceTracksballs();
		Assert.assertEquals(homePage.getPageTitle(), "Mice and Trackballs");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_29");
		Assert.assertTrue(homePage.getComponentsLink_MiceTrackballs_HeadingText().contains("Mice and Trackballs"));
	}
	
	@Test(priority=2)
	public void testComponentsMenuPageRedirection_Monitors() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Monitors();
		Assert.assertEquals(homePage.getPageTitle(), "Monitors");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28");
		Assert.assertTrue(homePage.getComponentsLink_Monitors_HeadingText().contains("Monitors"));
	}
	
	@Test(priority=3)
	public void testComponentsMenuPageRedirection_Printers() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Printers();
		Assert.assertEquals(homePage.getPageTitle(), "Printers");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_30");
		Assert.assertTrue(homePage.getComponentsLink_Printers_HeadingText().contains("Printers"));
	}
	
	@Test(priority=4)
	public void testComponentsMenuPageRedirection_Scanners() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Scanners();
		Assert.assertEquals(homePage.getPageTitle(), "Scanners");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_31");
		Assert.assertTrue(homePage.getComponentsLink_Scanners_HeadingText().contains("Scanners"));
	}
	
	@Test(priority=5)
	public void testComponentsMenuPageRedirection_WebCameras() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_WebCameras();
		Assert.assertEquals(homePage.getPageTitle(), "Web Cameras");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_32");
		Assert.assertTrue(homePage.getComponentsLink_WebCameras_HeadingText().contains("Web Cameras"));
	}
	
	@Test(priority=6)
	public void testComponentsMenuPageRedirection_Components() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Components();
		Assert.assertEquals(homePage.getPageTitle(), "Components");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25");
		Assert.assertTrue(homePage.getComponentsLink_Components_HeadingText().contains("Components"));
	}

}
