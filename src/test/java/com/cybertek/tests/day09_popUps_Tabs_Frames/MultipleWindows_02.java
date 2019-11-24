package com.cybertek.tests.day09_popUps_Tabs_Frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows_02 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void switchWindowsTest() {
        driver.get("http://practice.cybertekschool.com/windows");

        System.out.println("Before clicking the link " + driver.getTitle());

        //clicking click here link
        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("After clicking the link " + driver.getTitle());

        //code for switching windows , we have to pass handle.
        //driver.switchTo().window()

        String currentWindowHandle = driver.getWindowHandle(); // driver.getWindowHandle (String) olanini sececez
        System.out.println("currentWindowHandle = " + currentWindowHandle);

        //after this line, our purpose is switching to new window

        //Set is just like arraylist but without duplicate values
        Set<String> windowHandles = driver.getWindowHandles(); // .getWindowHandle burda ise (set String) olani sececez
        //how many different handles it is keeping
        System.out.println(windowHandles.size());

        //our problem is how can we get new window handle from set of handles.There is no index.
        //loop through all handles inside the Set of handles
        for (String handle : windowHandles) {
            //checking handle is not equal to current page
            if (!currentWindowHandle.equals(handle)) {
                //switching to new window
                driver.switchTo().window(handle);
            }
        }
        System.out.println("After switching " + driver.getTitle());

        /* bir sayfadan yeni acilan baska bir sayfa/sekmede islem yapmak istiyorsak eger once yeni sayfaninin "handle"ni bulmamiz lazim
        Handle o sayfaya ait bir kod gibi birsey "CDwindow-E4F37D97B870C4B2F3B8E879D8660B0D" bunun gibi.
        once driver.getWindowHandle (String) olanini secerek suan islem yaptigimiz sayfanin handle.ni buluyoruz
        sonra   Set<String> windowHandles = driver.getWindowHandles(); (set String) olani secerek tum handle.lari yani yeni acilan sayfanin ve simdiki sayfanin buluyoruz
        for loop ve if kullanarak diger handle buluyoruz
         */
    }
        @Test
        public void moreThan2Windows(){
            driver.get("http://practice.cybertekschool.com/windows");

            String targetWindowTitle = "New Window";
            driver.findElement(By.linkText("Click Here")).click();

            //check how many windows we have
            System.out.println(driver.getWindowHandles().size());

            Set<String> windowHandles= driver.getWindowHandles();

            //we will keep switching windows until our title equals to targetWindowTitle.

            for (String handle : windowHandles) {
                //switch them one by one
                driver.switchTo().window(handle);
                //checking if the window title equals to my target window title
                if(driver.getTitle().equals(targetWindowTitle)){
                    //if they are equal stop looping.I want to keep that window driver.
                    break;
                }
            }
            System.out.println("After loop title is : "+driver.getTitle());
        }
/*
burda yeni sayfanin handle.ni title ile bulduk
 */
    }


