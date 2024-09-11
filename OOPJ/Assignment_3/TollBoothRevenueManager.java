package Assignment_3;

import java.util.Scanner;

public class TollBoothRevenueManager {
	
	int vehicleCount;
	int revenue=0;
	String vehicleType;
	int tollRateCar;
	int tollRateTruck;
	int tollRateMotorcycle;
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Type of vehicle car ,truck, motorcycle ");
		vehicleType=sc.nextLine();
		System.out.println("Enter vehicle Count: ");
		vehicleCount=sc.nextInt();
		
	}
	
	public void setTollRates()
	{
		tollRateCar=50;
		tollRateTruck=100;
		tollRateMotorcycle=30;
	}

	public void calculateRevenue()
	{
		
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
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		TollBoothRevenueManager t1=new TollBoothRevenueManager();
		t1.acceptRecord();
		t1.setTollRates();
		t1.printRecord();
		t1.calculateRevenue();

		
	

	}

}
