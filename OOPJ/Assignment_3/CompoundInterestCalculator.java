package Assignment_3;

import java.text.NumberFormat;
import java.util.Scanner;

 class CompoundInterestCalculator {
	float principal;
	float annualInterestRate;
	float years;
	float noOfCompounds;
	double totalInterest;
	double futureValue;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		principal=sc.nextFloat();
		
		System.out.println("Enter Annual Interest Rate: ");
		annualInterestRate=sc.nextFloat();
		
	    System.out.println("Enter Investment Duration in years: ");
		years=sc.nextFloat();
		
		System.out.println("Enter number of times the interest is compounded per year: ");
		noOfCompounds=sc.nextFloat();
		
		sc.close();
	}

	
	public void calculateFutureValue()
	{
		futureValue = principal * Math.pow(1 + (annualInterestRate / noOfCompounds),noOfCompounds * years);
		totalInterest = futureValue - principal;

	}
	
	public void printRecord()
	{
		System.out.println("Future Value: "+NumberFormat.getCurrencyInstance().format(futureValue));
		System.out.println("Total Interest: "+NumberFormat.getCurrencyInstance().format(totalInterest));
		
	}
	
	public static void main(String[] args) {
		CompoundInterestCalculator c = new CompoundInterestCalculator();
		c.acceptRecord();
		c.calculateFutureValue();
        c.printRecord();
			
	}

}
