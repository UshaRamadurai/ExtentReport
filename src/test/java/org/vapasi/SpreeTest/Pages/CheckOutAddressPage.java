package org.vapasi.SpreeTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutAddressPage {
    WebDriver driver;
    public CheckOutAddressPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterBillingAddress() {
//        driver.findElement(By.id("order_bill_address_attributes_firstname")).sendKeys("Sathish");
//        driver.findElement(By.id("order_bill_address_attributes_lastname")).sendKeys("Kumar");
//        driver.findElement(By.id("order_bill_address_attributes_address1")).sendKeys("No:81,SIP Avenue");
//        driver.findElement(By.id("order_bill_address_attributes_city")).sendKeys("New Jersey");
//        WebElement stateDropDown = driver.findElement(By.id("order_bill_address_attributes_state_id"));
//        Select selectState = new Select(stateDropDown);
//        selectState.selectByVisibleText("New Jersey");
//        driver.findElement(By.id("order_bill_address_attributes_zipcode")).sendKeys("07303");
//        WebElement countryDropDown = driver.findElement(By.id("order_bill_address_attributes_country_id"));
//        Select selectCountry = new Select(countryDropDown);
//        selectCountry.selectByVisibleText("United States of America");
//        driver.findElement(By.id("order_bill_address_attributes_phone")).sendKeys("2904019580");
//        driver.findElement(By.id("save_user_address")).click();
      driver.findElement(By.name("commit")).click();

    }

}
