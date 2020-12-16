package Activity5_3;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Activity5_3 
{

	public static void main (String [] args)
	{
		WebDriver dd = new FirefoxDriver();
		dd.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(dd.getTitle());
		Boolean result = dd.findElement(By.xpath("//div[@id='dynamicText']/input")).isEnabled();
		System.out.println("Before Checking the textbox :" +result);
		dd.findElement(By.xpath("//button[@id='toggleInput']")).click();
		dd.findElement(By.xpath("//div[@id='dynamicText']/input")).sendKeys("Divya");
		Boolean result2 = dd.findElement(By.xpath("//div[@id='dynamicText']/input")).isEnabled();
		System.out.println("After Checking the textbox :" +result2);	
	}
	
}