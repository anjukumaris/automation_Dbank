package com.dBank.library;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {
    protected WebDriver driver;
    protected String baseUrl = "http://dbankdemo.com/";
    protected String browser;

    @BeforeSuite
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
       // WebDriverManager.firefoxdriver().setup();
    }

   // @Parameters({"browser"})
    @BeforeMethod()
    public void beforeMethod() {
       // this.browser = browser;
       // System.out.println("Browser::" + browser);
        getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


    private void getDriver() {
        if (browser == null) {
            browser = "chrome";
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    driver = new ChromeDriver();
                    break;
            }
          //  driver=new ChromeDriver();
                //driver=new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);
        }
    }
}


//       driver=new ChromeDriver();
//        //driver=new FirefoxDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get(baseUrl);
//    }
////
//}
