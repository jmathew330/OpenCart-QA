package testCases.Cart;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_010_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_iPhone_ViewCartDetails() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickViewCartLink();
		cart.assertCartProductInfo(1, "iPhone", "iPhone", 1, "123.20", "123.20");
	}

}
