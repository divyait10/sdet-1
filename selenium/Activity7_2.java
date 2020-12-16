package Activity7_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity7_2 {
	public static void main(String[] args) {
		WebDriver web = new FirefoxDriver();
		web.navigate().to("https://training-support.net/selenium/selects");;
		WebElement multili = web.findElement(By.id("multi-select"));
		Select li = new Select(multili);
		if (li.isMultiple())
		{
		li.selectByVisibleText("Javascript");
		li.selectByValue("node");
		li.selectByIndex(4);
		li.selectByIndex(5);
		li.selectByIndex(6);
		li.deselectByValue("node");
		li.deselectByIndex(7);
		li.getFirstSelectedOption().getText();
		
		//to print the selected options alone 
		List<WebElement> lib= li.getAllSelectedOptions();
		for (WebElement s : lib)
		System.out.println(s.getText());
		
		//to print all the options
		List<WebElement> libe= li.getOptions();
		for (WebElement t : libe)
		System.out.println(t.getText()); 
				
		li.deselectAll();
		}
		}
}
