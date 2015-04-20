package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    @Parameters({"browser"})
    @BeforeClass
    public void driverSetUp(String browser) {

        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "D:\\Java_\\Java_EE\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("firefox")){
            driver = new FirefoxDriver();
        }
    }

    @AfterClass
    public void driverTearDown() {
        driver.quit();
    }
}
