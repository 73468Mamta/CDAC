package org.methods.calculation;

import java.text.NumberFormat;
import java.util.Scanner;

import org.getter_setter.constructor.CompoundInterestCalculator;

public class CompoundInterestCalculatorUtil {
	
	private CompoundInterestCalculator value;
	
	public CompoundInterestCalculatorUtil() {
		this.value=new CompoundInterestCalculator();
	}
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Principal Amount: ");
		this.value.setPrincipal(sc.nextDouble());
		
		System.out.println("Enter Annual Interest Rate: ");
		this.value.setAnnualInterestRate(sc.nextFloat());
		
	    System.out.println("Enter Investment Duration in years: ");
		this.value.setYear(sc.nextInt());
		
		System.out.println("Enter number of times the interest is compounded per year: ");
		this.value.setNoOfCompound(sc.nextInt());
		
		sc.close();
	}
	 
	public double calculateFutureValue()
	{
		double principal = value.getPrincipal();
		float annualInterestRate = value.getAnnualInterestRate();
		int noOfCompound = value.getNoOfCompound();
		int year=value.getYear();
		
		double futureValue = principal * Math.pow(1 + (annualInterestRate / noOfCompound),noOfCompound * year);
		
		return futureValue;

	}
	
	public void printRecord()
	{
		double futureValue=calculateFutureValue();
		double totalInterest = futureValue - value.getPrincipal();
		
		System.out.println("Future Value: "+NumberFormat.getCurrencyInstance().format(futureValue));
		System.out.println("Total Interest: "+NumberFormat.getCurrencyInstance().format(totalInterest));
		
	}

}
