package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DigitalCredit_NewApplication extends PageObject {
    @FindBy(id="firstName")
    WebElement txt_firstName;
    String value_FirstName=txt_firstName.getAttribute("value");
    @FindBy(name="lastName")
    WebElement txt_lastName;
    String value_LastName=txt_lastName.getAttribute("value");
    @FindBy(name="ssn")
    WebElement txt_ssn;
    String value_ssn=txt_ssn.getAttribute("value");
    @FindBy(name="dob")
    WebElement txt_dob;
    String value_dob=txt_dob.getAttribute("value");
    @FindBy(id="homePhone")
    WebElement txt_homePhone;
    String value_homePhone=txt_homePhone.getAttribute("value");
    @FindBy(id="mobilePhone")
    WebElement txt_mobilePhone;
    String value_mobilePhone=txt_mobilePhone.getAttribute("value");
    public DigitalCredit_NewApplication(WebDriver driver) {
        super(driver);
    }
    public void new_Application_Verification(String firstName,String lastName,String ssn,String dob,String homePhone,String mobilePhone){
        Assert.assertEquals(value_FirstName,firstName,"First Name Not Match ");
        Assert.assertEquals(value_LastName,lastName,"Last Name Not Match ");
        Assert.assertEquals(value_ssn,ssn,"SSN Not Match ");
        Assert.assertEquals(value_dob,dob,"Dob Not Match ");
        Assert.assertEquals(value_homePhone,homePhone,"Home Phone Not Match ");
        Assert.assertEquals(value_mobilePhone,mobilePhone,"MobilePhone Not Match ");


    }
}
