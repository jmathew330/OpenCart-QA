package testCases.RegisterPage;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_017_REGISTER extends BaseClass {
	
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageForm_BelowCharRqmnt_Phone() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Test", "User", generateRandomEmail(), "12", "pass123", "pass123");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.isPhoneValidationMessageDisplayed());
	}
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}

}
