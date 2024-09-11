package org.methods.calculation;

import java.util.Scanner;

import org.getter_setter.constructor.TollBoothRevenueManager;

public class TollBoothRevenueManagerUtil {
	private int vehicleCount;
	private int revenue=0;
	private String vehicleType;

   private TollBoothRevenueManager value;
   
   public TollBoothRevenueManagerUtil() {
	   value=new TollBoothRevenueManager(50,100,30);
   }
   
   public void acceptRecord() {
	   Scanner sc=new Scanner(System.in);
	   
		System.out.println("Enter the Type of vehicle car ,truck, motorcycle ");
		vehicleType=sc.nextLine();
		System.out.println("Enter vehicle Count: ");
		vehicleCount=sc.nextInt();
		
		sc.close();
   }
   
   public void calculateRevenue()
	{
	   
	    int tollRateCar=value.getTollRateCar();
		int tollRateTruck=value.getTollRateTruck();
		int tollRateMotorcycle=value.getTollRateMotorcycle();
	    
		
		switch(vehicleType)
		{
		case "car":
			for(int car=1;car<=vehicleCount;car++)
			{
				revenue=revenue+tollRateCar;
			}
			System.out.println("Toll Rate For Car: "+revenue);
			break;
		
		case "truck":
			for(int truck=1;truck<=vehicleCount;++truck)
			{
				revenue=revenue+tollRateTruck;
			}
			System.out.println("Toll Rate For Truck: "+revenue);
			break;
			
		case "motorcycle":
			for(int motorcycle=1;motorcycle<=vehicleCount;++motorcycle)
			{
				revenue=revenue+tollRateMotorcycle;
			}
			System.out.println("Toll Rate For Motorcycle: "+revenue);
			break;
			
		}
	}
		
		public void printRecord()
		{
			System.out.println("-----------------------------------");
		    System.out.println("Type of Vehicle: "+this.vehicleType);
		    System.out.println("No of Vehicle: "+this.vehicleCount);
		}
	
}

