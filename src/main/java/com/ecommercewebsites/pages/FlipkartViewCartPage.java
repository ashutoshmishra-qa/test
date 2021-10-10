package com.ecommercewebsites.pages;

import org.openqa.selenium.By;

public class FlipkartViewCartPage extends BasePage{

    private final By plusSignButton = By.xpath("//button[normalize-space()='+']");

    public FlipkartViewCartPage clickPlusSignButton() {
        click(plusSignButton);
        return this;
    }
}
