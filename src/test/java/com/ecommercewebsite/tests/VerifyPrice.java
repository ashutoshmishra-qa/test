package com.ecommercewebsite.tests;

import com.ecommercewebsites.driver.Driver;
import com.ecommercewebsites.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class VerifyPrice extends BaseTest {

    @Test
    public void test1() {
        FlipkartLandingPage lander = new FlipkartLandingPage();
        Assert.assertEquals(lander.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
        lander.exitPopup()
                .inputSearchTab()
                .clickFirstItem()
                .switchTab();

        FlipkartItemDetailsPage item = new FlipkartItemDetailsPage();
        item.inputPincode()
                .clickCheckPinButton()
                .clickAddToCartButton();

        FlipkartViewCartPage cart = new FlipkartViewCartPage();
        cart.enterQuanity();
        String totalPrice = Driver.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/span[1]")).getText();
        System.out.println("Total Price is " + totalPrice);
    }

    @Test
    public void test2() {
        FlipkartLandingPage lander = new FlipkartLandingPage();
        Assert.assertEquals(lander.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
        lander.exitPopup()
                .inputSearchTab()
                .clickFirstItem()
                .switchTab();

        FlipkartItemDetailsPage item = new FlipkartItemDetailsPage();
        String itemName = item.getItemName();
        String itemPrice = item.getItemPrice();
        System.out.println("Price of " + itemName + " in Flipkart is " + itemPrice);
        item.inputPincode()
                .clickCheckPinButton()
                .clickAddToCartButton();
        AmazonLandingPage sameItem = new AmazonLandingPage();
        sameItem.navigateToAmazon();
        Assert.assertEquals(sameItem.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        sameItem.searchTab(itemName);

        List<WebElement> items = Driver.driver.findElements(By.tagName("h2"));
        for (int i = 1; i <= items.size(); i++) {
            String itemInList = items.get(i).getText().replaceAll("[\\s-(),]", "");
            String itemToFind = itemName.replaceAll("[\\s-(),]", "");
            System.out.println(itemInList);
            System.out.println(itemToFind);

            if (itemInList.equalsIgnoreCase(itemToFind)) {
                String name = items.get(i).getText();
                System.out.println(name);
                Driver.driver.findElement(By.linkText(name)).click();
            }
        }
        sameItem.switchTab();
        AmazonItemDetailsPage i = new AmazonItemDetailsPage();
        String itemPriceAmazon = i.clickAddToCartButton()
                .getCartTotal().toString();

        if ( Integer.parseInt(itemPrice) > Integer.parseInt(itemPriceAmazon) ) {
            System.out.println("Buy this item from Flipkart ");
        }
        System.out.println("Buy this item from Amazon");

    }
}
