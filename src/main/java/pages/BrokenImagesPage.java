package pages;

import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import java.util.List;

public class BrokenImagesPage {

    private WebDriver driver;
    int invalidImageCount = 0;
    List<WebElement> allImagesList = driver.findElements(By.tagName(".img"));

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void validateInvalidImages() {
        try {
            System.out.println("Total number of images are " + allImagesList.size());
            for (WebElement image : allImagesList) {
                if (image != null) {
                    verifyImageActive(image);
                    }
                }
            System.out.println("Total no. of invalid images are "	+ invalidImageCount);
            }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public int countImages(){
      return allImagesList.size();
    }

    public void verifyImageActive(WebElement element) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(element.getAttribute("src"));
            HttpResponse response = client.execute(request);
            if (response.getStatusLine().getStatusCode() != 200) //if response is diffrent than 200 it means image is broken
                invalidImageCount++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
