package com.codegnan.controlstatements;
import java.util.Scanner;
public class LibraryFinesCalculator{
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		int days;
		int fine=0;
		int code;
		do {
		System.out.println("Enter code[1-3]: ");
		code=s.nextInt();
		System.out.println("Enter number of days: [1-30]: ");
		days=s.nextInt();
		switch(code) {
		case 1:
			if(days>=1 && days<=5) {
				fine=days*1;
				System.out.println("Total Fine : "+fine);
			}else {
				System.out.println("Please enter days between 1 to 5");
			}
			
			break;
		case 2:
			if(days>=6 && days<=10) {
				fine=days*2;
				System.out.println("Total Fine : "+fine);
			}else {
				System.out.println("Please enter days between 6 to 10");
			}
			break;
		case 3:
			if(days>10) {
				fine=days*5;
				System.out.println("Total Fine : "+fine);
			}else {
				System.out.println("Please enter days more than 10");
			}
			break;
		default:
			System.out.println("Invalid code");
			break;
		}
	} 
		while(code!=3);	
		s.close();
	}
}
