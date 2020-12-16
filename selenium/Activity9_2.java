package Activity9_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_2 {
	public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
	//	WebDriverWait wait = new WebDriverWait(web,10);
		web.navigate().to("https://training-support.net/selenium/dynamic-attributes");
		web.getTitle();
		WebElement a = web.findElement(By.xpath("//button[contains(text(),'Sign')]/preceding::input[4]"));
		WebElement b = web.findElement(By.xpath("//button[contains(text(),'Sign')]/preceding::input[3]"));
		WebElement c = web.findElement(By.xpath("//button[contains(text(),'Sign')]/preceding::input[2]"));
		WebElement d = web.findElement(By.xpath("//button[contains(text(),'Sign')]/preceding::input[1]"));
		
		a.sendKeys("Divya");
		b.sendKeys("ppassword");
		c.sendKeys("ppassword");
		d.sendKeys("pass@gmail.com");
		
		WebElement p = web.findElement(By.xpath("//button[contains(text(),'Sign')]"));
		p.click();
		WebElement r = web.findElement(By.xpath("//div[contains(text(),'Thank')]"));
		System.out.println(r.getText());
		//web.close();
		}
}
