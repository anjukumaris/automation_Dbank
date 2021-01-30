package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCheckingPage extends PageObject {
    @FindBy(id="Standard Checking")
    WebElement btn_StdCheck;
    @FindBy(id="Interest Checking")
    WebElement btn_InterestCheck;
    @FindBy(id="Individual")
    WebElement btn_individual;
    @FindBy(id="Joint")
    WebElement btn_joint;
    @FindBy(id="name")
    WebElement txt_Name;
    @FindBy(id="openingBalance")
    WebElement txt_openBalance;
    @FindBy(xpath=" //button[text()=' Submit']")
    WebElement btn_submit;


    public NewCheckingPage(WebDriver driver) {
        super(driver);
    }
    public void checkingInfo(String name,String openBalance){
        setCheckBox(btn_StdCheck,true);
        setCheckBox(btn_InterestCheck,false);
        setCheckBox(btn_individual,true);
        setCheckBox(btn_joint,false);
        sendKeys(txt_Name,name);
        sendKeys(txt_openBalance,openBalance);
        click(btn_submit);



    }

}
