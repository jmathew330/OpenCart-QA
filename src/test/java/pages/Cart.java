package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Cart extends BasePage {
	
	Cart cart;
	
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

	@FindBy(xpath="//strong[normalize-space()='View Cart']") WebElement viewCartLink;

	
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
	
	public void clickViewCartLink() {
		viewCartLink.click();
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


	public int getShoppingCartProducts() {
		List<WebElement> viewCartTableRows = driver.findElements(By.xpath("//div[@class='table-responsive']//table//tr"));
		int numOfProducts = viewCartTableRows.size() - 1;
		return numOfProducts;
	}

	public String getViewCartTableData_ProductImageCaption() {
		WebElement viewCartTableImageCaption = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody//td[1]//img"));
		String imageCaption = viewCartTableImageCaption.getDomAttribute("alt");
		return imageCaption;
	}
	
	public String getViewCartTableData_ProductName() {
		WebElement viewCartTableProductName = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody//td[2]//a"));
		String productName = getElementText(viewCartTableProductName);
		return productName;
	}
	
	
	public int getViewCartTableData_ProductQuantity() {
		WebElement viewCartTableQuantityCount = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tr//td[4]//input"));
		int qtyCount = Integer.parseInt(viewCartTableQuantityCount.getDomAttribute("value"));
		return qtyCount;
	}	
	
	public List<String> getViewCartTableData_ProductNames() {
		List<String> productLinks = new ArrayList<>();
		List<WebElement> viewCartTableRows = driver.findElements(By.xpath("//div[@class='table-responsive']//table//tr"));
		for(int r = 1; r < viewCartTableRows.size(); r++ ) {
			WebElement row = viewCartTableRows.get(r);
			List<WebElement> viewCartTableProductLinks = row.findElements(By.tagName("a"));
			for(WebElement link : viewCartTableProductLinks) {
				String productLinkText = link.getText();
				if(!productLinkText.trim().isEmpty()) {
					productLinks.add(productLinkText);
				};
			}
		}
		return productLinks;
	}
	
	
	public List<Integer> getViewCartTableData_ProductQuantities() {
		List<Integer> productQuantities = new ArrayList<>();
		List<WebElement> viewCartTableRows = driver.findElements(By.xpath("//div[@class='table-responsive']//table//tr"));
		for(int r = 1; r < viewCartTableRows.size(); r++ ) {
			WebElement row = viewCartTableRows.get(r);
			List<WebElement> viewCartTableProductQuantityInput = row.findElements(By.xpath("td[4]//input"));
			for(WebElement input : viewCartTableProductQuantityInput) {
				String productQuantity = input.getDomAttribute("value");
				if(!productQuantity.trim().isEmpty()) {
					productQuantities.add(Integer.parseInt(productQuantity));
				};
			}
		}
		return productQuantities;
	}
	
	public void assertCartProductsInfo(int expectedRowCount, List<String> expectedProductNames, int expectedCount, List<Integer> expectedQuantities, List<String> expectedUnitPrices, List<String> expectedTotalPrices) {
		cart = new Cart(driver);
		int actualRowCount = cart.getShoppingCartProducts();
		List<String> actualProductNames = cart.getViewCartTableData_ProductNames();
		List<Integer> actualQuantities = cart.getViewCartTableData_ProductQuantities();
		List<String> actualUnitPrices = cart.getViewCartTableData_ProductUnitPrices();
		List<String> actualTotalPrices = cart.getViewCartTableData_ProductTotalPrices();
		Assert.assertEquals(actualRowCount, expectedRowCount);
		Assert.assertEquals(actualProductNames, expectedProductNames);
		Assert.assertEquals(cart.getShoppingCartProducts(), expectedCount);
		Assert.assertEquals(actualQuantities.size(), expectedQuantities.size());
		Assert.assertEquals(actualQuantities, expectedQuantities);
		Assert.assertEquals(actualUnitPrices, expectedUnitPrices);
		Assert.assertEquals(actualTotalPrices, expectedTotalPrices);
	}
	
	public void assertCartProductInfo(int expectedRowCount, String expectedImageCaption, String expectedProductName, int expectedProductQuantity, String expectedUnitPrice, String expectedTotalPrice) {
		cart = new Cart(driver);
		int actualRowCount = cart.getShoppingCartProducts();
		String actualImageCaption = cart.getViewCartTableData_ProductImageCaption();
		String actualProductName = cart.getViewCartTableData_ProductName();
		int actualProductQuantity = cart.getViewCartTableData_ProductQuantity();
		String actualUnitPrice = cart.getViewCartTableData_ProductUnitPrice();
		String actualTotalPrice = cart.getViewCartTableData_ProductTotalPrice();
		Assert.assertEquals(actualRowCount, expectedRowCount);
		Assert.assertEquals(actualImageCaption, expectedImageCaption);
		Assert.assertEquals(actualProductName, expectedProductName);
		Assert.assertEquals(actualProductQuantity, expectedProductQuantity);
		Assert.assertEquals(actualUnitPrice, expectedUnitPrice);
		Assert.assertEquals(actualTotalPrice, expectedTotalPrice);
	}
	
	public String getViewCartTableData_ProductUnitPrice() {
		WebElement viewCartTableUnitPrice = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody//td[5]"));
		String unitPrice = getElementText(viewCartTableUnitPrice).replace("$", "").trim();
		return unitPrice;
	}
	
	public String getViewCartTableData_ProductTotalPrice() {
		WebElement viewCartTableTotalPrice = driver.findElement(By.xpath("//div[@class='table-responsive']//table//tbody//td[6]"));
		String totalPrice = getElementText(viewCartTableTotalPrice).replace("$", "").trim();
		return totalPrice;
	}
	
	public List<String> getViewCartTableData_ProductUnitPrices() {
		List<String> productUnitPrices = new ArrayList<>();
		List<WebElement> viewCartTableRows = driver.findElements(By.xpath("//div[@class='table-responsive']//table//tr"));
		for(int r = 1; r < viewCartTableRows.size(); r++ ) {
			WebElement row = viewCartTableRows.get(r);
			List<WebElement> viewCartTableProductUnitPrices = row.findElements(By.xpath("td[5]"));
			for(WebElement price : viewCartTableProductUnitPrices) {
				String unitPriceText = price.getText();
				String unitPrice = unitPriceText.replace("$", "").trim();
				if(!unitPrice.trim().isEmpty()) {
					productUnitPrices.add(unitPrice);
				};
			}
	}
		return productUnitPrices;
	}
	
	public List<String> getViewCartTableData_ProductTotalPrices() {
		List<String> productTotalPrices = new ArrayList<>();
		List<WebElement> viewCartTableRows = driver.findElements(By.xpath("//div[@class='table-responsive']//table//tr"));
		for(int r = 1; r < viewCartTableRows.size(); r++ ) {
			WebElement row = viewCartTableRows.get(r);
			List<WebElement> viewCartTableProductTotalPrices = row.findElements(By.xpath("td[6]"));
			for(WebElement totalPrices : viewCartTableProductTotalPrices) {
				String totalPriceText = totalPrices.getText();
				String totalPrice = totalPriceText.replace("$", "").trim();
				if(!totalPrice.trim().isEmpty()) {
					productTotalPrices.add(totalPrice);
				};
			}
		}
		return productTotalPrices;
	}
}
