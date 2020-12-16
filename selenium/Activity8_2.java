package Activity8_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8_2 {
	public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(web,10);
		web.navigate().to("https://training-support.net/selenium/ajax");
		web.getTitle();
		WebElement m = web.findElement(By.xpath("//div/button[contains(text(),'Change Content']"));
		WebElement n = web.findElement(By.xpath("//div/h1[contains(text(),'HELLO']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h1[contains(text(),'HELLO']")));
		m.click();
		wait.until(ExpectedConditions.visibilityOf(m));
		
		
		}
}
