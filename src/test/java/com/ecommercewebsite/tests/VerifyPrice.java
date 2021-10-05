package com.ecommercewebsite.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Iterator;
import java.util.Set;

public class VerifyPrice extends BaseTest{

    @Test
    public void test1()  throws InterruptedException {
        driver.get("https://www.flipkart.com/");
// add escape key
        driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.name("q")).sendKeys("VU tv", Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.className("col-7-12")).click();
        Thread.sleep(5000);
        String mainwindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!mainwindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Thread.sleep(5000);
        String tvName= driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
        String tvPrice = driver.findElement(By.className("_30jeq3")).getText();
        Thread.sleep(10000);
        driver.findElement(By.id("pincodeInputId")).sendKeys("140307");
        driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[normalize-space()='+']")).click();
        Thread.sleep(5000);

        String totalPrice = driver.findElement(By.className("_24KATy")).getText();
        System.out.println("The Price of "+ tvName +"is "+ tvPrice);
    }

}
