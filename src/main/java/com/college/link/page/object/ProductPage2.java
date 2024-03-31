package com.college.link.page.object;

import org.openqa.selenium.*;
import org.testng.Assert;

public class ProductPage2 {
    private WebDriver driver;
    private By characteristics = By.xpath("//span[contains(text(),'ΧΑΡΑΚΤΗΡΙΣΤΙΚΑ')]");

    public ProductPage2(WebDriver driver) {
        this.driver = driver;
    }

    public void assertTitle(String expectedTitle) {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains(expectedTitle), "The phone is not " + expectedTitle);
    }

    public void assertFeature(String expectedFeature) {
        driver.findElement(characteristics).click();
        String pageText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(pageText.contains(expectedFeature), "The phone is not " + expectedFeature);
    }
}