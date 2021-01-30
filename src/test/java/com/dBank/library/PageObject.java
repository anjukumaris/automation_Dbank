package com.dBank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject  {
   protected WebDriver driver;
    protected final long TIME_OUT=5;
    public PageObject(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    protected WebElement findElement(By by,long timeOutSec){
        WebDriverWait wait=new WebDriverWait(driver,timeOutSec);
       return  wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    protected WebElement findElement(By by){
        return findElement(by,TIME_OUT);
    }
    protected WebElement findElement(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,TIME_OUT);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected WebElement findElement(WebElement element,long timeOutSec){
        WebDriverWait wait=new WebDriverWait(driver,timeOutSec);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected WebElement findElement(By parent, By child){

        return findElement(parent, child,TIME_OUT);
    }
    protected  WebElement findElement(By parent,By child,long timeOutSec){
        WebElement weParent = findElement(parent,timeOutSec);
        return weParent.findElement(child);

    }
    protected void click(WebElement element){

        findElement(element,TIME_OUT).click();
    }
    protected void click(WebElement element,long timeOutSec){

        click(element,timeOutSec);
    }
    protected void selectFromList(WebElement element,String visibleText,long timeOutSec){
        element=findElement(element,timeOutSec);
        Select select=new Select(element);
        select.selectByVisibleText(visibleText);
    }
    protected  void selectFromList(WebElement element,String visibleText){
        selectFromList(element,visibleText,TIME_OUT);
    }
    protected void setCheckBox(WebElement element,boolean check,long timeOutSec){
        element=findElement(element,timeOutSec);
        if((!check && element.isSelected())||(check && !(element.isSelected())))
            element.click();
    }
    protected void setCheckBox(WebElement element,boolean check){
        setCheckBox(element,check,TIME_OUT);
    }
    protected void sendKeys(WebElement element,String keys,long timeOutSec){
        findElement(element,timeOutSec).sendKeys(keys);
    }
    protected  void sendKeys(WebElement element,String keys){
        sendKeys(element,keys,TIME_OUT);
    }

    protected boolean isDisplayed(WebElement element){
        try {
            findElement(element,TIME_OUT);
            return  true;
        }catch(Exception e){

            return false;
        }

    }
    protected  String getText(WebElement element){
        return findElement(element,TIME_OUT).getText();
    }

}
