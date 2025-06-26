package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[normalize-space()='Qafox.com']")
	private WebElement logoLink;
	
	@FindBy(xpath="//span[contains(text(),'Currency')]")
	private WebElement currencyDropDown;
	
	@FindBy(xpath="//button[contains(text(),'€Euro')]")
	private WebElement euroCurrencyOption;
	
	@FindBy(xpath="//button[normalize-space()='£Pound Sterling']")
	private WebElement poundCurrencyOption;
	
	@FindBy(xpath="//button[normalize-space()='$US Dollar']")
	private WebElement usCurrencyOption;
	
	@FindBy(xpath="//i[@class='fa fa-phone']")
	private WebElement phoneIcon;
	
	@FindBy(xpath="//span[contains(text(),'123456789')]")
	private WebElement phoneNumberLabel;
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	private WebElement myAccountIcon;
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myAccountDropDown;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	private WebElement registerMyAccountOption;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	private WebElement loginMyAccountOption;
	
	@FindBy(xpath="//i[@class='fa fa-heart']")
	private WebElement wishListIcon;
	
	@FindBy(xpath="//span[contains(text(),'Wish List')]")
	private WebElement wishListLabel;
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement shoppingCartIcon;
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCartLabel;
	
	@FindBy(xpath="//i[@class='fa fa-share']")
	private WebElement checkoutIcon;
	
	@FindBy(xpath="//span[contains(text(),'Checkout')]")
	private WebElement checkoutLabel;
	
	
	public String getPageURL() {
		String pageURL = driver.getCurrentUrl();
		return pageURL;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	private boolean isElementDisplayed(WebElement element) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	private String getElementText(WebElement element) {
		try {
			return element.getText();
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean isLogoDisplayed() {
		return isElementDisplayed(logoLink);
	}
	
	public String getLogoText() {
		return getElementText(logoLink);
	}
	
	public boolean isCurrencyDropDownDisplayed() {
		return isElementDisplayed(currencyDropDown);
	}
	
	public String getCurrencyDropdownText() {
		return getElementText(currencyDropDown);
	}
	
	public void openCurrencyDropdown() {
		currencyDropDown.click();
	}
	
	public boolean isEuroOptionDisplayed() {
		return isElementDisplayed(euroCurrencyOption);
	}
	
	public String getEuroOptionText() {
		return getElementText(euroCurrencyOption);
	}
	
	public boolean isPoundOptionDisplayed() {
		return isElementDisplayed(poundCurrencyOption);
	}
	
	public String getPoundOptionText() {
		return getElementText(poundCurrencyOption);
	}
	
	public boolean isUSOptionDisplayed() {
		return isElementDisplayed(usCurrencyOption);
	}
	
	public String getUSOptionText() {
		return getElementText(usCurrencyOption);
	}
	
	public boolean isPhoneIconDisplayed() {
		return isElementDisplayed(phoneIcon);
	}
	
	public boolean isPhoneNumberLabelDisplayed() {
		return isElementDisplayed(phoneNumberLabel);
	}
	
	public String getPhoneNumberText() {
		return getElementText(phoneNumberLabel);
	}
	
	public boolean isMyAccountIconDisplayed() {
		return isElementDisplayed(myAccountIcon);
	}
	
	public boolean isMyAccountDropDownDisplayed() {
		return isElementDisplayed(myAccountDropDown);
	}
	
	public void openMyAccountDropdown() {
		myAccountDropDown.click();
	}
	
	public String getMyAccountDropDownText() {
		return getElementText(myAccountDropDown);
	}
	
	public boolean isRegisterOptionDisplayed() {
		return isElementDisplayed(registerMyAccountOption);
	}
	
	public String getRegisterOptionText() {
		return getElementText(registerMyAccountOption);
	}
	
	public boolean isLoginOptionDisplayed() {
		return isElementDisplayed(loginMyAccountOption);
	}
	
	public String getLoginOptionText() {
		return getElementText(loginMyAccountOption);
	}
	
	public boolean isWishListIconDisplayed() {
		return isElementDisplayed(wishListIcon);
	}
	
	public boolean isWishListLabelDisplayed() {
		return isElementDisplayed(wishListLabel);
	}
	
	public String getWishListText() {
		return getElementText(wishListLabel);
	}
	
	public boolean isShoppingCartIconDisplayed() {
		return isElementDisplayed(shoppingCartIcon);
	}
	
	public boolean isShoppingCartLabelDisplayed() {
		return isElementDisplayed(shoppingCartLabel);
	}
	
	public String getShoppingCartText() {
		return getElementText(shoppingCartLabel);
	}
	
	public boolean isCheckoutIconDisplayed() {
		return isElementDisplayed(checkoutIcon);
	}
	
	public boolean isCheckoutLabelDisplayed() {
		return isElementDisplayed(checkoutLabel);
	}
	
	public String getCheckoutText() {
		return getElementText(checkoutLabel);
	}
	
	

}
