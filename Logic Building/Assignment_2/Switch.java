/* public class Switch 
{ 
 public static void main(String[] args) 
{ 
 double score = 85.0; 
 switch(score) 
{ 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} */

// Error to Investigate: Why does this code not compile? What does the error tell you about the 
//types allowed in switch expressions? How can you modify the code to make it work?

/*
code not compile because java not allowed double in Switch Statement.
errors==>
 patterns in switch statements are a preview feature and are disabled by default.switch(score)
 constant label of type int is not compatible with switch selector type double case 100:
 constant label of type int is not compatible with switch selector type double case 85:
*/



public class Switch 
{ 
 public static void main(String[] args) 
{ 
 int score = 85; 
 switch(score) 
{ 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 