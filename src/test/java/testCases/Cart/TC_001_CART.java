package testCases.Cart;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_001_CART extends BaseClass {
	
	Cart cart;

	@Feature("Cart Add Item")
	@Story("TC_CART_001 - Verify success message after adding MacBook")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure success message is present and displays with correct text after adding the featured MacBook to the cart")
	public void testAddToCart_Macbook_AddToCart_SuccessMessage() {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Assert.assertTrue(cart.isAddedToCartSucccessMessageDisplayed());
		Assert.assertTrue(cart.getAddedToCartSuccessMessage().contains("Success: You have added MacBook to your shopping cart!"));
	}

}
