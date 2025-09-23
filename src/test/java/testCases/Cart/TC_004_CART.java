package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_004_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_iPhone_AddToCart_QuantityAndPrice() {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		String cartText = cart.getCartTotalButtonText();
		int itemCount = cart.getItemCountFromCartTotal(cartText);
		double totalPrice = cart.getTotalPriceFromCartTotal(cartText);
		Assert.assertEquals(itemCount, 1);
		Assert.assertEquals(totalPrice, 123.20);
	}

}
