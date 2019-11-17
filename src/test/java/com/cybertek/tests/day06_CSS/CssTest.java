package com.cybertek.tests.day06_CSS;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClickButton = driver.findElement(By.cssSelector("#disappearing_button")); //[onclick='button6()'] => Bunu da yazabilirdik

        String message = dontClickButton.getText();

        System.out.println("message = " + message);

    }
}
