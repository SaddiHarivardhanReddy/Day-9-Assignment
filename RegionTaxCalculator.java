package com.codegnan.controlstatements;

import java.util.Scanner;

public class RegionTaxCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double tax;
		int income;
		int code;
		do {
			System.out.println("Enter 1.for north 2.for South 3.for East 4.West");
			code=s.nextInt();
			System.out.println("Enter income");
			income=s.nextInt();
			switch(code) {
			case 1:
				tax=(int)income*0.05;
				System.out.println(tax);
				break;
			case 2:
				tax=income*0.06;
				System.out.println(tax);
				break;
			case 3:
				tax=(int)income*0.07;
				System.out.println(tax);
				break;
			case 4:
				tax=(int)income*0.08;
				System.out.println(tax);
				break;
				default:
					System.out.println("Invalid input");
					break;
			}
	}while(code!=4);
		s.close();
	}

}
