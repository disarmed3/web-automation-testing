package com.college.link;

import com.college.link.business.object.ProductBO1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestCase1 extends TestSetup1 {


    ProductBO1 productBO;

    @BeforeMethod
    public void setup(){
        productBO = new ProductBO1(driver,wait);
    }

    @Test
    @Parameters({"url"})
    public void testStep1(String url)  {
        productBO.navigateTo(url);

            }
    @Test
    public void testStep2() {
        productBO.searchProduct("lg tv 65");
    }

    @Test
    public void testStep3() {
        productBO.selectNthProduct(3);

    }
    @Test
    public void testStep4(){
        productBO.verifyProductDetails("65", "LG");

        }
        }



