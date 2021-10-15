package com.ecommercewebsites.pages;

import com.ecommercewebsites.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public final class FlipkartLandingPage extends BasePage {

    private final By searchTab = By.name("q");
    private final By firstItem = By.className("col-7-12");


    public String getTitle(){
        return getPageTitle();
    }

    public FlipkartLandingPage exitPopup() {
        Driver.driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
        return this;
    }

    public FlipkartLandingPage inputSearchTab() {
        sendKeys(searchTab, "Iphone 11");
        return this;
    }

    public FlipkartLandingPage clickFirstItem() {
        click(firstItem);
        return this;
    }

    public FlipkartLandingPage switchTab () {
        String mainwindow = Driver.driver.getWindowHandle();
        for (String windowHandle : Driver.driver.getWindowHandles()) {
            if (!mainwindow.contentEquals(windowHandle)) {
                Driver.driver.switchTo().window(windowHandle);
                break;
            }
        }
        return this;
    }
}
