package Activity5_2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Activity5_2 
{

	public static void main (String [] args)
	{
		WebDriver dd = new FirefoxDriver();
		dd.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println(dd.getTitle());
		Boolean result = dd.findElement(By.xpath("//div[@id='dynamicCheckbox']//input")).isSelected();
		System.out.println("Before Checking the chheckbox :" +result);
		dd.findElement(By.xpath("//div[@id='dynamicCheckbox']//input")).click();
		Boolean result2 = dd.findElement(By.xpath("//div[@id='dynamicCheckbox']//input")).isSelected();
		System.out.println("After Checking the chheckbox :" +result2);	
	}
	
}