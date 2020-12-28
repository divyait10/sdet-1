package TestNG;
import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Activity16_3 {
    WebDriver driver;

    @BeforeTest
    public void launchbrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/dynamic-controls");
    }

    @Test
    public void loginTest() {
        WebElement checkbox= driver.findElement(By.xpath("//*[@type='checkbox']"));
        WebElement button= driver.findElement(By.id("toggleCheckbox"));
 
     
        Assert.assertTrue(checkbox.isDisplayed());
        System.out.println("Checkbox is found ");
        
        button.click();
        System.out.println("Now clicking on remove checkbox button");
        
        Assert.assertFalse(checkbox.isDisplayed());
        System.out.println("Checkbox is not found ");
       
            
        
    }

    @AfterTest
    public void closebrowser() {
        //Close browser
     //   driver.close();
    }
}