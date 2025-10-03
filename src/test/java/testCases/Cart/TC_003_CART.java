package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_003_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart Add Item")
	@Story("TC_CART_003 - Verify success message after adding iPhone")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure success message is present and displays correct text after adding the featured iPhone to the cart")
	public void testAddToCart_iPhone_AddToCart_SuccessMessage() {
		cart = new Cart(driver);
		cart.clickIPhoneAddToCartButton();
		Assert.assertTrue(cart.getAddedToCartSuccessMessage().contains("Success: You have added iPhone to your shopping cart!"));
	}

}
