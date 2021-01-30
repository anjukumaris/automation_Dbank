package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {
    @FindBy(xpath="//a[text()=' Sign Up Here']")
    WebElement lnkSignUp;
    public SignUpPage(WebDriver driver){
        super(driver);
    }

    public void registration(){

        click(lnkSignUp);
    }

}
