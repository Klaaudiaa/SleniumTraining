package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage{
    private final WebDriver driver;
    public BasicAuthPage(WebDriver driver) {

        this.driver = driver;
    }
    public BasicAuthPage clickLogin() {
        driver.findElement(By.linkText("Zaloguj się")).click();
        return new BasicAuthPage(driver);
    }
        public String getInfo(){
        return driver.findElement(By.cssSelector("div p")).getText();
    }
}


//ublic static void main(String[] args) {
//
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\chromedriver\\chromedriver.exe");
//			//Instantiate the webdriver
//			WebDriver driver = new ChromeDriver();
//
//			//Set the username
//			String username = "admin";
//
//			//Set the password
//			String password = "admin";
//
//
//			String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
//			driver.get(URL);
//
//			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//			String title = driver.getTitle();
//
//			System.out.println("The page title is "+title);
//
//			String text = driver.findElement(By.tagName("p")).getText();
//
//			System.out.println("The test present in page is ==> "+text);
//