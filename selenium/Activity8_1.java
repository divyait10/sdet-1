package Activity8_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity8_1 {
	public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(web,10);
		web.navigate().to("https://training-support.net/selenium/dynamic-controls");
		web.getTitle();
		WebElement m = web.findElement(By.xpath("//input[@name='toggled']"));
		WebElement multili = web.findElement(By.xpath("//div/button[contains(text(),'Remove')]"));
		multili.click();
		wait.until(ExpectedConditions.invisibilityOf(m));
		multili.click();
		wait.until(ExpectedConditions.visibilityOf(m));
		m.click();
		web.close();
		}
}
