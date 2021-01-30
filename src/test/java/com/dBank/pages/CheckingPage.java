package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingPage extends PageObject {
    @FindBy(xpath="//button[@class='btn btn-primary']")
    WebElement btnContinue;
    public CheckingPage(WebDriver driver) {
        super(driver);
    }
    public void viewCheckingDetails(){

        click(btnContinue);
    }
}
