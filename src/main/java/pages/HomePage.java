package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;



    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassowrd(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public ABTesting clickABTesting(){
        clickLink("A/B Testing");
        return new ABTesting(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AddRemoveElementPage clickAddRemoveElement(){
        clickLink("Add/Remove Elements");
        return new AddRemoveElementPage(driver);
    }

    public HorizontalSlidePage clickHorizontalSlide(){
        clickLink("Horizontal Slider");
        return new HorizontalSlidePage(driver);
    }

    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }
}