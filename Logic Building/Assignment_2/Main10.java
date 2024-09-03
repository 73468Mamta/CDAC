 /*class Main10 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} 
*/


//What runtime exception do you encounter? Why does it occur?

/*
  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
  at Main10.
   It occur because size of array is 3 and we are requesting index greater than size of the array.
*/

class Main10 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 
