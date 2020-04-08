package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By contactBtn = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')] ");
    By free30daytrialBtn = By.xpath("//a[contains(@class,'btn-orange trial-btn pulse')] ");

    public  void clickOnContactBtn(){
        clickOnElement(contactBtn );


    }
    public void clickOnFree30dayTrialBtn(){
        clickOnElement(free30daytrialBtn);
    }
}
