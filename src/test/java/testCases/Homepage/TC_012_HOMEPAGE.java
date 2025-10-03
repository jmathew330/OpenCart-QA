package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_012_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Navigation Menu")
	@Story("TC_012_HOMEPAGE - Verify Navigation Menu Links")
	@Test(description = "Verify that all main navigation menu links are displayed in the correct order.")
	@Severity(SeverityLevel.BLOCKER)
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
