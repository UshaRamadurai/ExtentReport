package org.vapasi.SpreeTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void categorySelect(){
        driver.findElement(By.linkText("Bags")).click();
        driver.findElement(By.cssSelector("[title='Ruby on Rails Tote']")).click();
    }
}
