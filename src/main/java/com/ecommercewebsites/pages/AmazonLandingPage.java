package com.ecommercewebsites.pages;


import com.ecommercewebsites.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class AmazonLandingPage extends BasePage{

    private final By searchTab = By.id("twotabsearchtextbox");
    private final By items = By.xpath("//*[@class='a-link-normal']");

    public AmazonLandingPage navigateToAmazon () {
        openNewTab("https://www.amazon.in/");
        return this;
    }

    public String getTitle(){
        return getPageTitle();
    }

    public AmazonLandingPage searchTab(String item) {
        sendKeys(searchTab, item);
        return this;
    }

    public AmazonLandingPage switchTab () {
        String mainwindow = Driver.driver.getWindowHandle();
        for (String windowHandle : Driver.driver.getWindowHandles()) {
            if (!mainwindow.contentEquals(windowHandle)) {
                Driver.driver.switchTo().window(windowHandle);
                break;
            }
        }
        return this;
    }
    //public AmazonLandingPage itemList() {
        //List<WebElement> items = Driver.driver.findElements(By.xpath("//*[@class='a-link-normal']"));
    //}
}
