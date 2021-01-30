package com.dBank.pages;

import com.dBank.library.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Header_Dao extends PageObject {
    @FindBy(xpath="//div[@id='main-menu']")
    WebElement mbMenuBar;
    String mbMenu="//div[@id='main-menu']";
    String xpMenuItem=".//*[text()='XXX']";

    public Header_Dao(WebDriver driver) {

        super(driver);
    }
    public boolean isDisplayed(){

        return  super.isDisplayed(mbMenuBar);
    }
    public void  selectMenu(String menu){
        List<String>menuItems= Arrays.asList(menu.split("\\|"));
        for(String items:menuItems){
            clickMenu(items);
        }
    }

    private void clickMenu(String items) {
        // WebElement weMenuItem =  findElement(By.xpath(xpMenuBar),By.xpath(xpMenuItem.replace("XXX",item)));
        //        click(weMenuItem);
        WebElement menuItem=findElement(By.xpath(mbMenu),By.xpath(xpMenuItem.replace("XXX",items)));
        click(menuItem);
    }

}

