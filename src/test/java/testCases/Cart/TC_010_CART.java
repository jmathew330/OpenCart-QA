package testCases.Cart;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_010_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart View Cart Table")
	@Story("TC_CART_010 - Verify cart after clicking 'View Cart' hyperlink dropdown when a single product (iPhone) is added")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure cart table displays correct product details for iPhone after clicking the 'View Cart' link from the dropdown")
	public void testAddToCart_iPhone_ViewCartDetails() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickViewCartLink();
		cart.assertCartProductInfo(1, "iPhone", "iPhone", 1, "123.20", "123.20");
	}

}
