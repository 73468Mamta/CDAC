package org.getter_setter.constructor;




 public class LoanAmortizationCalculator {
	private double principal_amount;
	private float annual_interest_rate;
	private int loan_term;
	
	
	public LoanAmortizationCalculator( ) {
		this( 0.0d, 0.0f, 0 );	//Constructor Chaining
	
	}
	public LoanAmortizationCalculator(double principal_amount,float annual_interest_rate,int loan_term){
		this.principal_amount=principal_amount;     
		this.annual_interest_rate=annual_interest_rate;
        this.loan_term=loan_term;
	}

	public double getPrincipal_amount() {
		return principal_amount;
	}

	public void setPrincipal_amount(double principal_amount) {
		this.principal_amount = principal_amount;
	}

	public float getAnnual_interest_rate() {
		return annual_interest_rate;
	}

	public void setAnnual_interest_rate(float annual_interest_rate) {
		this.annual_interest_rate = annual_interest_rate;
	}

	public int getLoan_term() {
		return loan_term;
	}

	public void setLoan_term(int loan_term) {
		this.loan_term = loan_term;
	}
	
	public String toString() {
		return "[ principal: " + principal_amount +", annualInterestRate: " +annual_interest_rate+", loanTerm " + loan_term + "]";
	}
	
 }