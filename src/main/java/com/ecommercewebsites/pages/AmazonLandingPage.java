package com.ecommercewebsites.pages;


import org.openqa.selenium.By;


public class AmazonLandingPage extends BasePage{
    private final By searchTab = By.id("twotabsearchtextbox");
    private final By firstItem = By.id("tbd");

    public String getTitle(){
        return getPageTitle();
    }

    public AmazonLandingPage inputSearchTab() {
        sendKeys(searchTab, "VU tv");
        return this;
    }
}
