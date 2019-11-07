package com.cybertek.tests.day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

       WebElement fullNameInput = driver.findElement(By.name("full_name")); // burda bulacagimiz seyin id veyaa name veaya as oldugunu inspect.ten buluyoruz

        fullNameInput.sendKeys("Mike Smith");

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("naber@gmail.com");

        Thread.sleep(5000);
        WebElement sign=driver.findElement(By.name("wooden_spoon"));
        Thread.sleep(3000);
        sign.click();
        Thread.sleep(2000);

        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String cool = messageElement.getText();
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        if(expectedMessage.equals(cool)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected = " + expectedMessage);
            System.out.println("gercek = " + cool);
        }
        driver.quit();



    }
}
