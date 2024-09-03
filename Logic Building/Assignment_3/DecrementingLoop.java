public class DecrementingLoop 
{ 
 public static void main(String[] args) 
 { 
 int total = 0; 
 for (int i = 5; i > 0; i--) 
 { 
 total += i; 
 if (i == 3) continue; 
 total -= 1; 
 } 
 System.out.println(total); //11 
 } 
} 


/*
    i=5                    i=4                  i=3               
	5>0                    4>0                  3>0
	total=total+i          total=total+i        total=total+i
	     =0+5                   =5+4                 =9+3
		 =5                     =9                   =12
    if(5==3)==>false      if(4==3)==>false      if(3==3)==>true   ==>  total=total-1
	                                                                        =12-1
																			=11
*/