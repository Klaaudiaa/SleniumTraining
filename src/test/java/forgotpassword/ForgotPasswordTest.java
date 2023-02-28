package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.RetrievePasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void succesfulPasswordRetrieve(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassowrd();
        forgotPasswordPage.setEmail("klaudia@gmail.com");
        RetrievePasswordPage retrievePasswordPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(retrievePasswordPage.getInformation().contains("Internal Server Error"), "Email is incorrect");
    }
}
