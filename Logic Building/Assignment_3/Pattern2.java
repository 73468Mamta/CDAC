//	1
//	2*2
//	3*3*3
//	4*4*4*4
//	5*5*5*5*5
//	5*5*5*5*5
//	4*4*4*4
//	3*3*3
//	2*2
//	1

class Pattern2
{
	public static void main(String args[])
	{  
		for(int i=1; i<=5; i++)
		{
			 for(int j=1;j<i;j++)
			 {
					System.out.print(i + "*");
			 }
			 System.out.println(i);
		}
		for(int j=5;j>0;j--)
		{
			 for(int i=j-1; i>0; i--)
			 {
					System.out.print(j+ "*");
			 }
			 System.out.println(j);
		}
	}
}