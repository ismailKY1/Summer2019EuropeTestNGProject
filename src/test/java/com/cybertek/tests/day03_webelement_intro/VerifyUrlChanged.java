package com.cybertek.tests.day03_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {
    public static void main(String[] args) {
        /**
         * Verify URL changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         */

        //open the chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password links
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any e-mail
        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys() -->
        emailInput.sendKeys("email@gmail.com");

        //locate to password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        //click button
        retrievePasswordButton.click();
        // yukardaki iki satiri kisa yolla yapabiliriz = driver.findElement(By.id("form_submit")).click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();
        //verify that url changed to http://practice.cybertekschool.com/email_sent
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }
        //close
        driver.quit();



    }
}
