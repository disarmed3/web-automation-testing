package com.college.link.page.object;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SearchResultsPage2 {
    private WebDriver driver;
    private By filterCollapseButton = By.xpath("//h6[contains(text(),'Εύρος Οθόνης')]");
    private By checkbox = By.xpath("//input[@value='ads_f79001_ntk_cs%3A%226+%CE%AF%CE%BD%CF%84%CF%83%CE%B5%CF%82+%CE%BA%CE%B1%CE%B9+%CE%AC%CE%BD%CF%89%22']");
    private By productLink = By.xpath("//p[contains(text(),'Apple iPhone 13 128GB Midnight Κινητό Smartphone')]");

    public SearchResultsPage2(WebDriver driver) {
        this.driver = driver;
    }

    public void filterByScreenSize() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(filterCollapseButton));

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click()", driver.findElement(filterCollapseButton));
        js.executeScript("arguments[0].click()", driver.findElement(checkbox));
    }

    public void selectProduct() {
        driver.findElement(productLink).click();
    }
}