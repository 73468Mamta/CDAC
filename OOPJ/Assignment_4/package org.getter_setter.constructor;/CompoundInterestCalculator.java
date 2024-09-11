package org.getter_setter.constructor;

public class CompoundInterestCalculator {
	double principal;
	float annualInterestRate;
	int noOfCompound;
	int year;
	
	public CompoundInterestCalculator() {
		this(0.0d,0.0f,0,0);
	}
	
	public CompoundInterestCalculator(double principal,float annualInterestRate,int noOfCompound,int year) {
		this.principal=principal;
		this.annualInterestRate=annualInterestRate;
		this.noOfCompound=noOfCompound;
		this.year=year;
	}
	
	public void setPrincipal(double principal) {
		this.principal=principal;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}

	public float getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setNoOfCompound(int noOfCompound) {
		this.noOfCompound=noOfCompound;
	}
	
	public int getNoOfCompound()
	{
		return noOfCompound;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toString() {
		return "[ principal: " +principal+ ", annualInterestRate: " +annualInterestRate+ ", noOfCompound: " + noOfCompound+ ", year: "+year+ "]";
	}
}