package org.vapasi.SpreeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.vapasi.SpreeTest.Pages.*;

public class SpreeTest extends BaseTest {

    @Test
    public void test() {
        LoginPage loginPage= new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage pdtPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckOutAddressPage addressPage = new CheckOutAddressPage(driver);
        CheckOutDeliveryPage deliveryPage = new CheckOutDeliveryPage(driver);
        CheckOutPaymentPage paymentPage = new CheckOutPaymentPage(driver);

        loginPage.login("tests@gmail.com","testpassword");
        homePage.categorySelect();
        pdtPage.addPdtToCart();
        Assert.assertEquals( cartPage.getCartValue(),"$31.98");
        cartPage.clickCheckOut();
        addressPage.enterBillingAddress();
        deliveryPage.clickSaveAndContinue();
        paymentPage.clickCheckSaveAndContinue();

    }

    }
