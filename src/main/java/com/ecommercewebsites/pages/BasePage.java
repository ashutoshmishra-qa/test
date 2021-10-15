package com.ecommercewebsites.pages;


import com.ecommercewebsites.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public String getPageTitle() {
        return Driver.driver.getTitle();
    }

    protected void explicitlyWaitForElementToBeClickable(By by) {
        new WebDriverWait(Driver.driver, Duration.ofSeconds(5))
                .until(d->d.findElement(by).isDisplayed());
    }

    protected void click(By by) {
        explicitlyWaitForElementToBeClickable(by);
        Driver.driver.findElement(by).click();
    }

    protected void sendKeys(By by,String value) {
        explicitlyWaitForElementToBeClickable(by);
        Driver.driver.findElement(by).sendKeys(value, Keys.ENTER);
    }

    protected void sendKey(By by,String value) {
        explicitlyWaitForElementToBeClickable(by);
        Driver.driver.findElement(by).sendKeys(value);
    }

    protected void openNewTab(String url) {
        Driver.driver.switchTo().newWindow(WindowType.TAB);
        Driver.driver.get(url);
    }

    protected String getText(By by) {
       String text = Driver.driver.findElement(by).getText();
       return text;
    }

}
