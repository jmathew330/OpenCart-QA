package testCases.RegisterPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_013_REGISTER extends BaseClass {
	
	
	RegisterPage registerPage;
	
	
	@Test
	public void testRegisterPage_DuplicateEmail() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Test", "User", "testuser123@gmail.com", "123456789", "pass123", "pass123");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.getRegisterEmailExistsText().contains("Warning: E-Mail Address is already registered!"));
		
	}

}
