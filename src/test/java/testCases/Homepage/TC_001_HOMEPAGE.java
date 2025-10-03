package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_001_HOMEPAGE extends BaseClass {

	HomePage homePage;
	
	@Feature("UI Basics")
	@Story("TC_001_HOMEPAGE - Verify Home Page URL and Title")
	@Test(description = "Verify that the home page loads and displays the correct URL and title.")
	@Severity(SeverityLevel.BLOCKER)
	public void testPageURLTitle() {
		homePage = new HomePage(driver);
		Assert.assertEquals(homePage.getPageTitle(), "Your Store");
		Assert.assertEquals(homePage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=common/home");
	}

}
	

