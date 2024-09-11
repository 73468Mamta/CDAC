package Assignment_3;

import java.text.NumberFormat;
import java.util.Scanner;

public class DiscountCalculator {
	float originalPrice;
	float discountAmount;
	float discountRate;
	float finalPrice;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Original Price: ");
		originalPrice=sc.nextFloat();
		System.out.println("Enter Discount Rate: ");
		discountRate=sc.nextFloat();
		
		sc.close();
	}

	
	public void calculateDiscount()
	{
		discountAmount = originalPrice * (discountRate / 100);
		finalPrice = originalPrice - discountAmount;
	
	}
	
	public void printRecord()
	{
		System.out.println("Discount Amount: "+NumberFormat.getCurrencyInstance().format(discountAmount));
		System.out.println("Final Price: "+NumberFormat.getCurrencyInstance().format(finalPrice));
	}
	public static void main(String[] args) {
		DiscountCalculator ds=new DiscountCalculator();
		ds.acceptRecord();
		ds.calculateDiscount();
		ds.printRecord();

	}

}
