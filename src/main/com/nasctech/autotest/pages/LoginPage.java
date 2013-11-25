/**
 * Created with IntelliJ IDEA.
 * User: vm
 * Date: 11/25/13
 * Time: 5:31 PM
 */

package com.nasctech.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(id = "user_login")
    WebElement loginField;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(id = "user_submit")
    WebElement submitButton;
}