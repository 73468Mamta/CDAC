/* public class Test6 { 
 public static void main(String[] args) { 
 int num = 10; 
 double result =num / 4; 
 System.out.println(result); 
 } 
} 
*/

//What is the result of this operation? Is the output what you expected?

/*
   The result of the operation is 2.0. Dont get the expected output the expected output is 2.5  to get the output typecast the num.
*/


public class Test6 { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = (double)num / 4; 
 System.out.println(result); 
 } 
} 