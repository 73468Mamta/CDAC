/*public class Test3 { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 
*/


//What exception is thrown? Why does it occur?
/*
   Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" it occur because String is null  
*/


public class Test3 { 
 public static void main(String[] args) { 
 String str = "Hello"; 
 System.out.println(str.length()); 
 } 
} 
