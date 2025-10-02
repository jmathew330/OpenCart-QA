package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_002_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_Macbook_AddToCart_QuantityAndPrice() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		String cartText = cart.getCartTotalButtonText();
		int itemCount = cart.getItemCountFromCartTotal(cartText);
		double totalPrice = cart.getTotalPriceFromCartTotal(cartText);
		Assert.assertEquals(itemCount, 1);
		Assert.assertEquals(totalPrice, 602.00);
		
	}

}
