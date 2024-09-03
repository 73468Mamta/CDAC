public class LoopIncrement { 
 public static void main(String[] args) { 
 int count = 0; 
 for (int i = 0; i < 4; i++) 
 { 
 count += i++ - ++i; //count=count + i++ - ++i 
 } 
 System.out.println(count); 
 } 
}


/*  
      count=0                    count=-2                   count=-4
	  i=0                         i=2                          i=4
	  0<4                         2<4                          4<4  ==> false ==> print count ==> -4 
	  count= 0 + 0++ - ++1       count= -2 + 2++ - ++3
	       = 0 + 0 - 2                   = -2 + 2 - 4
		   = -2                          = -4
      
*/