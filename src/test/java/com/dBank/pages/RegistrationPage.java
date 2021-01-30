package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends PageObject {
    @FindBy(name="title")
    WebElement drp_Title;
    @FindBy(xpath="//input[@id='firstName']")
    WebElement txt_FirstName;
    @FindBy(id="lastName")
    WebElement txt_LastName;
    @FindBy(xpath="//label[@class='form-check-label']/input[@id='gender' and  @value='M']")
    WebElement chk_GenderMale;
    @FindBy(xpath="//label[@class='form-check-label']/input[@id='gender' and  @value='F']")
    WebElement chk_GenderFemale;
    @FindBy(id="dob")
    WebElement txtDob;
    @FindBy(id="ssn")
    WebElement txtSSN;
    @FindBy(id="emailAddress")
    WebElement txtEmail;
    @FindBy(id="password")
    WebElement txtPassword;
    @FindBy(id="confirmPassword")
    WebElement txtCnfm_Password;
    @FindBy(xpath="//button[text()='Next']")
    WebElement btn_Next;




    public RegistrationPage(WebDriver driver) {

        super(driver);
    }
    public void registration_Details(String title_Name,String firstN,String lastN,boolean check_Male,boolean check_Female,String dateOfBirth,String socialSecurity,String email,String password,String confirmPassword){
        selectFromList(drp_Title,title_Name);
        sendKeys(txt_FirstName,firstN);
        sendKeys(txt_LastName,lastN);
        setCheckBox(chk_GenderMale,check_Male);
        setCheckBox(chk_GenderFemale,check_Female);
        sendKeys(txtDob,dateOfBirth);
        sendKeys(txtSSN,socialSecurity);
        sendKeys(txtEmail,email);
        sendKeys(txtPassword,password);
        sendKeys(txtCnfm_Password,confirmPassword);
        click(btn_Next);



    }




}
