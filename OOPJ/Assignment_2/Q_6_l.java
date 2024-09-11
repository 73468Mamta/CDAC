package Assignment_2;

public class Q_6_l {

	public static void main(String[] args) {
		float a=0.0f;
		float b=0.0f;
		System.out.println("Divide: "+(a/b)); //That's because JVM only throws arithmetic exception when divided by int 0
		                                      //If you divide by floating-point 0.0 result will be NaN
		                                      //NAN means not a number
		

	}

}