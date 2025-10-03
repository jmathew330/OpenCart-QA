package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_006_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart Remove Item")
	@Story("TC_CART_006 - Verify cart updates after removing iPhone")
	@Severity(SeverityLevel.NORMAL)
	@Test(description = "Ensure quantity count and price updates correctly after removing an iPhone from the cart")
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
