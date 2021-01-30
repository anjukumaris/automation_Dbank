package com.dBank.pages;

import com.dBank.library.PageObject;
import com.dBank.library.Utils;
import org.openqa.selenium.WebDriver;

public class RegistrationPage_Second extends PageObject {
    public RegistrationPage_Second(WebDriver driver) {
        super(driver);
    }
    public void second_RegistrationPage(){
        new RegistrationPage_Secondpage(driver).Registration_Second("123Lane","wwwwww","rrrrr","2587413","canada","3698521","9873216","8523697",true);
        Utils.sleep(5000);
    }

}
