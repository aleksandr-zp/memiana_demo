package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Reporter;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        Reporter.log("Open memiana.com");
        driver.get("http://www.memiana.com/");
    }


    public void typeLoginName(String name) {
        type(name, "authLogin", By.id("authLogin"));
    }

    public void typeLoginPassword(String password) {
        type(password, "authPassword", By.id("authPassword"));
    }

    public void clickLoginButton() {
        click("loginFormButton", By.id("loginFormButton"));
    }

    public void waitForVisibilityResultLoginSuccess() {
        waitForVisibilityResult("startPage__wrapper", By.className("startPage__wrapper"));
    }

}
