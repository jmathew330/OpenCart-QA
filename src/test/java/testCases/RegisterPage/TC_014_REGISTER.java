package testCases.RegisterPage;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;
import testBase.BaseClass;

public class TC_014_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	
	@Test
	public void testRegisterPage_UnmatchingPasswords() throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm("Test", "User", generateRandomEmail(), "123456789", "pass123", "pass");
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.getPasswordUnmatchingMessageText().contains("Password confirmation does not match password!"));
	}
	
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}
	

}
