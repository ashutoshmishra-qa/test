package com.ecommercewebsite.tests;
import com.ecommercewebsites.driver.Driver;
import com.ecommercewebsites.pages.FlipkartLandingPage;
import com.ecommercewebsites.pages.FlipkartItemDetailsPage;
import com.ecommercewebsites.pages.FlipkartViewCartPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        cart.clickPlusSignButton();
        String totalPrice = Driver.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/span[1]/div[1]/div[1]/span[1]")).getText();
        System.out.println("Total Price is" + totalPrice);
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
        String tvName = Driver.driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
        String tvPrice = Driver.driver.findElement(By.className("_30jeq3")).getText();
        System.out.println("Price of " + tvName + " is " + tvPrice);
        item.inputPincode()
                .clickCheckPinButton()
                .clickAddToCartButton();
    }
}