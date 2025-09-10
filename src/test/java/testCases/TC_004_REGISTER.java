package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_004_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageForm_NoData_Agree() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.getfirstNameValidationMessageText().contains("First Name must be between 1 and 32 characters!"));
		Assert.assertTrue(registerPage.getlastNameValidationMessageText().contains("Last Name must be between 1 and 32 characters!"));
		Assert.assertTrue(registerPage.getEmailValidationMessageText().contains("E-Mail Address does not appear to be valid!"));
		Assert.assertTrue(registerPage.getPhoneValidationMessageText().contains("Telephone must be between 3 and 32 characters!"));
		Assert.assertTrue(registerPage.getPasswordValidationMessageText().contains("Password must be between 4 and 20 characters!"));
	}
	
}
