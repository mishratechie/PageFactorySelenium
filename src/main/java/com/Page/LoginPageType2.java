package com.Page;

import com.Browser.FireFoxDriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ashutosh Mishra
 */
public class LoginPageType2 extends FireFoxDriverClass{

    public LoginPageType2(WebDriver driver){

        this.driver = (FirefoxDriver) driver;

        PageFactory.initElements(driver, this);

    }
    

    @FindBy(id="input_0")
    public static WebElement username;

    @FindBy(id="input_1")
    public static WebElement password;

    @FindBy(id="signin")
    public static WebElement signin;

    public LoginPageType2 someMethod(){

        System.out.println("SomeMethod");
        return this;
    }


}
