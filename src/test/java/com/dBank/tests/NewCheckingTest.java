package com.dBank.tests;

import com.dBank.dao.TestDataProvider;
import com.dBank.library.BaseClass;
import com.dBank.library.Utils;
import com.dBank.pages.Header_Dao;
import com.dBank.pages.LogInPageDao;
import com.dBank.pages.MenuOptions;
import com.dBank.pages.NewCheckingPage;
import org.testng.annotations.Test;

public class NewCheckingTest extends BaseClass {
    @Test(dataProvider = "logInInfoHomePage",dataProviderClass = TestDataProvider.class)
    public void testNewCheckingDetails(String userName,String password,boolean pass,String spanMessage){
        LogInPageDao logInPageDao=new LogInPageDao(driver);
        logInPageDao.login_Info_Dao(userName, password, pass, spanMessage);
        Utils.sleep(5000);
        Header_Dao header_dao=new Header_Dao(driver);
        header_dao.selectMenu(MenuOptions.CHECKING_NEWCHECKING);
        NewCheckingPage newCheckingPage=new NewCheckingPage(driver);

        newCheckingPage.checkingInfo("AATHIRA","25000");
      //  newCheckingPage.checkingInfo("qqqq","80000");



    }
}
