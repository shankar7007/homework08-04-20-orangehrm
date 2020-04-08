package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase  extends TestBase {

    HomePage homePage = new HomePage();

    @Test

    public  void userShouldClickOnContactBtn(){
        homePage.clickOnContactBtn();
    }
    @Test
    public  void userShouldClickOnfree30daytrialBtn(){
        homePage.clickOnFree30dayTrialBtn();
    }
}
