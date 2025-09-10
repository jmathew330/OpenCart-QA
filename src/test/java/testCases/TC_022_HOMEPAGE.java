package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import testBase.BaseClass;

public class TC_022_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test(priority=1)
	public void testLaptopsNotebooksMenuPageRedirection_Macs() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		homePage.clickLaptopsNotebooksLink_Macs();
		Assert.assertEquals(homePage.getPageTitle(), "Macs");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=18_46");
		Assert.assertTrue(homePage.getLaptopsNotebooksLink_Macs_HeadingText().contains("Macs"));
	}
	
	@Test(priority=2)
	public void testLaptopsNotebooksMenuPageRedirection_Windows() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		homePage.clickLaptopsNotebooksLink_Windows();
		Assert.assertEquals(homePage.getPageTitle(), "Windows");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=18_45");
		Assert.assertTrue(homePage.getLaptopsNotebooksLink_Windows_HeadingText().contains("Windows"));
	}
	
	@Test(priority=3)
	public void testLaptopsNotebooksMenuPageRedirection_LaptopsNotebooks() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.hoverToLaptopsNotebooksLink();
		homePage.clickLaptopsNotebooksLink_LaptopsNotebooks();
		Assert.assertEquals(homePage.getPageTitle(), "Laptops & Notebooks");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=product/category&path=18");
		Assert.assertTrue(homePage.getLaptopsNotebooksLink_LaptopsWindows_HeadingText().contains("Laptops & Notebooks"));
	}

}
