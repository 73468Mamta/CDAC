package org.getter_setter.constructor;



public class TollBoothRevenueManager {
	int tollRateCar;
	int tollRateTruck;
	int tollRateMotorcycle;
	
	public TollBoothRevenueManager() {
		this(0,0,0);
	}
	
	public TollBoothRevenueManager(int tollRateCar,int tollRateTruck,int tollRateMotorcycle) {
		this.tollRateCar=tollRateCar;
		this.tollRateTruck=tollRateTruck;
		this.tollRateMotorcycle=tollRateMotorcycle;
	}
	
	public void setTollRateCar(int tollRateCar) {
		this.tollRateCar=tollRateCar;
	}
	
	public int getTollRateCar() {
		return tollRateCar;
	}
	

	public void setTollRateTruck(int tollRateTruck) {
		this.tollRateTruck=tollRateTruck;
	}
	
	public int getTollRateTruck() {
		return tollRateTruck;
	}

	public void setTollRateMotorcycle(int tollRateMotorcycle) {
		this.tollRateMotorcycle=tollRateMotorcycle;
	}
	
	public int getTollRateMotorcycle() {
		return tollRateMotorcycle;
	}
	
	public String toString() {
		return "[ tollRateCar: "+tollRateCar+ ", tollRateTruck: "+tollRateTruck+ ", tollRateMotorcycle: "+tollRateMotorcycle+"]";
	}
}
