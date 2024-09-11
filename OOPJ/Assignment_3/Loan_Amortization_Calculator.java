package Assignment_3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Loan_Amortization_Calculator {
	private double principal_amount;
	private float annual_interest_rate;
	private int loan_term;
	private double monthlyPayment;
	private double totalAmountPaid;
	
	public void acceptRecord()
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		principal_amount=sc.nextDouble();
		System.out.println("Enter annual_interest_rate:");
		annual_interest_rate=sc.nextFloat();
		System.out.println("Enter Loan_Term in years:");
		loan_term=sc.nextInt();
		sc.close();
		
	}

	
	public void CalculateMonthlyPayment()
	{
		float monthlyInterestRate = annual_interest_rate / 12/100;
		int numberOfMonths = loan_term * 12;
		monthlyPayment =principal_amount * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate,numberOfMonths))) / ((Math.pow(1 + monthlyInterestRate,numberOfMonths)) - 1));
        totalAmountPaid=monthlyPayment * numberOfMonths;
	}                          
	
	
	public void printRecord()
	{
		System.out.println("Monthly Payment: " +NumberFormat.getCurrencyInstance().format(monthlyPayment));
		System.out.println("Total amount paid over the life of the loan: " +NumberFormat.getCurrencyInstance().format(totalAmountPaid));
	}
	
	public static void main(String[] args) {
		Loan_Amortization_Calculator lac = new Loan_Amortization_Calculator();
		lac.acceptRecord();
		lac.CalculateMonthlyPayment();
		lac.printRecord();
		
		

	}
	

}
