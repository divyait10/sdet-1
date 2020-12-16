package BActivity11;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_4{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wa = new WebDriverWait(driver,10);
        //Open browser
        driver.get(" https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title of Page        :" +driver.getTitle());
        System.out.println("Current window Handle:" +driver.getWindowHandle());
        //SIMPLE
        WebElement u = driver.findElement(By.id("launcher"));
        u.click();
        Thread.sleep(2000);
        Set <String> ss = driver.getWindowHandles();
        int i=1;
        for ( String s : ss )
        {
        	
            System.out.println("Window Handle    :"+i +"\t" +s);
            i++;
        }
        for ( String c : driver.getWindowHandles())
        	driver.switchTo().window(c);
        System.out.println("Switch to recent handle : "  + driver.getWindowHandle());
        WebElement v = driver.findElement(By.id("actionButton"));
        wa.until(ExpectedConditions.elementToBeClickable(v));
        v.click();
        
        driver.getTitle();
        driver.quit();
    }
}