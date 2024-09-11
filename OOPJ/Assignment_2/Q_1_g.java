package Assignment_2;

public class Q_1_g {

	public static void main(String[] args) 
	{
		boolean a=true;
		
		byte b1 = (byte)a;
		System.out.println(b1); //- Cannot cast from boolean to byte
		
		char c = (char)a;
		System.out.println(c);//-Cannot cast from boolean to char
		
		short s = (short)a;
		System.out.println(s);//-Cannot cast from boolean to short
		
		int i = (int)a;
		System.out.println(i);//-Cannot cast from boolean to int
		
		float f = (float)a;
		System.out.println(f);//-Cannot cast from boolean to float
		
		double d = (double)a;
		System.out.println(d);//-Cannot cast from boolean to double
		
		long l = (long)a;
		System.out.println(l);//-Cannot cast from boolean to long
		
	}

}
