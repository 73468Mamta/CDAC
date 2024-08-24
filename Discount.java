class Discount{
	public static void main(String args[]){
		
		int price = 5000;
		double total;
		boolean membership = false;
		
		if(price>=1000){
			if(membership == true){
				total = price * 0.25;
				System.out.println("Total : " + total);
			}else{
				total = price * 0.2;
				System.out.println("Total : " + total);
			}
		}else if(price>=500 && price<=999){
			if(membership == true){
				total = price * 0.15;
				System.out.println("Total : " + total);
			}else{
				total = price * 0.1;
				System.out.println("Total : " + total);
			}
		}else if(price<500){
			if(membership == true){
				total = price * 0.1;
				System.out.println("Total : " + total);
			}else{
				total = price * 0.05;
				System.out.println("Total : " + total);
			}
		}
	}
}