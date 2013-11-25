package com.nasctech.autotest.utils;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vm
 * Date: 11/22/13
 * Time: 5:40 PM
 */


public class WebDriverFactory {
    private static final String WEBDRIVER_CHROME_DRIVER = "/usr/local/git/bin/chromedriver";

    static {
        System.setProperty("webdriver.chrome.driver", WEBDRIVER_CHROME_DRIVER);
    }

    public static List<WebDriver> getDrivers(String... drivers) throws ClassNotFoundException {
        List<WebDriver> list = new ArrayList<WebDriver>();

        try {
            for (String dr: drivers) {
                WebDriver wb = (WebDriver)Class.forName(dr).newInstance();
                list.add(wb);
            }
        }
        catch (IllegalAccessException e) {
            throw new ClassNotFoundException();
        }
        catch (InstantiationException e) {
            throw new ClassNotFoundException();
        }

        return list;
    }
}