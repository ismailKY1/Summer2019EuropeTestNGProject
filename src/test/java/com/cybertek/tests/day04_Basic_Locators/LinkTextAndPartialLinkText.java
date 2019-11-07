package com.cybertek.tests.day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

//        WebElement link3= driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
//        link3.click();

        //lazy way
        driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger")).click();

        // home link
        driver.findElement(By.linkText("Home")).click();  // sayfada Home yazisini bulup tikliyor, inspect koduna gerek kalmadan
    // sayfadaki herhangibir text,i kopyalayip buraya koybiliriz, selenium bunu bulup tiklar



    }
}
