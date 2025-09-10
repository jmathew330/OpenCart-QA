package testCases.Homepage;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.HomePage;
import testBase.BaseClass;

public class TC_011_HOMEPAGE extends BaseClass {
	
	HomePage homePage;
	
	@Test
	public void testShoppingCartButtonLabelTextVisibility_NoItems_Header_UI() {
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getShoppingCartButtonLabelText_NoItems().contains("0 item(s) - $0.00"));
	}

}
