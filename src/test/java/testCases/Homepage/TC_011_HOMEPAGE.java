package testCases.Homepage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.HomePage;
import testBase.BaseClass;

public class TC_011_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Feature("Cart Display")
	@Story("TC_011_HOMEPAGE - Verify Cart Label for Empty Cart")
	@Test(description = "Verify that the cart displays correct text when empty.")
	@Severity(SeverityLevel.NORMAL)
	public void testShoppingCartButtonLabelTextVisibility_NoItems_Header_UI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getShoppingCartButtonLabelText_NoItems().contains("0 item(s) - $0.00"));
	}

}
