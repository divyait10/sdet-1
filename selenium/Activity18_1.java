package TestNG;
import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity18_1 {
    WebDriver driver;

    @BeforeClass
    public void launchbrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test ()
    @Parameters ({"username","password"})
    public void loginTest(String username,String password) {
        WebElement user = driver.findElement(By.id("username"));
        WebElement pass = driver.findElement(By.id("password"));
     
        user.sendKeys(username);
        pass.sendKeys(password);
                //Click login
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        
        //Read login message
        String loginMessage = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).getText();
        if (loginMessage== "Welcome Back, admin")
        	        Assert.assertEquals("Welcome Back, admin", loginMessage);
        else 
        	Assert.assertNotSame("Invalid Credentials", loginMessage);
        
       
        	
    }

    @AfterClass
    public void closebrowser() {
           driver.close();
    }
}