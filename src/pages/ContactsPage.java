package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Reporter;

public class ContactsPage extends BasePage {
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public void openFriendForm() {
        Reporter.log("Open Contacts page");
        driver.get("https://www.memiana.com/addressbook/");
    }

    public int getVisibleContactsCount() {
        Reporter.log("Get visible count of contacts");
        int contactsCount;
        WebElement element = driver.findElement(By.className("count"));
        contactsCount = Integer.parseInt(element.getText().trim());
        return contactsCount;
    }

    public void scrollDownPage() {
        Reporter.log("Scroll down page");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");

    }

    public int getInvisibleContactsCount() {
        Reporter.log("Get invisible count of contacts");
        int contactsCount;
        WebElement element = driver.findElement(By.xpath("//tbody[@id='addressBookTBody']/tr[last()-1]"));
        contactsCount = Integer.parseInt(element.getAttribute("data-contact-index").trim());
        return contactsCount + 1;
    }
}
