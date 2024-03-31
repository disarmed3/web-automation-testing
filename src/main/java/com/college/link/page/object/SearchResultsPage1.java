package com.college.link.page.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage1 {
    WebDriver driver;


    public SearchResultsPage1(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNthProduct(int n) {

        String xpathExpression = String.format("//div[@data-component-type='s-search-result'][%d]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']", n);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));

        return driver.findElement(By.xpath(xpathExpression));
    }

    public void selectNthProduct(int n) {
        getNthProduct(n).click();
    }
}