package testCases.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import pages.LoginPage;
import testBase.BaseClass;

public class TC_001_LOGIN extends BaseClass {
	
	LoginPage loginPage;
	
	@Feature("Login Functionality")
	@Story("Verify Login page UI elements")
	@Test(description="Verify the 'No Account Exists' warning message with empty login fields")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: Displays 'No Account Exists' warning when no email and password are submitted")
	public void testLogin_EmptyData() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.clickLoginLink();
		loginPage.login("", "");
		Assert.assertTrue(loginPage.isNoAccountMessageDisplayed());
		Assert.assertTrue(loginPage.getNoAccountMessageText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

}
