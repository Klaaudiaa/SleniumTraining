package basicAuthTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BasicAuthTest {
    private WebDriver driver;
    String URL = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }
    @Test
    public void basicAuthTest(){
        //var basicAuthPage = homePage.clickBasicAuth();
        driver.get(URL);
        assertTrue(driver.findElement(By.tagName("p")).getText().
                                                        contains("Congratulations! You must have the proper credentials."),
                                                            "Alert: login or password is incorrect");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
