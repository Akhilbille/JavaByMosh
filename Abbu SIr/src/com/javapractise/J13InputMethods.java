package com.javapractise;

import java.util.Scanner;

public class J13InputMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = input.nextInt();
		
		
		System.out.println("Enter your name : ");
		input.nextLine();
		String name = input.nextLine();
		System.out.println("Enter your Mother name : ");
		String motherName = input.next();
		System.out.println("Hi" + name + "Yours mother name is " + motherName + " and your age is "+ age);

		
	}

}
