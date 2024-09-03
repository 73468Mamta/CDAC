class Fibonacci 
{
  public static void main(String args[])
  { 
    int n1=0,n2=1,sum;
	for(int i=2;i<=8;i++)
	{
	  sum=n1+n2;
	  System.out.println("Fibonacci Series: " +sum);
	  n1=n2;
	  n2=sum;
	}
	
	}
}