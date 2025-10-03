package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_022_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Navigation Redirection")
	@Story("TC_022_HOMEPAGE - Verify Redirection from Laptops Menu")
	@Test(description = "Verify Mac, Windows, and Show All options redirect correctly.", priority=1)
	@Severity(SeverityLevel.NORMAL)
	public void testLaptopsNotebooksMenuPageRedirection_Macs() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		homePage.clickLaptopsNotebooksLink_Macs();
		Assert.assertEquals(homePage.getPageTitle(), "Macs");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=18_46");
		Assert.assertTrue(homePage.getLaptopsNotebooksLink_Macs_HeadingText().contains("Macs"));
	}
	
	@Feature("Navigation Redirection")
	@Story("TC_022_HOMEPAGE - Verify Redirection from Laptops Menu")
	@Test(description = "Verify Mac, Windows, and Show All options redirect correctly.", priority=2)
	@Severity(SeverityLevel.NORMAL)
	public void testLaptopsNotebooksMenuPageRedirection_Windows() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		homePage.clickLaptopsNotebooksLink_Windows();
		Assert.assertEquals(homePage.getPageTitle(), "Windows");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=18_45");
		Assert.assertTrue(homePage.getLaptopsNotebooksLink_Windows_HeadingText().contains("Windows"));
	}
	
	@Feature("Navigation Redirection")
	@Story("TC_022_HOMEPAGE - Verify Redirection from Laptops Menu")
	@Test(description = "Verify Mac, Windows, and Show All options redirect correctly.", priority=3)
	@Severity(SeverityLevel.NORMAL)
	public void testLaptopsNotebooksMenuPageRedirection_LaptopsNotebooks() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		homePage.clickLaptopsNotebooksLink_LaptopsNotebooks();
		Assert.assertEquals(homePage.getPageTitle(), "Laptops & Notebooks");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=18");
		Assert.assertTrue(homePage.getLaptopsNotebooksLink_LaptopsWindows_HeadingText().contains("Laptops & Notebooks"));
	}

}
