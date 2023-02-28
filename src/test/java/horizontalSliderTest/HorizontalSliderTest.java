package horizontalSliderTest;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSlidePage;

import static org.testng.AssertJUnit.assertEquals;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void horizontalSlideTest() {
        String value = "5";
        var horizontalSlide = homePage.clickHorizontalSlide();
        horizontalSlide.setSliderValue(value);
        assertEquals(horizontalSlide.getSliderValue(), value, horizontalSlide.getSliderValue());
    }
}



