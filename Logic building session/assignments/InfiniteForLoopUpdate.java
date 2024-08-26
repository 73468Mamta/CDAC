/* public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} */


// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update expression be corrected? 

/*
  the loop print unexpected results because in expression value of i is increased by 2.
*/


public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 1) { 
 System.out.println(i); 
 } 
 } 
} 

