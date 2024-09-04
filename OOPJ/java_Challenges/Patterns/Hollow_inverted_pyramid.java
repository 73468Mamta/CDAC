package Pattern_Challenge;
import java.util.Scanner;

public class Hollow_inverted_pyramid 
{
  public static void main(String[] args) 
  {
    int num=6;
    
    // Outer loop for rows
    for (int i = 1; i <= num; i++)
    {
      // first inner loop for spaces
      for (int j = 1; j <= i - 1; j++) 
      {
        System.out.print(" ");
      }
      // second inner loop for stars and spaces
      for (int k = 1; k <= 2 * (num - i) + 1; k++)
      {
        // print star for first and last column and for first row
        if (k == 1 || k == 2 * (num - i) + 1 || i == 1) 
        {
          System.out.print("*");
        } else {
          System.out.print(" ");
       }
      }
      System.out.println();
    }
  }
}
