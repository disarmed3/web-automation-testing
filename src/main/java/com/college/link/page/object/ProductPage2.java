package com.college.link.page.object;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(characteristics));

        new Actions(driver).moveToElement(driver.findElement(characteristics)).click().perform();


        //driver.findElement(characteristics).click();
        String pageText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(pageText.contains(expectedFeature), "The phone is not " + expectedFeature);
    }
}