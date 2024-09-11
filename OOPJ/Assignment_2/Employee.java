package Assignment_2;

import java.util.Scanner;

public class Employee {
	private String name;
	private int empid;
	private float salary;
	private String city;
	private String state;
	
	
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		name=sc.nextLine();
		System.out.println("Enter Emp Id: ");
		empid=sc.nextInt();
		System.out.println("Enter Emp Salary: ");
		salary=sc.nextFloat();	
		System.out.println("City: ");
		city=sc.next();
		System.out.println("State: ");
		state=sc.next();
		
	}
	
	public void printRecord()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Salary: "+salary);
		System.out.println("city: "+city);
		System.out.println("State: "+state);
		System.out.println("\n ----------------------------\n");
		
	}
	
	

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.acceptRecord();
		emp.printRecord();
		
		Employee emp1=new Employee();
		emp1.acceptRecord();
		emp1.printRecord();
		
	

	}

}
