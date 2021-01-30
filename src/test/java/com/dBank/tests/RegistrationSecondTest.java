package com.dBank.tests;

import com.dBank.library.BaseClass;
import com.dBank.pages.Registration_FirstPage;
import com.dBank.pages.RegistrationPage_Second;
import com.dBank.pages.SignUpPage;
import org.testng.annotations.Test;

public class RegistrationSecondTest extends BaseClass {
    @Test
    public void second_RegistrationTest(){
        SignUpPage page=new SignUpPage(driver);
        page.registration();
        Registration_FirstPage registration=new Registration_FirstPage(driver);
        registration.registraion_hardCord();
        RegistrationPage_Second registrationPage_second=new RegistrationPage_Second(driver);
        registrationPage_second.second_RegistrationPage();
    }

}
