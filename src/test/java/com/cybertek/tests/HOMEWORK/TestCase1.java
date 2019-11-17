package com.cybertek.tests.HOMEWORK;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.co.uk/");

        WebElement search = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
        search.sendKeys("selenium");

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

        String result = driver.findElement(By.xpath("//*[@id=\"cbelm\"]/div[3]/h1/span[1]")).getText();
        System.out.println(result);
        System.out.println("Number of result: " + result.substring(0, result.indexOf(" ")));
    }
}

