package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {
	
	RegisterPage registerPage;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath="//h1[normalize-space()='Register Account']") WebElement pageHeading;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement continueButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertMessage;
	
	@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") WebElement firstNameValidationMessage;
	
	@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]") WebElement lastNameValidationMessage;
	
	@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]") WebElement emailValidationMessage;
	
	@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]") WebElement phoneValidationMessage;
	
	@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]") WebElement passwordValidationMessage;
	
	@FindBy(xpath="//label[normalize-space()='Yes']") WebElement subscriptionYesOptionButton;
	
	@FindBy(xpath="//input[@name='agree']") WebElement privacyPolicyAgreeButton;
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement firstNameInput;
	
	@FindBy(xpath="//input[@id='input-lastname']") WebElement lastNameInput;
	
	@FindBy(xpath="//input[@id='input-email']") WebElement emailInput;
	
	@FindBy(xpath="//input[@id='input-telephone']") WebElement telephoneInput;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement passwordInput;
	
	@FindBy(xpath="//input[@id='input-confirm']") WebElement passwordConfirmInput;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement registerSuccessMessage;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement registerEmailExistsMessage;
	
	@FindBy(xpath="//div[contains(text(),'Password confirmation does not match password!')]") WebElement passwordUnmatchingMessage;
	
	
	public void clickRegisterLink() throws InterruptedException {
		WebElement myAccountNavLink = driver.findElement(By.xpath("//a[@title='My Account']"));
		myAccountNavLink.click();
		WebElement myAccountNavLink_Register = driver.findElement(By.linkText("Register"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(myAccountNavLink_Register).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandlesSet = driver.getWindowHandles();
		List<String> windowsHandles = new ArrayList<>(windowsHandlesSet);
		driver.switchTo().window(windowsHandles.get(1));
	}
	
	public String getPageURL() {
		String pageURL = driver.getCurrentUrl();
		return pageURL;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public String getElementText(WebElement element) {
		String elementText = element.getText();
		return elementText;
	}
	
	public String getPageHeadingText() {
		return getElementText(pageHeading);
	}
	
	public void clickContinueBtn() {
		continueButton.click();
	}
	
	public String getAlertMessageText() {
		return getElementText(alertMessage);
	}
	
	public String getfirstNameValidationMessageText() {
		return getElementText(firstNameValidationMessage);
	}
	
	public boolean isElementDisplayed(WebElement element) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        return element.isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}
	
	public boolean isFirstNameValidationMessageDisplayed() {
		return isElementDisplayed(firstNameValidationMessage);
	}
	
	public String getlastNameValidationMessageText() {
		return getElementText(lastNameValidationMessage);
	}
	
	public boolean isLastNameValidationMessageDisplayed() {
		return isElementDisplayed(lastNameValidationMessage);
	}
	
	public String getEmailValidationMessageText() {
		return getElementText(emailValidationMessage);
	}
	
	public boolean isEmailValidationMessageDisplayed() {
		return isElementDisplayed(emailValidationMessage);
	}
	
	public String getPhoneValidationMessageText() {
		return getElementText(phoneValidationMessage);
	}
	
	public boolean isPhoneValidationMessageDisplayed() {
		return isElementDisplayed(phoneValidationMessage);
	}
	
	public String getPasswordValidationMessageText() {
		return getElementText(passwordValidationMessage);
	}
	
	public boolean isPasswordValidationMessageDisplayed() {
		return isElementDisplayed(passwordValidationMessage);
	}
	
	public void selectSubscriptionYes() {
		subscriptionYesOptionButton.click();
	}
	
	public void agreeToPrivacyPolicy() {
		privacyPolicyAgreeButton.click();
	}
	
	public void fillOutForm(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm ) {
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		emailInput.sendKeys(email);
		telephoneInput.sendKeys(telephone);
		passwordInput.sendKeys(password);
		passwordConfirmInput.sendKeys(passwordConfirm);
	}
	
	public String getRegisterSuccessMessageText() {
		return getElementText(registerSuccessMessage);
	}
	
	public String getRegisterEmailExistsText() {
		return getElementText(registerEmailExistsMessage);
	}
	
	public String getPasswordUnmatchingMessageText() {
		return getElementText(passwordUnmatchingMessage);
	}

	
}
