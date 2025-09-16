package testCases.RegisterPage;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_018_REGISTER extends BaseClass {
	
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterForm_ExceedCharLimit_Phone() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Test", "User", generateRandomEmail(), "123456789012345678901234567890123", "pass123", "pass123");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.isPhoneValidationMessageDisplayed());
	}
	
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}

}
