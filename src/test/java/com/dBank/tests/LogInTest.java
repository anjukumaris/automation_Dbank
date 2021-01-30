package com.dBank.tests;

import com.dBank.dao.TestDataProvider;
import com.dBank.library.BaseClass;

import com.dBank.pages.LogInPageDao;
import org.testng.annotations.Test;

public class LogInTest extends BaseClass {
    @Test(dataProvider = "logInInfo",dataProviderClass = TestDataProvider.class)
    public  void validateLoginSenario(String userName,String password,boolean pass,String spanMessage){
        LogInPageDao logInPageDao=new LogInPageDao(driver);
        logInPageDao.login_Info_Dao(userName, password, pass, spanMessage);

    }
}
