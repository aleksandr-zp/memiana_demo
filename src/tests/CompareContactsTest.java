package tests;

import actions.GeneralActions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.StaticProvider;


public class CompareContactsTest extends BaseTest {

    GeneralActions generalActions;
    private int contactsCountDefault;
    private int contactCountTable;

    @BeforeClass
    public void setUp() {
        generalActions = new GeneralActions(driver);
    }

    @Test(dataProvider = "person", dataProviderClass = StaticProvider.class)
    public void compareContactsCountTest(String name, String password) {
        generalActions.login(name, password);
        contactsCountDefault = generalActions.getVisibleContactsCount();
        contactCountTable = generalActions.getInvisibleContactsCount();
        Assert.assertEquals(contactCountTable, contactsCountDefault, "Wrong contacts count");

    }
}
