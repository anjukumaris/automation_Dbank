package com.dBank.tests;

import com.dBank.library.BaseClass;
import com.dBank.pages.Registration_FirstPage;
import com.dBank.pages.SignUpPage;
import org.testng.annotations.Test;

public class RegistrationFirstTest extends BaseClass {


//    public LoginTest(WebDriver driver) {
//        super(driver);
//    }

    @Test(priority = 0)
    public void signUpTest(){
        SignUpPage page=new SignUpPage(driver);
        page.registration();
    }
    @Test(priority = 1)
    public void registrationTest(){
        SignUpPage page=new SignUpPage(driver);
        page.registration();
        Registration_FirstPage registration=new Registration_FirstPage(driver);
        registration.registraion_hardCord();
    }


}
