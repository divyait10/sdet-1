package Activity1_1;

public class Car {
String color;
String transmission;
int tyres;
int doors;
int make;
  Car()
  {
	tyres=4;
	doors=4;
	
  }
  public void diplaycharacteristics()
  {
	System.out.println("color is "  +color) ;  
	System.out.println("transmission is "  +transmission) ;  
	System.out.println("tyres are "  +tyres) ;  
	System.out.println("doors are "  +doors) ;  
  }
  
  public void accelerate()
  {
	  System.out.println("car is moving forward") ;  
  }
  public void brake()
  {
	  System.out.println("car has stopped") ;  
  }
  
}
