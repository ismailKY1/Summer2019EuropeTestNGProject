package com.cybertek.tests.day01_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tekrar1 {

    public static void main(String[] args) throws InterruptedException {
        // chrome , firefox , openga , safari , yandex
        //   WebDriverManager.chromedriver().setup();  // calsicagim web browser sectim
        //creating object for using selenium driver...
//        WebDriver ismail = new ChromeDriver();
//
//        ismail.get("https://www.mit.gov.tr");  // ismail.get();
//                                      //sayfa fulll yuklenene kadar bekliyor
//        Thread.sleep(3000);
//
//        ismail.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        ismail.quit();
        WebDriverManager.firefoxdriver().setup();
        WebDriver atu = new FirefoxDriver();
        atu.navigate().to("https://www.google.com");  // refresh , back , forward
        //sayfa full yuklenmesini beklemz
        Thread.sleep(2000);
        atu.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        atu.navigate().back();
        atu.manage().window().maximize();
        Thread.sleep(2000);
        atu.navigate().refresh();
        atu.navigate().forward();
        atu.close();
        atu.quit();

    }


}
