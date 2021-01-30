package com.dBank.dao;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "regInfo")
    public Object[][] getRegInfo() {
        return new Object[][]{
                {"Ms.", "Aathi", "Sidd","12/05/1990", "258741369", "aathira_Sidhu@gmail.com", "Qweasdzxc@123", "Qweasdzxc@123"}
        };

    }

    @DataProvider(name = "regInfoSecond")
    public Object[][] getRegInfoSecond() {
        return new Object[][]{
                {"Ms.", "Aathi", "Sidd","12/05/1990", "123987564", "aathira_Sidhu11@gmail.com", "Qweasdzxc@123", "Qweasdzxc@123", "123Lane","wwwwww","rrrrr","2587413","canada","3698521","9873216","8523697"}
        };
    }
    @DataProvider(name="logInInfo")
    public Object[][] getLogInfo(){
        return new Object[][]{
                {"aathira_Sidhu11@gmail.com","Qweasdzxc@123",true,""},
                {"aathira","aqwedrfwqw",false,"Error Invalid credentials or access not granted.\n" +
                        "×"}

        };
    }
    @DataProvider(name="logInInfoHomePage")
        public Object[][] getLogInHome(){
            return  new Object[][]{
           // {"aathira_Sidhu11@gmail.com","Qweasdzxc@123",true,""},
                    {"gorgethomas@gmail.com","Gorgenisupera.1234",true,""},



        };
        }


}





