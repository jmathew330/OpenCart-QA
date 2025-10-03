package testCases.Homepage;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_019_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	

	@Feature("Footer Content")
	@Story("TC_019_HOMEPAGE - Verify Footer Section Headings")
	@Test(description = "Verify footer contains all expected group headings.")
	@Severity(SeverityLevel.MINOR)
	public void testFooterHeadingsVisibility() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.scrollToFooter();
		Assert.assertTrue(homePage.isFooterHeadingsDisplayed());
	}
	

	@Feature("Footer Content")
	@Story("TC_019_HOMEPAGE - Verify Footer Section Headings")
	@Test(description = "Verify footer contains all expected group headings.")
	@Severity(SeverityLevel.MINOR)
	public void testFooterHeadingsText() {
		homePage = new HomePage(driver);
		String actualFooterHeadingsTextString = homePage.getFooterHeadingsText();
		List<String> actualFooterHeadingsText = Arrays.asList(actualFooterHeadingsTextString.split(";\\s*"));
		List<String> expectedFooterHeadingsText = Arrays.asList("Information", "Customer Service", "Extras", "My Account");
		Assert.assertEquals(actualFooterHeadingsText, expectedFooterHeadingsText);
	}

}
