package com.codegnan.controlstatements;

import java.util.Scanner;

public class WeatherAlertSystem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int temp;
		int code;
		do {
			System.out.println("Enter 1.Sunny 2.Rainy 3.Stormy");
			code=s.nextInt();
			System.out.println("Enter temperature");
			temp=s.nextInt();
			switch(code) {
			case 1:
				System.out.println("Sunny");
				break;
			case 2:
				System.out.println("Rainy");
				break;
			case 3:
				if(temp<10) {
					System.out.println("Severe Warning");
				}else {
					System.out.println("Stormy");
				}
			default:
				System.out.println("Invalid Condition");
			}
		}while(code!=4);
		s.close();
	}

}