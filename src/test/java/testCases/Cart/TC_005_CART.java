package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_005_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart Remove Item")
	@Story("TC_CART_005 - Verify cart updates after removing MacBook")
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "Ensure quantity count and price updates correctly after removing a MacBook from the cart")
	public void testAddToCart_Macbook_RemoveFromCart_QuantityAndPrice() {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		cart.clickCartTotalButton();
		String itemCount = cart.getItemCountFromCartTotalDropdownText();
		String totalPrice = cart.getTotalPriceFromCartTotalDropdownText();
		Assert.assertTrue(cart.isMacbookLinkDisplayedInCartDropdown());
		Assert.assertTrue(cart.getMacbookLinkText().contains("MacBook"));
		Assert.assertEquals(cart.getItemCountFromCartTotalDropdown(itemCount), 1);
		Assert.assertEquals(cart.getTotalPriceFromCartTotalDropdown(totalPrice), 602.00);
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