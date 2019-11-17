package com.cybertek.tests.day07_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void Test1(){

    WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton=driver.findElement(By.id("green"));

        // how can we check is button enable or not
        System.out.println("is element enabled " +greenButton.isEnabled());

        //Verify that green button is disbled
        Assert.assertFalse(greenButton.isEnabled(), "Verify that green button is disbled");
        greenButton.click(); //it try that but not complete
    }

    @Test
    public void test2(){

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("http://practice.cybertekschool.com/dynamic_controls");

            WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

            System.out.println("is input enabled: "+ inputBox.isEnabled());

            inputBox.sendKeys("Mike Smith");


    }

}
