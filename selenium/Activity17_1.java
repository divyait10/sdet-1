package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity17_1 {
	@BeforeClass
	 public void class1entry() {
		  System.out.println("I am entering class 1 file");
	  }

	@AfterClass
	 public void class1exit() {
		  System.out.println("I am exiting class 1 file");
	  }
  @Test
  public void one() {
	  System.out.println("I am in method 1 of activity17_1");
  }
  
  
  @Test
  public void two() {
  System.out.println("I am in method 2 of activity17_1");
  }
  @BeforeMethod
  public void method1() {
  System.out.println("I am into entering into a method of class 1 ");
  }
  @AfterMethod
  public void method2() {
  System.out.println("I am into exiting from a method of class 1 ");
  }
}
