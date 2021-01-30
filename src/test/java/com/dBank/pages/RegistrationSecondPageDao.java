package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationSecondPageDao extends PageObject {
    @FindBy(id="address")
    WebElement txtAddress;
    @FindBy(id="locality")
    WebElement txtLocality;
    @FindBy(id="region")
    WebElement txt_Region;
    @FindBy(id="postalCode")
    WebElement txt_postal;
    @FindBy(id="country")
    WebElement txt_country;
    @FindBy(name="homePhone")
    WebElement txt_homePhone;
    @FindBy(name="mobilePhone")
    WebElement txt_mobilePhone;
    @FindBy(name="workPhone")
    WebElement txt_workPhone;
    @FindBy(name="agree-terms")
    WebElement chk_agreeterms;
    @FindBy(xpath="//button[text()='Register']")
    WebElement lnk_Register;
    public RegistrationSecondPageDao(WebDriver driver) {
        super(driver);
    }
        public void Registration_Second_Dao(String address,String locality,String region,String postal,String country,String homephone,String mobilePhone,String workPhone){
            sendKeys(txtAddress,address);
            sendKeys(txtLocality,locality);
            sendKeys(txt_Region,region);
            sendKeys(txt_postal,postal);
            sendKeys(txt_country,country);
            sendKeys(txt_homePhone,homephone);
            sendKeys(txt_mobilePhone,mobilePhone);
            sendKeys(txt_workPhone,workPhone);
            setCheckBox(chk_agreeterms,true);
            click(lnk_Register);
    }
}
