package com.Test;

import com.Browser.FireFoxDriverClass;
import com.Page.LoginPageType1;
import com.Page.LoginPageType2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by amishra4 on 6/3/2016.
 */
public class MyTestType2 extends FireFoxDriverClass {

    @BeforeTest
    public void setup(){

        startBrowser();

    }


    @Test
    public void Login(){


        navigateTo("Your URL");

        LoginPageType2 loginPageType2= new LoginPageType2(driver);
        loginPageType2.username.sendKeys("someValue");
        loginPageType2.someMethod();

        // Use PageObject to execute action.


    }

    @AfterTest
    public void tearDown(){

        closeBrowser();
    }




}
