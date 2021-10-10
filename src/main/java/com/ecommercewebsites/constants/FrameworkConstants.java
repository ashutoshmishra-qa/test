package com.ecommercewebsites.constants;

public class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/executables/chromedriver";
    public static String getChromeDriverPath()  {
        return CHROMEDRIVERPATH;
    }
}
