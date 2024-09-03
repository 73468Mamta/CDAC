/*public class Test5 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} */ 

//What error occurs when compiling this code? How should you handle different data types in operations?

/*
 incompatible types: possible lossy conversion from double to int.for decimal numbers use float and double,for binary decision and logical
  operation use boolean and for printing single character use char data type.

*/

public class Test5 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 double result = num1 + num2; 
 System.out.println(result); 
 } 
} 

