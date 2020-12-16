package Activity9_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(web,10);
		web.navigate().to("https://training-support.net/selenium/dynamic-attributes");
		web.getTitle();
		WebElement m = web.findElement(By.xpath("//button[contains(text(),'Log in')]/preceding::input[2]"));
		WebElement o = web.findElement(By.xpath("//button[contains(text(),'Log in')]/preceding::input[1]"));
		m.sendKeys("admin");
		o.sendKeys("password");
		WebElement p = web.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		p.click();
		WebElement r = web.findElement(By.xpath("//div[contains(text(),'Welcome')]"));
		System.out.println(r.getText());
		web.close();
		}
}

