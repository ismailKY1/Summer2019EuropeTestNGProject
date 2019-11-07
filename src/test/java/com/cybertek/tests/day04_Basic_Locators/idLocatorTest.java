package com.cybertek.tests.day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // sadece bunu run edersek chrome un "data page"ini acar
        driver.manage().window().maximize();  //tum pencereyi kapladi

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));

        dontClickButton.click();

//        WebElement button4 = driver.findElement(By.id("check_button"));
//         button4.click();    bu hata veriyor cunku her seferinde button id degisiyor bu dersi sonra gorecez










    }

}
