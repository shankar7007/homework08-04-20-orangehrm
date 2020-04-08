package com.orangehrm.testbase;

import com.orangehrm.browserselector.BrowserSelector;
import com.orangehrm.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends HomePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.orangehrm.com/";

    @BeforeMethod

    public  void  openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterMethod

    public void closeBrowser(){

    }
}
