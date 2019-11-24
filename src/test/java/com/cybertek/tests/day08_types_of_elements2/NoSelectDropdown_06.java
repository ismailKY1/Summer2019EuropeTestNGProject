package com.cybertek.tests.day08_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown_06 {
    /*
    Select class -->unique selenium class to handle dropdown easily.
Select tag --> html tag for creating dropdowns.
NO SELECT DROPDOWN
When we try to use Select class with the dropdown which doesnt have select tag, we got
UnexpectedTagNameException: Element should have been "select" but was "a"
If we dont have select tag, we locate dropdown just like any other element and to see options we click/hover over to it.
To get all the options from dropdown, we can use common locator between them (exp: classname, tagname etc.) then we can use List methods to get the size and expected option from the list.
we use click() method to click different options. we can either locate the option seperately or use index of the option from the list.
     */
    @Test
    public void Test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropDownElement = driver.findElement(By.id("dropdownMenuLink"));
        dropDownElement.click();

        List<WebElement> listOfLinks = driver.findElements(By.className("dropdown-item")); //burada  driver.findElements secerken list.Webelement olanini seciyoruz
        System.out.println("number of links "+listOfLinks.size());

        for (WebElement list : listOfLinks) {    // listedekilerin hepsini yazdirdik Google,Amazon,Yahoo,Facebook,Etsy
            System.out.println(list.getText());
        }

        System.out.println("Listede ilk siradaki= "+ listOfLinks.get(0).getText()); // ilk siradakini yazdirdik "Google"
        //listOfLinks.get(0).click(); //google tikladik 0'dan baslayarak ustten siralam yapilir 1=Amazon 2=Yahoo vs...
        //herhangi birini tiklamanin baska yolu =
        driver.findElement(By.linkText("Yahoo")).click(); //Yahoo.yu tikladik

    }
}


/* JAMAL'IN KODU
 @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));
        //open the dropdown
        dropdownElement.click();
         List<WebElement> listofLinks = driver.findElements(By.className("dropdown-item"));
        //size of the list
        System.out.println("Number of links "+listofLinks.size());
        //text of first element in the list
        System.out.println(listofLinks.get(0).getText());
        //print text of each link
        for (WebElement link : listofLinks) {
            System.out.println(link.getText());
        }
        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();
        //index of the list and click
        listofLinks.get(3).click();
    }
 */