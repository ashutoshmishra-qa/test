package com.ecommercewebsites.pages;

import org.openqa.selenium.By;

public class FlipkartViewCartPage extends BasePage{

    private final By quantity = By.xpath("//input[@class='_253qQJ']");

    public FlipkartViewCartPage enterQuanity() {
        sendKey(quantity, "2");
        return this;
    }
}
