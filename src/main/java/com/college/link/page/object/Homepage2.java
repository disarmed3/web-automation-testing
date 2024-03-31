package com.college.link.page.object;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchTerm));


        WebElement searchBox2 = driver.findElement(searchTerm);
        searchBox2.sendKeys(query);
        try {
            // pause execution for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // handle the exception
            e.printStackTrace();
        }

            searchBox2.sendKeys(Keys.ENTER);
        }
    }


