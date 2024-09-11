package Assignment_2;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("No argumens passed");
		}
		else {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operator + - * /");
		char operator=sc.next().charAt(0);
		
		switch(operator)
		{
		case '+' :
			int res=num1+num2;
			System.out.println("Addition: "+res);
			break;
			
		case '-' :
			int res1=num1-num2;
			System.out.println("Addition: "+res1);
			break;
			
		case '*' :
			int res2=num1*num2;
			System.out.println("Addition: "+res2);
			break;
			
		case '/' :
			int res3=num1/num2;
			System.out.println("Addition: "+res3);
			break;
			
			
		}
		
		
		
		sc.close();

	}

}
}
