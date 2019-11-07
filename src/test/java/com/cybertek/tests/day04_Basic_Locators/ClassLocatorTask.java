package com.cybertek.tests.day04_Basic_Locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homeLink=driver.findElement(By.className("nav-link")); // By.className yazdik cunku Home page linki class katogorisinde, bunu inspect te gorebiliriz
        homeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        System.out.println(driver.findElement(By.className("h3")).getText());



        Thread.sleep(2000);
        driver.quit();


    }
}
