package com.cybertek.tests.day07_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

   @Test
    public void test1(){
       System.out.println("First Assertion");
       Assert.assertEquals(1,1);

       System.out.println("Second Assertion");
       Assert.assertEquals("title", "title","Eguals or Not");

       System.out.println("After Second Assertion");

   }
    @Test
    public void test2(){
        //verify that title starts with C
        String actualTitle = "Cybertek";
        String expecTitleBeginning = "C";

        System.out.println("first assertion");

        Assert.assertTrue(actualTitle.startsWith(expecTitleBeginning),"Verify title starts with C");

        //TASK
        //VERIFY THAT EMAIL INCLUDES @ SIGN
        Assert.assertTrue("yasin@mail".contains("@"), "Verify @ in email");
    }

    @Test
    public void test3(){

       Assert.assertNotEquals("one","two");
    }

    @Test
    public void test4() {

        Assert.assertFalse(1 < 0);

    }
}
