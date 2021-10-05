package com.ecommercewebsite.tests;

import com.ecommercewebsites.tests.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
