package testCases.Cart;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_009_CART extends BaseClass {
	
	Cart cart;

	@Feature("Cart View Cart Table")
	@Story("TC_CART_009 - Verify cart after clicking 'View Cart' hyperlink dropdown when a single product (Macbook) is added")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure cart table displays correct product details for Macbook after clicking the 'View Cart' link from the dropdown")
	public void testAddToCart_Macbook_ViewCartDetails() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickViewCartLink();
		cart.assertCartProductInfo(1, "MacBook", "MacBook", 1, "602.00", "602.00");
	}

}
