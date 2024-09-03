class MaximumNo
{
 public static void main(String args[])
 {
   int num=4825,max=0;
   while(num>0)
   {
     if(num%10>max)
	 {
	   max=num%10;
	 }
	 num=num/10;
   }
   System.out.println(max);
 }
}  