package TestNG;
import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity16_2 {
    WebDriver driver;

    @BeforeClass
    public void launchbrowser() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void loginTest() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
     
        username.sendKeys("admin");
        password.sendKeys("password");
        
        //Click login
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        
        //Read login message
        String loginMessage = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

    @AfterClass
    public void closebrowser() {
        //Close browser
        driver.close();
    }
}