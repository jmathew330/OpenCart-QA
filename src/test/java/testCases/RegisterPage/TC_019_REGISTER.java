package testCases.RegisterPage;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_019_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageForm_BelowCharRqmnt_Password() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Test", "User", generateRandomEmail(), "123456789", "pas", "pas");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.isPasswordValidationMessageDisplayed());
	}
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}

}
