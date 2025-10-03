package testCases.Cart;

import java.util.Arrays;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.Cart;
import testBase.BaseClass;

public class TC_011_CART extends BaseClass {
	
	Cart cart;
	
	@Feature("Cart View Cart Table")
	@Story("TC_CART_011 - Verify cart after clicking 'View Cart' hyperlink dropdown when multiple products (MacBook + iPhone) are added")
	@Severity(SeverityLevel.CRITICAL)
	@Test(description = "Ensure cart table displays correct product details for MacBook and iPhone after clicking the 'View Cart' link from the dropdown")
	public void testAddToCart_MacBookiPhone_ViewCartDetails() throws InterruptedException {
		cart = new Cart(driver);
		cart.clickMacbookAddToCartButton();
		Thread.sleep(3000);
		cart.clickIPhoneAddToCartButton();
		Thread.sleep(3000);
		cart.clickCartTotalButton();
		cart.clickViewCartLink();
		cart.assertCartProductsInfo(2, Arrays.asList("iPhone", "MacBook"), 2, Arrays.asList(1, 1), Arrays.asList("123.20", "602.00"), Arrays.asList("123.20", "602.00"));

}

}