package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;

public class Registration_FirstPage extends PageObject {
  //  WebDriver driver;
    public Registration_FirstPage(WebDriver driver) {
        super(driver);
    }
    public void registraion_hardCord(){
        RegistrationPage page=new RegistrationPage(driver);
        page.registration_Details("Ms.","Aathi","Sidd",false,true,"12/05/1990","258741065","aathira_Sidhu2@gmail.com","123Qweasd@zxc","123Qweasd@zxc");

    }
}