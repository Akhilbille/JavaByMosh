package com.javapractise;

import java.util.Scanner;

public class J20CondStatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short age;
		Scanner input = new Scanner(System.in);
		age = input.nextShort();
		if (age>14 && age < 55) {
			System.out.println("Young");
		}
		else
			System.out.println("Not Young");

	}

}
