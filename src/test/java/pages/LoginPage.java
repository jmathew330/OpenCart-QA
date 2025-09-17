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

public class LoginPage extends BasePage {
	
	LoginPage loginPage;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement emailInput;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement passwordInput;
	
	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement noAccountMessage;
	
	
	public void clickLoginLink() throws InterruptedException {
		WebElement myAccountNavLink = driver.findElement(By.xpath("//a[@title='My Account']"));
		myAccountNavLink.click();
		WebElement myAccountNavLink_Login = driver.findElement(By.linkText("Login"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND).click(myAccountNavLink_Login).keyUp(Keys.COMMAND).perform();
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> windowHandles = new ArrayList<>(windowHandlesSet);
		driver.switchTo().window(windowHandles.get(1));
	}
	
	public void login(String email, String password) {
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		loginButton.click();
	}
	
	public boolean isElementDispayed(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
			return element.isDisplayed();
		}
		catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public String getElementText(WebElement element) {
		String elementText = element.getText();
		return elementText;
	}
	
	public boolean isNoAccountMessageDisplayed() {
		return isElementDispayed(noAccountMessage);
	}
	
	public String getNoAccountMessageText() {
		return getElementText(noAccountMessage);
	}

}
