package com.cybertek.tests.day01_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigation {
    public static void main(String[] args) {

        //we have to setup webdriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();

        //creating object for using selenium driver
        WebDriver driver= new ChromeDriver();

        //Open the website
        driver.get("https://www.amazon.com");

        //get the title and print it
        System.out.println(driver.getTitle());

    }


}
