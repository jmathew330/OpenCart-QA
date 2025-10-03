package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_023_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	
	@Feature("Navigation Redirection")
	@Story("TC_023_HOMEPAGE - Verify Redirection from Components Menu")
	@Test(description = "Verify all component submenu links redirect correctly.", priority=1)
	@Severity(SeverityLevel.NORMAL)
	public void testComponentsMenuPageRedirection_MiceTrackballs() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_MiceTracksballs();
		Assert.assertEquals(homePage.getPageTitle(), "Mice and Trackballs");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_29");
		Assert.assertTrue(homePage.getComponentsLink_MiceTrackballs_HeadingText().contains("Mice and Trackballs"));
	}
		
	
	@Feature("Navigation Redirection")
	@Story("TC_023_HOMEPAGE - Verify Redirection from Components Menu")
	@Test(description = "Verify all component submenu links redirect correctly.", priority=2)
	@Severity(SeverityLevel.NORMAL)
	public void testComponentsMenuPageRedirection_Monitors() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Monitors();
		Assert.assertEquals(homePage.getPageTitle(), "Monitors");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28");
		Assert.assertTrue(homePage.getComponentsLink_Monitors_HeadingText().contains("Monitors"));
	}
	
	
	@Feature("Navigation Redirection")
	@Story("TC_023_HOMEPAGE - Verify Redirection from Components Menu")
	@Test(description = "Verify all component submenu links redirect correctly.", priority=3)
	@Severity(SeverityLevel.NORMAL)
	public void testComponentsMenuPageRedirection_Printers() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Printers();
		Assert.assertEquals(homePage.getPageTitle(), "Printers");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_30");
		Assert.assertTrue(homePage.getComponentsLink_Printers_HeadingText().contains("Printers"));
	}
	

	@Feature("Navigation Redirection")
	@Story("TC_023_HOMEPAGE - Verify Redirection from Components Menu")
	@Test(description = "Verify all component submenu links redirect correctly.", priority=4)
	@Severity(SeverityLevel.NORMAL)
	public void testComponentsMenuPageRedirection_Scanners() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Scanners();
		Assert.assertEquals(homePage.getPageTitle(), "Scanners");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_31");
		Assert.assertTrue(homePage.getComponentsLink_Scanners_HeadingText().contains("Scanners"));
	}
	

	@Feature("Navigation Redirection")
	@Story("TC_023_HOMEPAGE - Verify Redirection from Components Menu")
	@Test(description = "Verify all component submenu links redirect correctly.", priority=5)
	@Severity(SeverityLevel.NORMAL)
	public void testComponentsMenuPageRedirection_WebCameras() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_WebCameras();
		Assert.assertEquals(homePage.getPageTitle(), "Web Cameras");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_32");
		Assert.assertTrue(homePage.getComponentsLink_WebCameras_HeadingText().contains("Web Cameras"));
	}
	

	@Feature("Navigation Redirection")
	@Story("TC_023_HOMEPAGE - Verify Redirection from Components Menu")
	@Test(description = "Verify all component submenu links redirect correctly.", priority=6)
	@Severity(SeverityLevel.NORMAL)
	public void testComponentsMenuPageRedirection_Components() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToComponentsLink();
		homePage.clickComponentsLink_Components();
		Assert.assertEquals(homePage.getPageTitle(), "Components");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=25");
		Assert.assertTrue(homePage.getComponentsLink_Components_HeadingText().contains("Components"));
	}

}
