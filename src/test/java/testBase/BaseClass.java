package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  // <-- import this
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    
    public WebDriver driver;
    
    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        
        // Add recommended options for CI/headless environments
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless=new"); // or "--headless"
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        
        driver = new ChromeDriver(options);  // Pass options here
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
