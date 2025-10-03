package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_009_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Search Functionality")
	@Story("TC_009_HOMEPAGE - Verify Search Box and Button")
	@Test(description = "Verify that the search input field and button are visible.")
	@Severity(SeverityLevel.BLOCKER)
	public void testSearchBarVisibility_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isSearchBoxDisplayed());
		Assert.assertTrue(homePage.isSearchButtonDisplayed());
	}

}
