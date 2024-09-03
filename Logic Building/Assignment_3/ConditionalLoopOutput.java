public class ConditionalLoopOutput { 
 public static void main(String[] args) { 
 int num = 1; 
 for (int i = 1; i <= 4; i++) 
 { 
 if (i % 2 == 0) 
 { 
 num += i; 
 } 
 else 
 { 
 num -= i; 
 } 
 } 
 System.out.println(num); 
 } 
} 


/*
                                             i++                               i++                                i++                         i++                   
			i=1                              i=2                               i=3                                i=4                         i=5           
		   1<=4                              2<=4                              3<=4                               4<=4                      5<=4 ==>false
		1%2==0 => 2==0 ==>false            2%2==0 => 0==0 ==>true          3%2==0 => 1==0 ==>false         4%2==0 => 0==0 ==>true        print num = 3
		 num=1-1=>0                        num=0+2=>2                        num=2-3=>-1                         num=-1+4=>3
*/