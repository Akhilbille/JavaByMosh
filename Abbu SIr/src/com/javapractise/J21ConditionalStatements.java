package com.javapractise;

import java.util.Scanner;

public class J21ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte maths = input.nextByte();
		byte physics = input.nextByte();
		byte chemistry = input.nextByte();
		int total = maths+physics+chemistry;
		float average = total / 3.0f;
		System.out.println(average);
		

	}

}
