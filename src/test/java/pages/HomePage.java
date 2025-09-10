package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement shoppingCartButtonLabel;
	
	@FindBy(linkText="Desktops")
	private WebElement desktopsNavLink;
	
	@FindBy(xpath="//a[normalize-space()='PC (0)']")
	private WebElement desktopsNavLink_PC;
	
	@FindBy(xpath="//a[normalize-space()='Mac (1)']")
	private WebElement desktopsNavLink_Mac;
	
	@FindBy(xpath="//a[normalize-space()='Show AllDesktops']")
	private WebElement desktopsNavLink_Desktops;
	
	@FindBy(xpath="//h2[normalize-space()='PC']")
	private WebElement desktopsNavLink_PC_Heading;
	
	@FindBy(xpath="//h2[normalize-space()='Mac']")
	private WebElement desktopsNavLink_Mac_Heading;
	
	@FindBy(xpath="//h2[normalize-space()='Desktops']")
	private WebElement desktopsNavLink_Desktops_Heading;
	
	@FindBy(linkText="Laptops & Notebooks")
	private WebElement laptopsNotebooksNavLink;
	
	@FindBy(xpath="//a[normalize-space()='Macs (0)']")
	private WebElement laptopsNotebooksNavLink_Macs;
	
	@FindBy(xpath="//a[normalize-space()='Windows (0)']")
	private WebElement laptopsNotebooksNavLink_Windows;
	
	@FindBy(xpath="//a[normalize-space()='Show AllLaptops & Notebooks']")
	private WebElement laptopsNotebooksNavLink_LaptopsNotebooks;
	
	@FindBy(xpath="//h2[normalize-space()='Macs']")
	private WebElement laptopsNotebooksNavLink_Macs_Heading;
	
	@FindBy(xpath="//h2[normalize-space()='Windows']")
	private WebElement laptopsNotebooksNavLink_Windows_Heading;
	
	@FindBy(xpath="//h2[normalize-space()='Laptops & Notebooks']")
	private WebElement laptopsNotebooksNavLink_LaptopsNotebooks_Heading;
	
	@FindBy(linkText="Components")
	private WebElement componentsNavLink;
	
	@FindBy(xpath="//a[normalize-space()='Mice and Trackballs (0)']")
	private WebElement componentsNavLink_MiceTrackballs;
	
	@FindBy(xpath="//h2[normalize-space()='Mice and Trackballs']")
	private WebElement componentsNavLink_MiceTrackballs_Heading;
	
	@FindBy(xpath="//a[normalize-space()='Monitors (2)']")
	private WebElement componentsNavLink_Monitors;
	
	@FindBy(xpath="//h2[normalize-space()='Monitors']")
	private WebElement componentsNavLink_Monitors_Heading;
	
	@FindBy(xpath="//a[normalize-space()='Printers (0)']")
	private WebElement componentsNavLink_Printers;
	
	@FindBy(xpath="//h2[normalize-space()='Printers']")
	private WebElement componentsNavLink_Printers_Heading;
	
	@FindBy(xpath="//a[normalize-space()='Scanners (0)']")
	private WebElement componentsNavLink_Scanners;
	
	@FindBy(xpath="//h2[normalize-space()='Scanners']")
	private WebElement componentsNavLink_Scanners_Heading;
	
	@FindBy(xpath="//a[normalize-space()='Web Cameras (0)']")
	private WebElement componentsNavLink_WebCameras;
	
	@FindBy(xpath="//h2[normalize-space()='Web Cameras']")
	private WebElement componentsNavLink_WebCameras_Heading;
	
	@FindBy(xpath="//a[normalize-space()='Show AllComponents']")
	private WebElement componentsNavLink_Components;
	
	@FindBy(xpath="//h2[normalize-space()='Components']")
	private WebElement componentsNavLink_Components_Heading;
	
	@FindBy(linkText="Tablets")
	private WebElement tabletsNavLink;
	
	@FindBy(linkText="Software")
	private WebElement softwareNavLink;
	
	@FindBy(linkText="Phones & PDAs")
	private WebElement phonesPDASNavLink;
	
	@FindBy(linkText="Cameras")
	private WebElement camerasNavLink;
	
	@FindBy(linkText="MP3 Players")
	private WebElement mp3PlayersNavLink;
	
	@FindBy(xpath="//li[@class='dropdown'][1]//li//a")
	private List <WebElement> desktopsNavLinkDropDownLinks;
	
	@FindBy(xpath="//li[@class='dropdown'][2]//li//a")
	private List <WebElement> laptopsNotebooksNavLinkDropDownLinks;
	
	@FindBy(xpath="//li[@class='dropdown'][3]//li//a")
	private List <WebElement> componentsNavLinkDropDownLinks;
	
	@FindBy(xpath="//li[@class='dropdown'][4]//li//a")
	private List <WebElement> mp3PlayersNavLinkDropDownLinks;
	
	@FindBy(xpath="//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='iPhone 6']")
	private WebElement iPhoneImage;
	
	@FindBy(xpath="//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='MacBookAir']")
	private WebElement MacBookAirImage;
	
	@FindBy(xpath="//h3[normalize-space()='Featured']")
	private WebElement featuredHeading;
	
	@FindBy(xpath="//div[@class='image']//img")
	private List<WebElement> featuredImages;
	
	@FindBy(xpath="//div[@class='caption']//p[1]")
	private List<WebElement> featuredImagesCaption;
	
	@FindBy(xpath="//p[@class='price']")
	private List<WebElement> featuredImagesPrice;
	
	@FindBy(xpath="//span[@class='price-old']")
	private List<WebElement> featuredImagesOldPrice;
	
	@FindBy(xpath="//span[@class='price-tax']")
	private List<WebElement> featuredImagesTaxPrice;
	
	@FindBy(xpath="//div[@class='button-group']//button[1]")
	private List<WebElement> featuredAddToCartButtons;
	
	@FindBy(xpath="//div[@class='button-group']//button[2]")
	private List<WebElement> featuredWishListButtons;
	
	@FindBy(xpath="//div[@class='button-group']//button[3]")
	private List<WebElement> featuredCompareProductButtons;
	
	@FindBy(xpath="//body/div[@id='common-home']/div[@class='row']/div[@id='content']/div[3]")
	private WebElement companyLogosSection;
	
	@FindBy(xpath="//div[@id='carousel0']//img")
	private List<WebElement> companyLogos;
	
	@FindBy(xpath="//div[@class='swiper-pagination carousel0 swiper-pagination-clickable swiper-pagination-bullets']//span[11]")
	private WebElement lastSwiperPaginationBullet;
	
	@FindBy(xpath="//div[@class='swiper-button-next'][2]")
	private WebElement swipeRightButton;
	
	@FindBy(xpath="//div[@class='col-sm-3']//h5")
	private List<WebElement> footerHeadings;
	
	@FindBy(xpath="//div[@class='col-sm-3']//a")
	private List<WebElement> footerHyperlinks;
	
	@FindBy(xpath="//footer")
	private WebElement footer;
	
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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
	
	public void hoverToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	public String getFilteredDropdownLinkText(List<WebElement> dropdownElements, String textToExclude) {
	    List<String> linkTexts = new ArrayList<>();
	    for (WebElement element : dropdownElements) {
	        String text = element.getText().trim();
	        if (!text.isEmpty() && !text.equalsIgnoreCase(textToExclude)) {
	            linkTexts.add(text);
	        }
	    }
	    return String.join(", ", linkTexts);
	}
	
	public String getAttributeValues(List<WebElement> elements, String attributeName) {
		List<String> attributeValues = new ArrayList<>();
		for(WebElement element : elements) {
			String value = element.getDomAttribute(attributeName);
			attributeValues.add(value);
		}
		return String.join(", ", attributeValues);
	}
	
	public String getElementsText(List<WebElement> elements) {
		List<String> elementsText = new ArrayList<>();
		for(WebElement element : elements) {
			String text = element.getText();
			elementsText.add(text);
		}
		return String.join("; ", elementsText);
	}
	
	public void scrollToElements(List<WebElement> elements) throws InterruptedException {
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		for(WebElement element : elements) {
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			Thread.sleep(1000);
		}
	}
	
	public void scrollToElement(WebElement element) throws InterruptedException {
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(1000);
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
	
	public boolean isSearchBoxDisplayed() {
		return isElementDisplayed(searchBox);
	}
	
	public boolean isSearchButtonDisplayed() {
		return isElementDisplayed(searchButton);
	}
	
	public String getSearchBarPlaceholderText() {
		String searchBarPlaceholderText = searchBox.getDomAttribute("placeholder");
		return searchBarPlaceholderText;
	}
	
	public String getShoppingCartButtonLabelText_NoItems() {
		return getElementText(shoppingCartButtonLabel);
	}
	
	public String getDesktopNavLinkText() {
		return getElementText(desktopsNavLink);
	}
	
	public String getLaptopsNotebooksNavLinkText() {
		return getElementText(laptopsNotebooksNavLink);
	}

	public String getComponentsNavLinkText() {
		return getElementText(componentsNavLink);
	}
	
	public String getTabletsNavLinkText() {
		return getElementText(tabletsNavLink);
	}
	
	public String getSoftwareNavLinkText() {
		return getElementText(softwareNavLink);
	}
	
	public String getPhonesPDASNavLinkText() {
		return getElementText(phonesPDASNavLink);
	}
	
	public String getCamerasNavLinkText() {
		return getElementText(camerasNavLink);
	}
	
	public String getMP3PlayersNavLinkText() {
		return getElementText(mp3PlayersNavLink);
	}
	
	public void hoverToDesktopLink() {
		hoverToElement(desktopsNavLink);
	}
	
	public void clickDesktopLink_PC() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(desktopsNavLink_PC).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(1));
		Thread.sleep(3000);
	}
	
	public void clickDesktopLink_Mac() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(desktopsNavLink_Mac).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(2));
		Thread.sleep(3000);
	}
	
	public void clickDesktopLink_Desktops() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(desktopsNavLink_Desktops).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(3));
		Thread.sleep(3000);
	}

	
	public String getDesktopsLink_PC_HeadingText() {
		return getElementText(desktopsNavLink_PC_Heading);
	}
	
	public String getDesktopsLink_Mac_HeadingText() {
		return getElementText(desktopsNavLink_Mac_Heading);
	}
	
	public String getDesktopsLink_Desktops_HeadingText() {
		return getElementText(desktopsNavLink_Desktops_Heading);
	}
	
	public void hoverToLaptopsNotebooksLink() {
		hoverToElement(laptopsNotebooksNavLink);
	}
	
	public void clickLaptopsNotebooksLink_Macs() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(laptopsNotebooksNavLink_Macs).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(1));
		Thread.sleep(3000);
	}
	
	public void clickLaptopsNotebooksLink_Windows() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(laptopsNotebooksNavLink_Windows).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(2));
		Thread.sleep(3000);
	}
	
	public void clickLaptopsNotebooksLink_LaptopsNotebooks() throws InterruptedException {
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(laptopsNotebooksNavLink_LaptopsNotebooks).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(3));
		Thread.sleep(3000);
	}
	
	public String getLaptopsNotebooksLink_Macs_HeadingText() {
		return getElementText(laptopsNotebooksNavLink_Macs_Heading);
	}
	
	public String getLaptopsNotebooksLink_Windows_HeadingText() {
		return getElementText(laptopsNotebooksNavLink_Windows_Heading);
	}
	
	public String getLaptopsNotebooksLink_LaptopsWindows_HeadingText() {
		return getElementText(laptopsNotebooksNavLink_LaptopsNotebooks_Heading);
	}
	
	public void hoverToComponentsLink() {
		hoverToElement(componentsNavLink);
	}
	
	public void clickComponentsLink_MiceTracksballs() throws InterruptedException{
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(componentsNavLink_MiceTrackballs).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandleSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowsHandleSet);
		driver.switchTo().window(windowHandles.get(1));
		Thread.sleep(3000);
	}
	
	public void clickComponentsLink_Monitors() throws InterruptedException{
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(componentsNavLink_Monitors).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandleSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowsHandleSet);
		driver.switchTo().window(windowHandles.get(2));
		Thread.sleep(3000);
	}
	
	public void clickComponentsLink_Printers() throws InterruptedException{
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(componentsNavLink_Printers).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandleSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowsHandleSet);
		driver.switchTo().window(windowHandles.get(3));
		Thread.sleep(3000);
	}
	
	public void clickComponentsLink_Scanners() throws InterruptedException{
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(componentsNavLink_Scanners).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandleSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowsHandleSet);
		driver.switchTo().window(windowHandles.get(4));
		Thread.sleep(3000);
	}
	
	public void clickComponentsLink_WebCameras() throws InterruptedException{
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(componentsNavLink_WebCameras).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandleSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowsHandleSet);
		driver.switchTo().window(windowHandles.get(5));
		Thread.sleep(3000);
	}
	
	
	public void clickComponentsLink_Components() throws InterruptedException{
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(componentsNavLink_Components).keyUp(Keys.COMMAND).perform();
		Set<String> windowsHandleSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowsHandleSet);
		driver.switchTo().window(windowHandles.get(6));
		Thread.sleep(3000);
	}
	
	
	public String getComponentsLink_MiceTrackballs_HeadingText() {
		return getElementText(componentsNavLink_MiceTrackballs_Heading);
	}
	
	public String getComponentsLink_Monitors_HeadingText() {
		return getElementText(componentsNavLink_Monitors_Heading);
	}
	
	public String getComponentsLink_Printers_HeadingText() {
		return getElementText(componentsNavLink_Printers_Heading);
	}
	
	public String getComponentsLink_Scanners_HeadingText() {
		return getElementText(componentsNavLink_Scanners_Heading);
	}
	
	public String getComponentsLink_WebCameras_HeadingText() {
		return getElementText(componentsNavLink_WebCameras_Heading);
	}
	
	public String getComponentsLink_Components_HeadingText() {
		return getElementText(componentsNavLink_Components_Heading);
	}


	
	public void hoverToMP3PlayersLink() {
		hoverToElement(mp3PlayersNavLink);
	}
	
	public String getDesktopsDropdownNavLinkText() {
		String desktopsDropdownNavLinkText = getFilteredDropdownLinkText(desktopsNavLinkDropDownLinks, "Desktops");
		return desktopsDropdownNavLinkText;
	}
	
	public String getLaptopNotebooksDropdownNavLinkText() {
		String laptopNotebookNavLinkText = getFilteredDropdownLinkText(laptopsNotebooksNavLinkDropDownLinks, "Laptops & Notebooks");
		return laptopNotebookNavLinkText;
	}
	
	public String getComponentsDropdownNavLinkText() {
		String componentsDropdownNavLinkText = getFilteredDropdownLinkText(componentsNavLinkDropDownLinks, "Components");
		return componentsDropdownNavLinkText;
	}
	
	public String getMP3DropdownNavLinkText() {
		String MP3DropdownNavLinkText = getFilteredDropdownLinkText(mp3PlayersNavLinkDropDownLinks, "MP3 Players");
		return MP3DropdownNavLinkText;
	}
	
	public boolean isIPhoneImageDisplayed() {
		return isElementDisplayed(iPhoneImage);
	}
	
	public boolean isMacBookAirImageDisplayed() {
		return isElementDisplayed(MacBookAirImage);
	}
	
	public boolean isFeaturedHeadingDisplayed() {
		return isElementDisplayed(featuredHeading);
	}
	
	public String getFeaturedHeadingText() {
		String featuredHeadingText = featuredHeading.getText();
		return featuredHeadingText;
	}
	
	public boolean isFeaturedImagesDisplayed() {
		for(WebElement featuredImage : featuredImages) {
			return isElementDisplayed(featuredImage);
		}
		return false;
	}
	
	public String getFeaturedImagesURL() {
		return getAttributeValues(featuredImages, "src");
	}
	
	public String getFeaturedImagesTitle() {
		return getAttributeValues(featuredImages, "title");
	}
	
	public String getFeaturedImagesCaption() {
		return getElementsText(featuredImagesCaption);
	}
	
	public String getFeaturedImagesPrice() {
		return getElementsText(featuredImagesPrice);
	}
	
	public String getFeaturedImagesOldPrice() {
		return getElementsText(featuredImagesOldPrice);
	}
	
	public String getFeaturedImagesTaxPrice() {
		return getElementsText(featuredImagesTaxPrice);
	}
	
	public boolean isFeaturedImagesAddToCartButtonsDisplayed() {
		for(WebElement featuredAddToCartButton : featuredAddToCartButtons  ) {
			return isElementDisplayed(featuredAddToCartButton);
		}
		return false;
	}
	
	public void scrollToFeaturedImagesAddToCartButtons() throws InterruptedException {
		scrollToElements(featuredAddToCartButtons);
	}
	
	public boolean isFeaturedWishListButtonsDisplayed() {
		for(WebElement featuredWishListButton : featuredWishListButtons) {
			return isElementDisplayed(featuredWishListButton);
		}
		return false;
	}
	
	public void scrollToFeaturedWishListButtons() throws InterruptedException {
		scrollToElements(featuredWishListButtons);
	}
	
	public boolean isFeaturedCompareProductButtonsDisplayed() {
		for(WebElement featuredCompareProductButton : featuredCompareProductButtons) {
			return isElementDisplayed(featuredCompareProductButton);
		}
		return false;
	}
	
	public void scrollToFeaturedCompareProductButtons() throws InterruptedException {
		scrollToElements(featuredCompareProductButtons);
	}
	
	public void scrollToCompanyLogosSwiper() throws InterruptedException {
		scrollToElement(companyLogosSection);
	}
	
	public void swipeRight() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    int totalBullets = 11;

	    for (int i = 1; i < totalBullets; i++) {
	        wait.until(ExpectedConditions.visibilityOf(swipeRightButton));
	        wait.until(ExpectedConditions.elementToBeClickable(swipeRightButton));
	        swipeRightButton.click();

	        // Small pause to allow animation to complete
	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }

	        WebElement lastBullet = driver.findElement(By.xpath(
	            "//div[@class='swiper-pagination carousel0 swiper-pagination-clickable swiper-pagination-bullets']//span[" + totalBullets + "]"
	        ));

	        String classValue = lastBullet.getDomAttribute("class");
	        if (classValue != null && classValue.contains("swiper-pagination-bullet-active")) {
	            System.out.println("Last bullet is active, stopping swipe.");
	            break;
	        }
	    }
	}


	
	public boolean isCompanyLogosDisplayed() {
		
	    for (WebElement companyLogo : companyLogos) {
	        if (!isElementDisplayed(companyLogo)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public void scrollToFooter() throws InterruptedException {
		scrollToElement(footer);
	}
	
	public boolean isFooterHeadingsDisplayed() {
		for(WebElement footerHeading : footerHeadings) {
			return isElementDisplayed(footerHeading);
		}
		return false;
	}
	
	public String getFooterHeadingsText() {
		return getElementsText(footerHeadings);
	}

	public boolean isFooterHyperlinksDisplayed() {
		for(WebElement footerHyperlink : footerHyperlinks) {
			return isElementDisplayed(footerHyperlink);
		}
		return false;
	}
	
	public String getFooterHyperlinksText() {
		return getElementsText(footerHyperlinks);
	}
	
}
