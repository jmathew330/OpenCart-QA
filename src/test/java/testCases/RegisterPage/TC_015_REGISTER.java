package testCases.RegisterPage;

import java.util.UUID;
import java.util.concurrent.TimeoutException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_015_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	@Test
	public void testRegisterPageForm_ExceedCharLimit_FirstName() throws InterruptedException, TimeoutException{
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Longusernamelongusernamelongusername", "Last Name", generateRandomEmail(), "123456789", "pass123", "pass123");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.isFirstNameValidationMessageDisplayed());
	}
	
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}
	

}
