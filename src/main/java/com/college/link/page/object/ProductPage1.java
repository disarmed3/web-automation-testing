package com.college.link.page.object;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage1 {
    WebDriver driver;
   public ProductPage1(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void verifyScreenSize(String expectedScreenSize) {
        String title = getTitle();
        Assert.assertTrue(title.contains(expectedScreenSize), "The screen is not " + expectedScreenSize);
    }

    public void verifyBrand(String expectedBrand) {
        String title = getTitle();
        Assert.assertTrue(title.contains(expectedBrand), "The TV is not " + expectedBrand);
    }
}
