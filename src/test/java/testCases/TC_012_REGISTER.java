package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.UUID;
import pages.RegisterPage;
import testBase.BaseClass;

public class TC_012_REGISTER extends BaseClass {
	
	RegisterPage registerPage;
	
	
	@Test(dataProvider="formData")
	public void testRegisterPage_ValidData(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) throws InterruptedException {
		registerPage = new RegisterPage(driver);
		registerPage.clickRegisterLink();
		registerPage.fillOutForm(firstName, lastName, email, telephone, password, passwordConfirm);
		registerPage.agreeToPrivacyPolicy();
		registerPage.clickContinueBtn();
		Assert.assertTrue(registerPage.getRegisterSuccessMessageText().contains("Your Account Has Been Created!"));
	}
	
	@DataProvider(name="formData")
	public Object[][] formData(){
		return new Object[][] {
			 {"Test", "User", generateRandomEmail(), "1234567890", "pass123", "pass123"},
		};
	}
	
	private String generateRandomEmail() {
		return "user" + UUID.randomUUID().toString().substring(0,8)+"@mail.com";
	}
	

}
