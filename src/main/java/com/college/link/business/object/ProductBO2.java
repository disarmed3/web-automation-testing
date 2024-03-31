package com.college.link.business.object;

import com.college.link.page.object.Homepage2;
import com.college.link.page.object.ProductPage2;
import com.college.link.page.object.SearchResultsPage2;
import org.openqa.selenium.WebDriver;

public class ProductBO2 {
    private Homepage2 homepage;
    private SearchResultsPage2 searchResultsPage;
    private ProductPage2 productPage;

    public ProductBO2(WebDriver driver) {
        this.homepage = new Homepage2(driver);
        this.searchResultsPage = new SearchResultsPage2(driver);
        this.productPage = new ProductPage2(driver);
    }
    public  void navigateToHomepage(String url){
        homepage.navigateTo(url);
    }
    public void searchProduct(String query) {

        homepage.search(query);
    }

    public void filterProduct() {
        searchResultsPage.filterByScreenSize();

    }
    public void selectProduct(){
        searchResultsPage.selectProduct();
    }
    public void assertTitle(String expectedTitle){
        productPage.assertTitle(expectedTitle);
    }
    public void assertFeature(String expectedFeature) {

        productPage.assertFeature(expectedFeature);
    }
}