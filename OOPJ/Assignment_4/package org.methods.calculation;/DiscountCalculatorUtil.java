package org.methods.calculation;

import java.text.NumberFormat;
import java.util.Scanner;

import org.getter_setter.constructor.DiscountCalculator;

public class DiscountCalculatorUtil {
	private DiscountCalculator value;
	
	public DiscountCalculatorUtil() {
		this.value=new DiscountCalculator();
	}
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Original Price: ");
		this.value.setOriginalPrice(sc.nextFloat());
		System.out.println("Enter Discount Percentage %: ");
		this.value.setDiscountPercentage(sc.nextFloat());
		
		sc.close();
	}
	
	public float CalculateDiscount() {
		float originalPrice=value.getOriginalPrice();
		float discountPercentage=value.getDiscountPercentage();
		
		float discountAmount = originalPrice * (discountPercentage / 100);
		
		return discountAmount;
	}
	
	public void printRecord() {
		float discountAmount=CalculateDiscount();
		float finalPrice = value.getOriginalPrice() - discountAmount;
		
		System.out.println("Discount Amount: "+NumberFormat.getCurrencyInstance().format(discountAmount));
		System.out.println("Final Price: "+NumberFormat.getCurrencyInstance().format(finalPrice));
	}

}
