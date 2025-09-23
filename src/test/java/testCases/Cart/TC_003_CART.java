package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_003_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_iPhone_AddToCart_SuccessMessage() {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		Assert.assertTrue(cart.getAddedToCartSuccessMessage().contains("Success: You have added iPhone to your shopping cart!"));
	}

}
