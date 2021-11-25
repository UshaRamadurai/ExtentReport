package org.vapasi.SpreeTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutDeliveryPage {
    WebDriver driver;
    public CheckOutDeliveryPage(WebDriver driver){

        this.driver = driver;
    }
    public void clickSaveAndContinue(){
        driver.findElement(By.name("commit")).click();
    }
}
