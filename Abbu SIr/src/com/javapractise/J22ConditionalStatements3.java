package com.javapractise;

import java.util.Scanner;

public class J22ConditionalStatements3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num = input.nextLine();
		if (num.matches("[0-1]+"))
			System.out.println("Binary");
		else if(num.matches("[0-7]+"))
			System.out.println("Octal");
		else if(num.matches("[0-9]+"))
			System.out.println("Deciaml");
		else if(num.matches("[0-9a-f]+"))
			System.out.println("Hexa Decimal");
		else
			System.out.println("Invalid");
	}

}
