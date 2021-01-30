package com.dBank.pages;

import com.dBank.library.PageObject;
import com.dBank.library.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ViewCheckingPage extends PageObject {
    @FindBy(xpath="//div[@class='card']")
    WebElement grid_Trancaction;
    @FindBy(xpath="//input[@value='16915']//following-sibling::span[@class='switch-handle']")
    WebElement btn_DataAmmu;
    @FindBy(xpath="//input[@value='16918']//following-sibling::span[@class='switch-handle']")
    WebElement btn_DataAppu;
    @FindBy(xpath = "//input[@type='search']")
    WebElement txt_Search;
    @FindBy(xpath="//select[@name='transactionTable_length']")
    WebElement drp_NoOfTranscation;
    @FindBy(xpath="//div/small[text()='Account Number: 486132930']")
    WebElement accountNo_Ammu;
    @FindBy(xpath = "//div/small[text()='Account Number: 486132931']")
    WebElement accountNo_Appu;

    public ViewCheckingPage(WebDriver driver) {

        super(driver);
    }
    public  void details_Transcation(String accountNo,String search){
        if(accountNo_Ammu.getText().contains(accountNo)){
            click(btn_DataAmmu);
            Assert.assertTrue(isDisplayed(grid_Trancaction),"Transaction Table not found");
            //Utils.sleep(5000);
            sendKeys(txt_Search,search);
            Assert.assertTrue(isDisplayed(grid_Trancaction),"Transaction Table not found");
        }

    }
}
