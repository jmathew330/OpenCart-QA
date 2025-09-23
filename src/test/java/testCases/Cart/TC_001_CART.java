package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_001_CART extends BaseClass {
	
	Cart cart;

	
	@Test
	public void testAddToCart_Macbook_AddToCart_SuccessMessage() {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Assert.assertTrue(cart.isAddedToCartSucccessMessageDisplayed());
		Assert.assertTrue(cart.getAddedToCartSuccessMessage().contains("Success: You have added MacBook to your shopping cart!"));
	}

}
