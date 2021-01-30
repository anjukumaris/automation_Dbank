package com.dBank.tests;

import com.dBank.dao.TestDataProvider;
import com.dBank.library.BaseClass;
import com.dBank.library.Utils;
import com.dBank.pages.RegistrationFirstPageDao;
import com.dBank.pages.RegistrationSecondPageDao;
import com.dBank.pages.SignUpPage;
import org.testng.annotations.Test;



public class RegistrationTestDao extends BaseClass {
    @Test(dataProvider = "regInfo",dataProviderClass = TestDataProvider.class)
    public  void validateRegistration_Firstpage(String title_Name,String firstN,String lastN,String dateOfBirth,String socialSecurity,String email,String password,String confirmPassword){
        SignUpPage page=new SignUpPage(driver);
        page.registration();
        RegistrationFirstPageDao registrationFirstPage=new RegistrationFirstPageDao(driver);
        registrationFirstPage.registration_Details_Dao(title_Name, firstN, lastN, dateOfBirth, socialSecurity, email, password, confirmPassword);

    }
    @Test(dataProvider = "regInfoSecond",dataProviderClass = TestDataProvider.class)
    public  void validateRegistration_SecondPage(String title_Name,String firstN,String lastN,String dateOfBirth,String socialSecurity,String email,String password,String confirmPassword,String address,String locality,String region,String postal,String country,String homephone,String mobilePhone,String workPhone) {
        SignUpPage page = new SignUpPage(driver);
        page.registration();
        RegistrationFirstPageDao registrationFirstPage=new RegistrationFirstPageDao(driver);
        registrationFirstPage.registration_Details_Dao(title_Name, firstN, lastN, dateOfBirth, socialSecurity, email, password, confirmPassword);

        RegistrationSecondPageDao registrationPage_secondpage = new RegistrationSecondPageDao(driver);
        registrationPage_secondpage.Registration_Second_Dao(address, locality, region, postal, country, homephone, mobilePhone, workPhone);
        //Ms.", "Aathi", "Sidd", "12/05/1990", "258741369", "aathira_Sidhu@gmail.com", "Qweasdzxc@123", "Qweasdzxc@123", "123Lane","wwwwww","rrrrr","2587413","canada","3698521","9873216","8523697",true}
       Utils.sleep(5000);
    }
}
