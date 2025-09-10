package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_002_REGISTER extends BaseClass {
	
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageHeading() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		Assert.assertTrue(registerPage.getPageHeadingText().contains("Register Account"));
	}

}
