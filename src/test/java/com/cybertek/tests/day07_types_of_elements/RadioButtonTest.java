package com.cybertek.tests.day07_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void radioButton(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueButton = driver.findElement(By.id("blue"));
        WebElement redButton = driver.findElement(By.id("red"));

        //how to check radio button selected or not ?\

        System.out.println("Is blue selected "+blueButton.isSelected());
        System.out.println("Is red selected "+redButton.isSelected());

        //verify that bblue radio button selected
        Assert.assertTrue(blueButton.isSelected(), "Verify that blue is seleceted");
        Assert.assertFalse(redButton.isSelected(), "Verify that red is not seleceted");

        //how select radio button ?
        redButton.click();
        System.out.println("Is blue selected "+blueButton.isSelected());
        System.out.println("Is red selected "+redButton.isSelected());

        //verify blue is not selected
        Assert.assertFalse(blueButton.isSelected(), "Verify that blue is not seleceted");
        //verify re is selected
        Assert.assertTrue(redButton.isSelected(), "Verify that red is seleceted");

        //driver.quit();

    }


}
