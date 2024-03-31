package com.college.link.business.object;

import com.college.link.page.object.HomePage1;
import com.college.link.page.object.ProductPage1;
import com.college.link.page.object.SearchResultsPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductBO1 {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductBO1(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateTo(String url){
        HomePage1 homepage = new HomePage1(driver);
        homepage.navigateTo(url);
    }
    public void searchProduct(String product) {
        HomePage1 homePage = new HomePage1(driver);
        homePage.searchProduct(product);
    }

    public void selectNthProduct(int n) {
        SearchResultsPage1 searchResultsPage = new SearchResultsPage1(driver);
        searchResultsPage.selectNthProduct(n);
    }

    public void verifyProductDetails(String screenSize, String brand) {
        ProductPage1 productPage = new ProductPage1(driver);
        productPage.verifyScreenSize(screenSize);
        productPage.verifyBrand(brand);
    }
}