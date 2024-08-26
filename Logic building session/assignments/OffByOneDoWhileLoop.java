/*public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num>0); 
 } 
} */

// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5?

/*
  this loop print unexpected number because num is decresed to 0 condition in while loop get true.to print 1 to 5 numbers write condition in while(num<=5) 
*/


public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num<=5); 
 } 
}  