public class Switch1
 { 
 public static void main(String[] args) 
{ 
 int number = 5; 
 switch(number) 
{ 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 

//Error to Investigate: Why does the compiler complain about duplicate case labels? What 
//happens when you have two identical case labels in the same switch block? 

/*
  Because in switch case statement duplicate case not allowed it will give error.
if there are two identical case labels in same switch block the 2nd case will never be executed.
*/
