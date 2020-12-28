package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;
import org.testng.SkipException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16_1 {
    @Test(alwaysRun=true)
    public void testCase1() {
        //This test case will pass
    	System.out.println("method 1");
       	
    }
        @Test(alwaysRun=true)
    public void testCase2() {
    	
    }
          @Test()
    public void testCase3() {
    	System.out.println("method 3");
    	  Assert.fail();
       }
          @Test(dependsOnMethods="testCase3")
          public void testCase4() {
        
             }

}
