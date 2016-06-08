package com.Browser;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;
/**
 * Created by Ashutosh Mishra
 */
public class FireFoxDriverClass {



    private static File pathToBinary = new File("C:\\Programs\\Firefox2\\firefox.exe");
    public static FirefoxDriver driver;


    protected  void startBrowser(){

        driver= new FirefoxDriver(new FirefoxBinary(pathToBinary), new FirefoxProfile());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    protected  void  navigateTo(String URL) {
        driver.get(URL);
       // driver.getTitle();
    }


    protected  void closeBrowser(){
        driver.quit();
    }
}

