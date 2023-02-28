package basicAuthTest;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BasicAuthPage;

import static org.testng.Assert.assertTrue;

public class BasicAuthTest extends BaseTests {

    WebDriver driver;
    @Test
    public void basicAuthTest(){
        BasicAuthPage basicAuthPage = homePage.clickBasicAuth();
        String URL = "https://" + "admin" +":" + "admin" +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
        basicAuthPage.clickLogin();
        assertTrue(basicAuthPage.getInfo().contains("Congratulations! You must have the proper credentials."),
                "Alert: login or password is incorrect");
    }

}
