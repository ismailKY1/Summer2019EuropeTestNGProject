package com.cybertek.tests.day01_basic_navigation;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tekrar4 {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

       // WebDriverManager.chromedriver().setup();
        driver.get("http://www.google.com");
    }
}
