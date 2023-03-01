package brokenImage;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BrokenImagesTest extends BaseTests {
    @Test
    public void BrokenImages() {
        var brokenImagesPage = homePage.clickBrokenImages();
        brokenImagesPage.validateInvalidImages();
        assertEquals(brokenImagesPage.countImages(),4 , "More images than expected");
    }
}

