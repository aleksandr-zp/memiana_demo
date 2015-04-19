package actions;


import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.ContactsPage;
import pages.LoginPage;
import utils.Reporter;

public class GeneralActions {

    private WebDriver driver;
    private LoginPage loginPage;
    private ContactsPage contactsPage;
    private BasePage page;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        contactsPage = new ContactsPage(driver);
        page = new BasePage(driver);
    }

    public void login(String name, String password) {
        Reporter.log("Login");
        loginPage.openMainPage();
        loginPage.typeLoginName(name);
        loginPage.typeLoginPassword(password);
        loginPage.clickLoginButton();
    }

    public int getVisibleContactsCount() {
        int contactsCountDefault;
        contactsPage.openFriendForm();
        contactsCountDefault = contactsPage.getVisibleContactsCount();
        return contactsCountDefault;
    }

    public int getInvisibleContactsCount() {
        int contactCountTable;
        contactsPage.scrollDownPage();
        contactCountTable = contactsPage.getInvisibleContactsCount();
        return contactCountTable;
    }


}
