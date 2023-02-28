package addRemoveElementTest;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AddRemoveElementPage;

import static org.testng.Assert.assertTrue;

public class AddRemoveElementTest extends BaseTests {
    @Test
    public void addRemoveTest(){
        AddRemoveElementPage addRemoveElementPage = homePage.clickAddRemoveElement();
        addRemoveElementPage.clickAddButton();
//        assertTrue(addRemoveElementPage.checkAddedElement().contains("Delete"), "Add button isn't working");
        assertTrue(addRemoveElementPage.checkAddedElement(),"Add button is not working.");
        addRemoveElementPage.clickRemoveButton();
        assertTrue(addRemoveElementPage.isElementPresent(By.className("added-manually")));
    }
}

