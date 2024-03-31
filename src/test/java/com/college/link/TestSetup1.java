package com.college.link;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TestSetup1 {
    public static WebDriver driver;
    public static Duration durationInMinutes = Duration.ofSeconds(10);
    public static WebDriverWait wait;

    @BeforeClass

    public void setupClass() {
        // Setup WebDriver Manager
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Initialize WebDriver Wait
        wait = new WebDriverWait(driver, durationInMinutes);

        // Wait for me to pass the CAPTCHA
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterClass
    public void teardownClass() {
        // Close the driver after use
        if (driver != null) {
            driver.quit();
        }
    }
}
