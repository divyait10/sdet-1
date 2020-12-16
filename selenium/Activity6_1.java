package Activity6_11;
	import java.util.List;

	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class Activity6_1 {

		public static void main(String[] args) {

			WebDriver web = new FirefoxDriver();
			web.navigate().to("https://training-support.net/selenium/tables");;
			WebElement table = web.findElement(By.xpath("//table[@class='ui celled striped table']"));
			WebElement f = web.findElement(By.xpath("//div[contains(text(),'Static')]"));
			List<WebElement> row = web.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
			List<WebElement> columns = web.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
			int size = row.size();
			int colsize = columns.size();
			System.out.println("Table name : " + f.getText());
			System.out.println("Table Row Size   " +size);
			System.out.println("table Column Size" +colsize);
			List<WebElement> row3 = web.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]"));
			for (WebElement d : row3)
				System.out.println(d.getText());
		    System.out.println(" 2nd row and 2nd column value :  " +web.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td[2]")).getText());
			}
	}

