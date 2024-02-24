package com.javapractise;

import java.util.Scanner;

public class J55MortageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int principal,period;
		double interest;
		while (true) {
			System.out.print("Principal($1k - $1M) : ");
			principal = input.nextInt();
			if(principal >= 1000 && principal <= 1000000) {
				break;
			}
			else {
				System.out.println("Enter a number between 1k - 1M");
			}
			
		}
		while (true) {
			System.out.print("Annual Interest Rate : ");
			interest = input.nextDouble();
			if(interest >  0 && interest <= 30) {
				break;
			}
			else {
				System.out.println("Enter a value greater than 0 or less than or equals to 30");
			}
			
		}
		while (true) {
			System.out.print("Period (Years) : ");
			period = input.nextInt();
			if(period >= 1 && period <= 30) {
				break;
			}
			else {
				System.out.println("Enter a number between 1- 30.");
			}
			
		}
		
		double num = Math.pow((1+interest), period);
		double denom = num - 1;
		double result = principal * interest * (num / denom);
		System.out.println(result);
		System.out.println("OUT");

	}

}
