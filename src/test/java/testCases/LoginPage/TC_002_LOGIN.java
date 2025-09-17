package testCases.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import testBase.BaseClass;

public class TC_002_LOGIN extends BaseClass {
	
	LoginPage loginPage;
	
	@Test
	public void testLogin_NoAccountMessage() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clickLoginLink();
		loginPage.login("invalidemail@mail.com", "password123");
		Assert.assertTrue(loginPage.isNoAccountMessageDisplayed());
		Assert.assertTrue(loginPage.getNoAccountMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

}
