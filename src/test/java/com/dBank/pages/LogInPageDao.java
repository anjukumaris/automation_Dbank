package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageDao extends PageObject {
    @FindBy(id="username")
    WebElement txt_userName;
    @FindBy(id="password")
    WebElement txt_password;
    @FindBy(id="submit")
    WebElement btn_submit;
    @FindBy(xpath="//div[@class='sufee-alert alert with-close alert-danger alert-dismissible fade show']")
    WebElement span_Message;
    @FindBy(xpath="//a[@class=\'navbar-brand\']")
    WebElement txtDigitalBank;
    @FindBy(xpath="//div[@class='sufee-alert alert with-close alert-danger alert-dismissible fade show']")
    WebElement lblError;

    public LogInPageDao(WebDriver driver) {
        super(driver);
    }
        public void login_Info_Dao(String userName,String password,boolean pass,String spanMessage){
            sendKeys(txt_userName,userName);
            sendKeys(txt_password,password);
            click(btn_submit);
            if(pass){
                Header_Dao header_dao=new Header_Dao(driver);
                //Assert.assertTrue();
                Assert.assertTrue(header_dao.isDisplayed(),"Login failed");
            }
            else{
                Assert.assertTrue(isDisplayed(lblError),"Alert Message");
                Assert.assertEquals(getText(lblError),spanMessage,"Invalid Error Message");
            }

         }
    }

