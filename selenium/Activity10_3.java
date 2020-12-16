package BActivity10;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        //Open browser
        driver.get("https://training-support.net/selenium/drag-drop");
        WebDriverWait wd = new WebDriverWait(driver,10);
        WebElement ball1 = driver.findElement(By.id("draggable"));
        wd.until(ExpectedConditions.elementToBeClickable(ball1));
        System.out.println(driver.getTitle());
        //how to verify that ball has entered 
        
        Actions mv = new Actions(driver);
        WebElement pos = driver.findElement(By.id("droppable"));
        mv.moveToElement(ball1).dragAndDrop(ball1, pos).build().perform();
        

        WebElement ball2 = driver.findElement(By.id("dropzone2"));
       mv.moveToElement(ball1).dragAndDrop(ball1,ball2).build().perform();
        
        
        
        
    }
}