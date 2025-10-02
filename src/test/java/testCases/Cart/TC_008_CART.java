package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_008_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_Macbook_iPhone_RemoveFromCart_QuantityAndPrice() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		String cartText = cart.getCartTotalButtonText();
		Thread.sleep(3000);
		int itemCount = cart.getItemCountFromCartTotal(cartText);
		double totalPrice = cart.getTotalPriceFromCartTotal(cartText);
		Assert.assertEquals(itemCount, 2);
		Assert.assertEquals(totalPrice, 725.20);
		cart.clickCartTotalButton();
		cart.clickRemoveItemButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickRemoveItemButton();
		String updatedCartText = cart.getCartTotalButtonText();
		int updatedItemCount = cart.getItemCountFromCartTotal(updatedCartText);
		double updatedTotalPrice = cart.getTotalPriceFromCartTotal(updatedCartText);
		Assert.assertEquals(updatedItemCount, 0);
		Assert.assertEquals(updatedTotalPrice, 0);
		cart.clickCartTotalButton();
		Assert.assertTrue(cart.getEmptyCartMessageText().contains("Your shopping cart is empty!"));
		
	}

}
