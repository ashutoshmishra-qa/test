package com.ecommercewebsites.tests;

public final class FrameworkConstants {
    public static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver";

    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
}
