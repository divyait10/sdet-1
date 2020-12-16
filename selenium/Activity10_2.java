package BActivity10;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        //Find the cude
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        WebElement d = driver.findElement(By.id("keyPressed"));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        //Left click
        action.sendKeys("D").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
        System.out.println();
     //   driver.close();
    }
}