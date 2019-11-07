package com.cybertek.tests.day03_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {
    public static void main(String[] args) {
        /**
         *
         * bu araya istedigin notu al
         * bunu ekranin heryeriinde yapabilirsin
         *
         * Verify URL not changed
         * open browser (chrome)
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * click on Retrieve password
         * verify that url did not change
         *
         */


        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password links
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save url to string variable
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement  --> class that represents elements on the webpage
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit")); //bunu nerden bulduk, sayfaya  gittik sag tik inpect ve paSSWORD BOLUMUNU BULUP KOPYALA YAPISTIR YAPTIK

        retrievePasswordButton.click();

        //save url after clicking button
        String actualUrl = driver.getCurrentUrl();

        //verify that url is not change
        if (expectedUrl.equals(actualUrl)){
            System.out.print("PASS");
        }else {
            System.out.print("Fail");

        }

        driver.quit();


    }


}
