package com.college.link;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestSetup2 {

        public static WebDriver driver;



        @BeforeClass
        public void setupClass() {
            // Setup WebDriver Manager
            WebDriverManager.chromedriver().setup();

            // Initialize WebDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


        }

        @AfterClass
        public void teardownClass() {
            // Close the driver after use
            if (driver != null) {
                driver.quit();
            }
        }
    }

