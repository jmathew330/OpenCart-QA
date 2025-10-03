package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_004_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart Quantity Display")
	@Story("TC_CART_004 - Verify quantity and price after adding iPhone")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure quantity count and price per quantity is correct after adding a single iPhone to the cart")
	public void testAddToCart_iPhone_AddToCart_QuantityAndPrice() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		String cartText = cart.getCartTotalButtonText();
		int itemCount = cart.getItemCountFromCartTotal(cartText);
		double totalPrice = cart.getTotalPriceFromCartTotal(cartText);
		Assert.assertEquals(itemCount, 1);
		Assert.assertEquals(totalPrice, 123.20);
	}

}
