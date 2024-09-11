package org.main.test;

import org.methods.calculation.TollBoothRevenueManagerUtil;

public class Program4 {

	public static void main(String[] args) {
		TollBoothRevenueManagerUtil t = new TollBoothRevenueManagerUtil();
		t.acceptRecord();
        t.printRecord();
		t.calculateRevenue();		

	}

}
