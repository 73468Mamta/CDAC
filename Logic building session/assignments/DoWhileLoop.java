public class DoWhileLoop { 
 public static void main(String[] args) { 
 int i = 1; 
 do { 
 System.out.print(i + " "); //1 2 3 4
 i++; 
 } while (i < 5); 
 System.out.println(i); //5 
 } 
} 


/*
    1                   2             3               4
  i++ ==> 2        i++ ==> 3       i++ ==> 4      i++ ==> 5
  2<5 ==> true    3<5 ==> true    4<5 ==> true    5<5 ==> false  ==> print "i" ==> 5

*/