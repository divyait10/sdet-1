package Activity2_1;

 abstract class Book {
String title;
	 

abstract void settitle(String s);
	String gettitle()
	{
		return title;
	}
	
	}
class MyBook extends Book
{
public void settitle(String s) {
	// TODO Auto-generated method stub
	title = s;
}
}
public class Activity2_1 {
    
    public static void main(String []args) {
        //Initialize title of the book
        String title = "Hover Car Racer";
        //Create object for MyBook
        Book newNovel = new MyBook();
        //Set title
        newNovel.settitle(title);
        
        //Print result
        System.out.println("The title is: " + newNovel.gettitle());
    }
}