package com.ecommercewebsites.pages;

import com.ecommercewebsites.driver.Driver;
import org.openqa.selenium.By;

public class FlipkartItemDetailsPage extends BasePage{

    private final By pinCode = By.id("pincodeInputId");
    private final By checkPinButton = By.xpath("//span[@class='_2P_LDn']");
    private final By addToCartButton =  By.xpath("//button[normalize-space()='ADD TO CART']");
    private final By itemName =  By.xpath("//span[@class='B_NuCI']");
    private final By itemPrice = By.className("_30jeq3");

    public FlipkartItemDetailsPage inputPincode() {
        sendKey(pinCode, "160007");
        return this;
    }

    public FlipkartItemDetailsPage clickCheckPinButton() {
        click(checkPinButton);
        return this;
    }

    public FlipkartItemDetailsPage clickAddToCartButton() {
        click(addToCartButton);
        return this;
    }

    public FlipkartItemDetailsPage getItemName() {
        getText(itemName);
        return this;
    }

    public FlipkartItemDetailsPage getItemPrice() {
        getText(itemName);
        return this;
    }

}