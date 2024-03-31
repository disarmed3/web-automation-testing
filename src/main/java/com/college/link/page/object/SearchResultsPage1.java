package com.college.link.page.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage1 {
    WebDriver driver;


    public SearchResultsPage1(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNthProduct(int n) {
        String xpathExpression = String.format("//div[@data-component-type='s-search-result'][%d]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']", n);
        return driver.findElement(By.xpath(xpathExpression));
    }

    public void selectNthProduct(int n) {
        getNthProduct(n).click();
    }
}