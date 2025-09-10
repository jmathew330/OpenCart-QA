package testCases.RegisterPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_001_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageURL() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		Assert.assertEquals(registerPage.getPageURL(), "https://tutorialsninja.com/demo/index.php?route=account/register");
	}
	
	@Test
	public void testRegisterPageTitle() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		Assert.assertEquals(registerPage.getPageTitle(), "Register Account");
	}

}
