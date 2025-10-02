package testCases.Cart;

import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_009_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_Macbook_ViewCartDetails() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickViewCartLink();
		cart.assertCartProductInfo(1, "MacBook", "MacBook", 1, "602.00", "602.00");
	}

}
