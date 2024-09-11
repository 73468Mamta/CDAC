package org.methods.calculation;

import java.util.Scanner;

import org.getter_setter.constructor.BMITracker;

public class BMITrackerUtil {
	private BMITracker value;
	
	public BMITrackerUtil() {
		this.value=new BMITracker();
	}

	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the weight in kilogram: ");
		this.value.setWeight(sc.nextFloat());
		System.out.println("Enter the height in meter: ");
		this.value.setHeight(sc.nextFloat());
		
		sc.close();
	}
	

	public float calculateBMI()
	{
		return value.getWeight()/(value.getHeight()*value.getHeight());
		
	}
	
	public String classifyBMI()
	{ 
		float BMIindex=calculateBMI();
		
		if(BMIindex<18.5)
		{
			return "underweight";
		}
		else if(BMIindex>=18.5 && BMIindex <=24.5)
		{
			return "Normal weight";
		}
		else if(BMIindex>=24.5 && BMIindex<30)	
		{
			return "Overweight";
		}
		else 
		{
		    return "Obese";
		}
		
	}
	
	public void printRecord()
	{
		System.out.printf("BMI Value: "+calculateBMI());
		System.out.println( );
	    System.out.println(classifyBMI());
	}
}
