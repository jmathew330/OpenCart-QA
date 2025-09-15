package testCases.RegisterPage;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_016_REGISTER extends BaseClass {
	

	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageForm_ExceedCharLimit_LastName() throws InterruptedException {
		registerPage =  new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("First Name", "Longlastnamelonglastnamelonglastname", generateRandomEmail(), "123456789", "pass123", "pass123");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.isLastNameValidationMessageDisplayed());
	}
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}

}
