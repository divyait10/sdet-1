package Activity7_1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7_1 {

		public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
		web.navigate().to("https://training-support.net/selenium/selects");;
		WebElement unorderli = web.findElement(By.xpath("//select[@class='ui selection dropdown']"));
		Select li = new Select(unorderli); 	
		li.selectByVisibleText("Option 2");
		WebElement tet = web.findElement(By.xpath("//div/h3[contains(text(),'You have ')]"));
		System.out.println(tet.getText());
		li.selectByIndex(3);
		System.out.println(tet.getText());
		li.selectByValue("4");
		li.selectByIndex(3);
		li.selectByValue("4");
		System.out.println(tet.getText());
		List<WebElement> we= li.getOptions();
		for (WebElement d : we)
		{
			System.out.println(d.getText());
		}
		}

}
