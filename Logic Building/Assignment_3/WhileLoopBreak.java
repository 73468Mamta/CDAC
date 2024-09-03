public class WhileLoopBreak 
{ 
 public static void main(String[] args) 
 { 
 int count = 0; 
 while (count < 5) 
 { 
 System.out.print(count + " "); //0 1 2
 count++; 
 if (count == 3) break; 
 } 
 System.out.println(count); //3 
 } 
} 
     
/*
      0<5                    1<5                      2<5
    print "0"	            print "1"               print "2"  
  count++;==>1             count++;==>2            count++;==>3
  if(1==3)==>false       if(2==3)==>false        if(3==3)==>false  ==> print count ==> 3  
*/