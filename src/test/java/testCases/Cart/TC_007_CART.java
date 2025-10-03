package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_007_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart Multiple Items Add")
	@Story("TC_CART_007 - Verify cart after adding MacBook + iPhone")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure correct quantity and price are shown after adding multiple products (MacBook + iPhone) to the cart")
	public void testAddToCart_Macbook_iPhone_QuantityAndPrice() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		String cartText = cart.getCartTotalButtonText();
		int itemCount = cart.getItemCountFromCartTotal(cartText);
		double totalPrice = cart.getTotalPriceFromCartTotal(cartText);
		Assert.assertEquals(itemCount, 2);
		Assert.assertEquals(totalPrice, 725.20);
	}

}
