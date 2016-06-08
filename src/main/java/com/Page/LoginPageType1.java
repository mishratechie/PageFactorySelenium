package com.Page;

import com.Browser.FireFoxDriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ashutosh Mishra
 */
public class LoginPageType1{


    @FindBy(id="UsernameID")
    public static WebElement username;

    @FindBy(id="PasswordID")
    public static WebElement password;

    
    @FindBy(id="signin")
    public static WebElement signin;


}
