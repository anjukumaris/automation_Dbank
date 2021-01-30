package com.dBank.tests;

import com.dBank.dao.TestDataProvider;
import com.dBank.library.BaseClass;
import com.dBank.library.Utils;
import com.dBank.pages.DigitalCredit_NewApplication;
import com.dBank.pages.Header_Dao;
import com.dBank.pages.LogInPageDao;
import com.dBank.pages.MenuOptions;
import org.testng.annotations.Test;

public class NewApplicationTest extends BaseClass {
    @Test(dataProvider = "logInInfoHomePage", dataProviderClass = TestDataProvider.class)
    public void testNewCheckingDetails(String userName, String password, boolean pass, String spanMessage) {
        LogInPageDao logInPageDao = new LogInPageDao(driver);
        logInPageDao.login_Info_Dao(userName, password, pass, spanMessage);
        //Utils.sleep(5000);
        Header_Dao header_dao = new Header_Dao(driver);
        header_dao.selectMenu(MenuOptions.NEW_APPLICATION);
        DigitalCredit_NewApplication newApplication=new DigitalCredit_NewApplication(driver);
        newApplication.new_Application_Verification("gorge","thomas","345-67-8889","01/01/1990","1234567891","1234567891");
    }
}
