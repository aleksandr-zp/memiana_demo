package utils;

//aleksandr_aleksandrov_ff -  123456abcdef;
// another_another - 123456abcdef;
// qa3905test - password! ;
// qa3906test - password! ;

import org.testng.annotations.DataProvider;

public class StaticProvider {
    @DataProvider(name = "person")
    public static Object[][] createData1() {
        return new Object[][]{
                {"qa3905test@gmail.com", "password!"}
        };
    }


}
