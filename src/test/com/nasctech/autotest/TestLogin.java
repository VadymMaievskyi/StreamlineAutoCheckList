package com.nasctech.autotest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import com.nasctech.autotest.utils.WebDriverFactory;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: vm
 * Date: 11/22/13
 * Time: 5:40 PM
 */

public class TestLogin {
    List<WebDriver> wbList;

    @Before
    public void initialize() {
        try {
            wbList = WebDriverFactory.getDrivers(FirefoxDriver.class.getName(),
                                                 ChromeDriver.class.getName());
        }
        catch (ClassNotFoundException e) {
            fail("Wrong Web Driver Class");
        }
    }

    @Test
    public void theUserShouldLoginWithProperLoginPass() {
        for (int i = 0; i < wbList.size(); i++) {
            WebDriver wb = wbList.get(i);

            wb.navigate().to("http://vps-load-1.nasc.ukr");
            assertTrue(wb.getCurrentUrl().contains("vps-load-1.nasc.ukr") && wb.getCurrentUrl().contains("users/sign_in"));

            wb.close();
        }
    }
}