package org.methods.calculation;

import org.getter_setter.constructor.LoanAmortizationCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	private LoanAmortizationCalculator loan;

	public LoanAmortizationCalculatorUtil() {
		this.loan = new LoanAmortizationCalculator();
	}

	public void acceptRecord() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the principal amount (Rs): ");
		this.loan.setPrincipal_amount(scanner.nextDouble());

		System.out.print("Enter the annual interest rate (in %): ");
		this.loan.setAnnual_interest_rate(scanner.nextFloat());

		System.out.print("Enter the loan term (in years): ");
		this.loan.setLoan_term(scanner.nextInt());

		scanner.close();
	}
	
	public double CalculateMonthlyPayment()
	{
		double principal_amount = loan.getPrincipal_amount();
		double annual_interest_rate = loan.getAnnual_interest_rate();
		int loan_term = loan.getLoan_term();
		
		double monthlyInterestRate = annual_interest_rate / 12/100;
		int numberOfMonths = loan_term * 12;
		double monthlyPayment =principal_amount * ((monthlyInterestRate * (Math.pow(1 + monthlyInterestRate,numberOfMonths))) / ((Math.pow(1 + monthlyInterestRate,numberOfMonths)) - 1));
		
		return monthlyPayment;
	}                          
	
	
	public void printRecord()
	{
		double monthlyPayment = CalculateMonthlyPayment();
		double totalAmountPaid=monthlyPayment * loan.getLoan_term() * 12;
		System.out.println("Monthly Payment: " +NumberFormat.getCurrencyInstance().format(monthlyPayment));
		System.out.println("Total amount paid over the life of the loan: " +NumberFormat.getCurrencyInstance().format(totalAmountPaid));
	}
}
