package com.college.link.page.object;

import org.openqa.selenium.*;

public class Homepage2 {
    private WebDriver driver;
    private By searchTerm = By.id("searchTermSN");

    public Homepage2(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void search(String query) {
        WebElement searchBox2 = driver.findElement(searchTerm);
        searchBox2.sendKeys(query);
        try {
            searchBox2.submit();
        } catch (NoSuchElementException e) {
            searchBox2.sendKeys(Keys.ENTER);
        }
    }
}
