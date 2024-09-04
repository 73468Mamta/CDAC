package Pattern_Challenge;

public class Alphabet_pyramid 
{

	public static void main(String[] args) 
	{
		int num = 5;
		char ch = 'A';
		        
		  for (int i = 0; i < num; i++) 
		  {
		     // Print spaces
		     for (int j = 0; j < num - i - 1; j++)
		     {
		         System.out.print(" ");
		     }
		     
		     for (int j = 0; j < (2 * i + 1); j++)
		     {
	                System.out.print(ch++);
	                if (ch > 'Z') {
	                    ch = 'A'; // Reset to 'A' if ch get 'Z'
	                }
	          }
	            
	            // For next line
	            System.out.println();

	      }

     }
}
