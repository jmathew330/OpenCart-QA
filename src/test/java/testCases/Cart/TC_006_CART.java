package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Cart;
import testBase.BaseClass;

public class TC_006_CART extends BaseClass {
	
	Cart cart;
	
	@Test
	public void testAddToCart_iPhone_RemoveFromCart_QuantityAndPrice() {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		cart.clickCartTotalButton();
		String itemCount = cart.getItemCountFromCartTotalDropdownText();
		String totalPrice = cart.getTotalPriceFromCartTotalDropdownText();
		Assert.assertTrue(cart.isiPhoneLinkDisplayedInCartDropdown());
		Assert.assertTrue(cart.getiPhoneLinkText().contains("iPhone"));
		Assert.assertEquals(cart.getItemCountFromCartTotalDropdown(itemCount), 1);
		Assert.assertEquals(cart.getTotalPriceFromCartTotalDropdown(totalPrice), 123.20);
		cart.clickRemoveItemButton();
		String cartText = cart.getCartTotalButtonText();
		int removedItemCount = cart.getItemCountFromCartTotal(cartText);
		double removedTotalPrice = cart.getTotalPriceFromCartTotal(cartText);
		Assert.assertEquals(removedItemCount, 0);
		Assert.assertEquals(removedTotalPrice, 0.00);
		cart.clickCartTotalButton();
		Assert.assertTrue(cart.getEmptyCartMessageText().contains("Your shopping cart is empty!"));
	}

}
