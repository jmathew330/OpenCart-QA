package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_010_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Search Functionality")
	@Story("TC_010_HOMEPAGE - Verify Search Placeholder Text")
	@Test(description = "Verify the placeholder text in the search box is correct.")
	@Severity(SeverityLevel.MINOR)
	public void testSearchBarPlaceholderTextVisibility_HeaderUI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSearchBarPlaceholderText().contains("Search"));
	}

}
