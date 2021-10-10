package com.ecommercewebsites.driver;

import com.ecommercewebsites.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;
    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage()
                .window()
                .maximize();
    }

    public static void quitDriver() {
        driver.quit();
    }
}
