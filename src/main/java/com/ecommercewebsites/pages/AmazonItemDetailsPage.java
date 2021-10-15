package com.ecommercewebsites.pages;

import org.openqa.selenium.By;

public class AmazonItemDetailsPage extends BasePage{

    private final By addToCartButton =  By.id("add-to-cart-button");
    private final By cartTotal =  By.id("attach-accessory-cart-subtotal");

    public AmazonItemDetailsPage clickAddToCartButton() {
        click(addToCartButton);
        return this;
    }

    public AmazonItemDetailsPage getCartTotal() {
        getText(cartTotal);
        return this;
    }

}
