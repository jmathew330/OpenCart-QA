package testCases.RegisterPage;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_020_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterForm_ExceedCharLimit_Password() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Test", "User", generateRandomEmail(), "123456789", "pass123pass123pass1234", "pass123pass123pass1234");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.isPasswordValidationMessageDisplayed());
	}
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}

}
