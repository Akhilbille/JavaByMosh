package com.javapractise;
import java.util.Scanner;
public class J19ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Even or Odd
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number = input.nextInt();
		if(number % 2 == 0) {
			System.out.println("Even");
			
		}
		else 
			System.out.println("ODD");
		

	}

}
