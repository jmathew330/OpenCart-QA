package testCases.Cart;

import java.util.Arrays;

import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_011_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_MacBookiPhone_ViewCartDetails() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickViewCartLink();
		cart.assertCartProductsInfo(2, Arrays.asList("iPhone", "MacBook"), 2, Arrays.asList(1, 1), Arrays.asList("123.20", "602.00"), Arrays.asList("123.20", "602.00"));

}

}