package Activity6_2;


import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity6_2 {

	public static void main(String[] args) {

		WebDriver web = new FirefoxDriver();
		web.navigate().to("https://training-support.net/selenium/tables");;
		WebElement table = web.findElement(By.xpath("//table[@class='ui sortable celled table']"));
		WebElement f = web.findElement(By.xpath("//div[contains(text(),'Sortable')]"));
		List<WebElement> row = web.findElements(By.xpath("//table[@class='ui sortable celled table']/tbody/tr"));
		List<WebElement> columns = web.findElements(By.xpath("//table[@class='ui sortable celled table']/thead/tr/th"));
		int size = row.size();
		int colsize = columns.size();
		System.out.println("Table name : " + f.getText());
		//System.out.println(rowsize);
		System.out.println(colsize);
		System.out.println(" 2nd row and 2nd column value :  " +web.findElement(By.xpath("//td[contains(text(),'Approved')]")).getText());
		}
}
