package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity17_2 {
  @Test
  public void onee() {
	  System.out.println("I am in method 1 of activity17_2");
  }
  
  
  @Test
  public void twoo() {
  System.out.println("I am in method 2 of activity17_2");
  
  }
  @BeforeClass
	 public void class1entry() {
		  System.out.println("I am entering into class 2 file");
	  }

	@AfterClass
	 public void class1exit() {
		  System.out.println("I am exiting into class 2 file");
	  }
	  @BeforeMethod
	  public void method1() {
	  System.out.println("I am into entering into a method of class 2 ");
	  }
	  @AfterMethod
	  public void method2() {
	  System.out.println("I am into exiting from a method of class 2 ");
	  }
}
