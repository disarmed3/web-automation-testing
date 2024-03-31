package com.college.link;

import com.college.link.business.object.ProductBO2;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestCase2 extends TestSetup2 {
    private ProductBO2 productBO;
    @Test
    @Parameters({"url"})
    public void TestStep1(String url) throws InterruptedException {

        productBO = new ProductBO2(driver);
        productBO.navigateToHomepage(url);
        Thread.sleep(2000);
    }
     @Test
     public void TestStep2() throws InterruptedException {

         productBO.searchProduct("iphone 13");
         }

    @Test
    public void TestStep3() throws InterruptedException {

        productBO.filterProduct();
        Thread.sleep(5000);
    }
    @Test
    public void TestStep4() throws InterruptedException {

        productBO.selectProduct();
    }
    @Test
    public void TestStep5() throws InterruptedException {

        productBO.assertTitle("Apple iPhone 13 128GB Midnight");
    }
    @Test
    public void TestStep6() throws InterruptedException {

        productBO.assertFeature("5G");

    }
    }
