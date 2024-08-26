class Reverse
{
  public static void main(String args[])
  { 
   int reverse=0,remainder;
	
    for(int num =1234;num!=0;num=num/10)
	{
		remainder=num%10;
		reverse=reverse*10+remainder;
	}
	
	System.out.println("Reverse No :" +reverse);
	
  }
}