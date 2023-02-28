package dropdowntest;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropDown();

        String option1 = "Option1";
        dropdownPage.selectFromDropDown(option1);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1, "Incorrect");
        assertTrue(selectedOptions.contains(option1),"Option not selected");
    }
}
