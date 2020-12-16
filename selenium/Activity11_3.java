package BActivity11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        //SIMPLE
        WebElement u = driver.findElement(By.id("prompt"));
        u.click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Yes,you are !");
        driver.switchTo().alert().accept();
        driver.close();
        
        
    }
}