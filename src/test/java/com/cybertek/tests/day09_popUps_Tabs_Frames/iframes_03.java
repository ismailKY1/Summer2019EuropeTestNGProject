package com.cybertek.tests.day09_popUps_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes_03 {
    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethop() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void Test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        // driver.findElement(By.id("tinymce")).sendKeys("Test Text");
        //bu calismadi cunku nested HTML var, yani inspect yapinca kodlarda iki tane HTML goruyoruz.
        //normalde bir tane olur, buna iframe denir (nested HTML, baby HTML), selenium bunu bazen calistiramaz, nasil yapariz
        //location.u bulmak icin inspect arama yerine //iframe yazarsak cikar
        //HOW TO SWITCH FRAMES
        driver.switchTo().frame("mce_0_ifr");
        //clear text, once icinde yazani silebiliriz
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("HELLO WORLD");

        //go back to first frame, useful when we have switched multiple frames, onceki durumuna dondurme
        driver.switchTo().defaultContent();

        //2.Using Index
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("Naber Kocumm");
        //go back to first frame , only to parent
        driver.switchTo().parentFrame();

        //3 Using WEBWLEMENT
        // locating iframe with any valid locator
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        Thread.sleep(3000);
        //passing farame as a webelement
        driver.switchTo().frame(frameElement);
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("We Located with WebElement");

    }
    @Test
    public void multipleFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");

        //switching to frame top
        driver.switchTo().frame("frame-top");
        //frame top has 3 childen frame , left middle and right
        //switching to middle frame
        driver.switchTo().frame("frame-middle");
        //get the middle text and print it
        System.out.println(driver.findElement(By.id("content")).getText());
        //go back to parent (top frame) to switch right
        driver.switchTo().parentFrame();
        //switching right using index
        driver.switchTo().frame(2);
        //print right from right frame
        System.out.println(driver.findElement(By.tagName("body")).getText());
        //go up to top level html directly
        driver.switchTo().defaultContent();
        //switch to frame bottom
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());
    }



        /*
        Alt framelere girmek icin sirayla gitmek lazim yani direk frame-middle a giremeyiz once frame-top a sonra ona
        ayni sekilde frame-middle.dan frqme-right a gecmek icin once parentframe.a ordan frame-right.a gitmek gerekir
         */
    }

