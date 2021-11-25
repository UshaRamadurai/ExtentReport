package org.vapasi.SpreeTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void login(String userEmail, String pwd){

       driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys(userEmail);
        driver.findElement(By.cssSelector("[name='spree_user[password]']")).sendKeys(pwd);
        driver.findElement(By.className("form-check-input")).click();
        driver.findElement(By.cssSelector("[name='commit']")).click();
    }
}
