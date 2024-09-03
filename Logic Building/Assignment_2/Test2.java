/*public class Test2 { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
}
*/ 


//What happens when you run this code? How can you avoid infinite loops?

/*
   the code will run infinite time.to avoid infinite loop write terminating condition in while loop
*/

public class Test2 { 
 public static void main(String[] args) { 
  int a=1;
 while (a<5) { 
 System.out.println("Infinite Loop");
 a++; 
 } 
 } 
} 