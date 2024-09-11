80package Assignment_3;

import java.util.Scanner;

public class BMITracker {
    private double weight;
    private double height;
	private double BMI;	

	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight in kilogram: ");
		weight=sc.nextDouble();
		System.out.println("Enter the height in meter: ");
		height=sc.nextDouble();
		System.out.println("----------------");
		
	}
	
	public void calculateBMI()
	{
		BMI=weight/(height*height);
		
	}
	
	public void classifyBMI()
	{
		if(BMI<18.5)
		{
			System.out.println("underweight");
		}
		else if(BMI>=18.5 && BMI <=24.5)
		{
			System.out.println("Normal weight");
		}
		else if(BMI>=24.5 && BMI<30)	
		{
			System.out.println("Overweight");
		}
		else if(BMI>=30)
		{
		System.out.println("Obese");
		}

	}
	
	public void printRecord()
	{
		System.out.println("BMI: "+BMI);
		System.out.println("----------------");
	}

	public static void main(String[] args) {
		BMITracker b1=new BMITracker();
		b1.acceptRecord();
		b1.calculateBMI();
		b1.printRecord();
		b1.classifyBMI();
		

	}

}
