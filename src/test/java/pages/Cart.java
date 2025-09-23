package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart extends BasePage {
	
	public Cart(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//button[@onclick=\"cart.add('43');\"]") WebElement macBookAddToCartButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement addedToCartSuccessMessage;
	
	@FindBy(xpath="//button[@onclick=\"cart.add('40');\"]") WebElement iPhoneAddToCartButton;
	
	@FindBy(xpath="//td[normalize-space()='x1']") WebElement cartTotalDropDown_ItemCount;
	
	@FindBy(xpath="//tbody//tr//td[4]") WebElement cartTotalDropDown_Price;
	
	@FindBy(xpath="//td[@class='text-left']//a[contains(text(),'MacBook')]") WebElement macbookShoppingCartDropdownLink;
	
	@FindBy(xpath="//td[@class='text-left']//a[contains(text(),'iPhone')]") WebElement iPhoneShoppingCartDropdownLink;


	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	public void clickMacbookAddToCartButton() {
		js.executeScript("arguments[0].scrollIntoView()", macBookAddToCartButton);
		wait.until(ExpectedConditions.elementToBeClickable(macBookAddToCartButton));
		macBookAddToCartButton.click();
		wait.until(ExpectedConditions.visibilityOf(addedToCartSuccessMessage));
		js.executeScript("window.scrollTo(0, 0);");
	}
	
	
	public void clickIPhoneAddToCartButton() {
		js.executeScript("arguments[0].scrollIntoView()", iPhoneAddToCartButton);
		wait.until(ExpectedConditions.elementToBeClickable(iPhoneAddToCartButton));
		iPhoneAddToCartButton.click();
		wait.until(ExpectedConditions.visibilityOf(addedToCartSuccessMessage));
		js.executeScript("window.scrollTo(0, 0);");
	}
	
	public boolean isElementDisplayed(WebElement element){
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		}
		catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public String getElementText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		String elementText = element.getText();
		return elementText;
	}
	
	public boolean isAddedToCartSucccessMessageDisplayed() {
		return isElementDisplayed(addedToCartSuccessMessage);
	}
	
	public String getAddedToCartSuccessMessage() {
		return getElementText(addedToCartSuccessMessage);
	}
	
	public WebElement getCartTotalButton() {

		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='cart-total']")
		));
	}
	
	public String getCartTotalButtonText() {
		return getCartTotalButton().getText();
	}
	
	public void clickCartTotalButton() {
	    WebElement cartTotalDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='cart']/button")));
	    js.executeScript("arguments[0].click();", cartTotalDropDown);
	}
	
	public void clickRemoveItemButton() {
		WebElement removeItemButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Remove']")));
		js.executeScript("arguments[0].click();", removeItemButton);
	}
	
	public String getEmptyCartMessageText() {
		WebElement emptyCartMessage = driver.findElement(By.xpath("//p[@class='text-center']"));
		String emptyCartMessageText = emptyCartMessage.getText();
		return emptyCartMessageText;
	}
	
	public boolean isMacbookLinkDisplayedInCartDropdown() {
		return isElementDisplayed(macbookShoppingCartDropdownLink);
	}
	
	public String getMacbookLinkText() {
		return getElementText(macbookShoppingCartDropdownLink);
	}
	
	public boolean isiPhoneLinkDisplayedInCartDropdown() {
		return isElementDisplayed(iPhoneShoppingCartDropdownLink);
	}
	
	public String getiPhoneLinkText() {
		return getElementText(iPhoneShoppingCartDropdownLink);
	}
	
	public int getItemCountFromCartTotal(String cartText) {
		String[] texts = cartText.split(" ");
		return Integer.parseInt(texts[0]);
	}
	
	public double getTotalPriceFromCartTotal(String cartText) {
		String[] texts = cartText.split("-");
		if(texts.length > 1) {
			String priceText = texts[1].trim().replace("$", "");
			return Double.parseDouble(priceText);
		}
		return 0;
	}
	
	public String getItemCountFromCartTotalDropdownText() {
		return getElementText(cartTotalDropDown_ItemCount);
	}
	
	public String getTotalPriceFromCartTotalDropdownText() {
		return getElementText(cartTotalDropDown_Price);
	}
	
	public int getItemCountFromCartTotalDropdown(String cartText) {
		String[] chars = cartText.split("x");
		return Integer.parseInt(chars[1]);
	}
	
	public double getTotalPriceFromCartTotalDropdown(String cartText) {
		String priceText = cartText.trim().replace("$", "");
		return Double.parseDouble(priceText);
	}



}
