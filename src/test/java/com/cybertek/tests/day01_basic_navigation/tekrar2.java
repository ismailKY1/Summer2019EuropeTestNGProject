package com.cybertek.tests.day01_basic_navigation;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class tekrar2 {
    public static void main(String[] args){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");
        System.out.println("current url is : " + (driver.getCurrentUrl()));

        System.out.println(driver.getPageSource()); //tum incele sayfasini getiriyor

        System.out.println(driver.getTitle());


    }

}
