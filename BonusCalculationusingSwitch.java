package com.codegnan.controlstatements;

import java.util.Scanner;

public class BonusCalculationusingSwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary ");
		double salary=s.nextDouble();
		double bonus=0;
		System.out.println("Enter role 1.Manager /2.Developer/3.Intern");
		int code=s.nextInt();
		switch(code) {
		case 1:
			bonus=salary*0.1;
			System.out.println(bonus);
			break;
		case 2:
			bonus=salary*0.05;
			System.out.println(bonus);
			break;
		case 3:
			bonus=500;
			System.out.println(bonus);
			break;
			default:
				System.out.println("Invalid role selected");
		}
		s.close();
	}
}
