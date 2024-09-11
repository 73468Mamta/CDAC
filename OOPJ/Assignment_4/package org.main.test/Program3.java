package org.main.test;

import org.methods.calculation.BMITrackerUtil;

public class Program3 {

	public static void main(String[] args) {
		BMITrackerUtil bmi=new BMITrackerUtil();
		bmi.acceptRecord();
		bmi.classifyBMI( );
		bmi.printRecord();

	}

}
