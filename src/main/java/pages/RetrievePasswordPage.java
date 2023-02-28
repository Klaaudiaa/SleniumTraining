package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePasswordPage {
    private final WebDriver driver;
    private final By statusInformation = By.cssSelector("body h1");
    public RetrievePasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public String getInformation(){
        return driver.findElement(statusInformation).getText();
    }
}
