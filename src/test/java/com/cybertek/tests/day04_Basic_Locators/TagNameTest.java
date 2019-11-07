package com.cybertek.tests.day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        //enter full name
        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Mike Smith With TagName");

        //enter email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@gmail.com");
        WebElement signUpButton = driver.findElement(By.tagName("button"));  //By.Id yada name kullanamiyorsak tagname ile tag.i ekleriz
        signUpButton.click();

        //print the message using tagname locator
        WebElement messageElement= driver.findElement(By.tagName("h3"));
        String message= messageElement.getText();
        System.out.println(message);

        // lazy way
        System.out.println(driver.findElement(By.tagName("h3")).getText()); // yukardaki 3 satir burda tek satirda buna "lazy way" deniyor :)


    }
}
