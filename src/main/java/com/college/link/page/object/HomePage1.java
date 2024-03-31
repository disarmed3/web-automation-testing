package com.college.link.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;


public class HomePage1 {
    WebDriver driver;

    public void navigateTo(String url){
        driver.get(url);
    }
    By searchBox1 = By.id("twotabsearchtextbox");
    By searchBox2 = By.id("nav-bb-search");
    public HomePage1(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchBox() {
        try {
            return driver.findElement(searchBox1);
        } catch (NoSuchElementException e) {
            return driver.findElement(searchBox2);
        }
    }
    public void searchProduct(String product) {
        WebElement searchBox = getSearchBox();
        searchBox.sendKeys(product);
        searchBox.submit();
    }
}