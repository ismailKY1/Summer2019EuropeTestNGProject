package com.cybertek.tests.HOMEWORK;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");

        WebElement searchInput=driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("selenium webdriver");

        WebElement searchButton=driver.findElement(By.cssSelector("[class*='sprite svg-search-icon']"));
        searchButton.click();

        WebElement seleniumSftwr=driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a"));
        seleniumSftwr.click();

        //Verify URL ends with "Selenium_(software)"
        String endsURL = "Selenium_(software)";
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.endsWith(endsURL)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("Current URL = " + currentUrl);
//        Thread.sleep(3000);
//        driver.close();
    }
}



