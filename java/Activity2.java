package Activity1_2;

public class Activity2 {
public static void main (String[] args)
{
	int[] numberarr = {10,77,10,54,-11,10};
	int add=0;
	for(int j=0;j<numberarr.length;j++)
	{
	if (numberarr[j]==10)	
		 add = add + numberarr[j];
	}
	if(add == 30)
	System.out.println("Final Result verified: " +add);
	else
	System.out.println("Something went wrong.Please check ");
	}
}


