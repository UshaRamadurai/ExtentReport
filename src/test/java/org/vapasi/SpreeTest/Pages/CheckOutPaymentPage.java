package org.vapasi.SpreeTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPaymentPage {

    WebDriver driver;
    public CheckOutPaymentPage(WebDriver driver){

        this.driver = driver;
    }
    public void clickCheckSaveAndContinue(){
        driver.findElement(By.id("order_payments_attributes__payment_method_id_3")).click();
        driver.findElement(By.name("commit")).click();
    }
}
