package com.cybertek.tests.day05_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement signUPButton =driver.findElement(By.xpath("/button[text()='Sign Up']"));
        signUPButton.click();



    }
}
