package com.Test;

import com.Browser.FireFoxDriverClass;
import com.Page.LoginPageType1;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by amishra4 on 6/3/2016.
 */
public class MyTestType1 extends FireFoxDriverClass {

    @BeforeTest
    public void setup(){

        startBrowser();
    }

    @Test
    public void Login(){

        navigateTo("Your URL");

        LoginPageType1 loginPageType1 = PageFactory.initElements(driver, LoginPageType1.class);

        LoginPageType1.username.sendKeys("YourUserName");

    }

    @AfterTest
    public void tearDown(){

        closeBrowser();
    }

}
