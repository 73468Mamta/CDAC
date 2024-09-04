package Pattern_Challenge;
import java.util.Scanner;

public class Hollow_pyramid 
{

	public static void main(String[] args) 
	{
       int num=6;
			    
	    // Outer loop for rows
	    for (int i = 1; i <= num; i++) 
		{
		     // first inner loop for spaces
			 for (int j = 1; j <= num - i; j++)
			  {
			    System.out.print(" ");
			  }
			  // second inner loop for stars and  spaces
			  for (int k = 1; k <= 2*i -1; k++) 
			   {
			    // check  if its first and last column or last row
			    // print star otherwise print space
			      if(k == 1 || k == 2*i -1 || i == num)
			        System.out.print("*");
			      else
			        System.out.print(" ");
			   }
			      System.out.println();
			    
         }
     }

}
