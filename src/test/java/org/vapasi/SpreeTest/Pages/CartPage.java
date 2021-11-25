package org.vapasi.SpreeTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    public CartPage(WebDriver driver){

        this.driver = driver;
    }
    public String getCartValue() {

       String cartTotalValue = driver.findElement(By.cssSelector("[data-hook='cart_item_total']")).getText();
return cartTotalValue;
    }
    public void clickCheckOut(){
        driver.findElement(By.id("checkout-link")).click();
    }

}
