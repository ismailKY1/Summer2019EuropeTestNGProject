package com.cybertek.tests.day09_popUps_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts_01 {

    WebDriver driver;  // bu sekilde driver.i tum methodlar icinde kullanabiliriz, we have to declare all method


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
    public void Test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //locating and clicking destroy button
        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();

        //location No button and clicking
        driver.findElement(By.xpath("//*[text()='No']")).click();
        //driver.findElement(By.xpath("//*[text()='Yes']")).click();   //locating Yes button and clicking
    }
    @Test
    public void Alert() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        // clicking for JS Alert
        driver.findElement(By.xpath("//button[1]")).click(); // bunu tiklayinca bir popup(alert) cikiyor, ama bu popup.a sag tik inspect yapamiyoruz

        //Alert yani inspect olmayan PopUp nasil tiklanir // Controling alert
        Alert alert = driver.switchTo().alert();

        // 4 cesit alert var = alert has 4 different method to deal with alert popups
        // accept (Yes-Ok), dismiss(No-Cancel), sendKeys, getText(uzerinde yazan text getirir)
        alert.accept(); //Yes-Ok butonuna basar
        Thread.sleep(3000);

        //clicking JS Confirm
        driver.findElement(By.xpath("//button[2]")).click();
        alert.dismiss();
        Thread.sleep(3000);

        //clicking JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("Mike Smith");
        Thread.sleep(2000);
        alert.accept();



    }






}
