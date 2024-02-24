package com.javapractise;

public class J17RegularExpressionAssignment {
	public static void main(String[] args) {
//		Binary or not
		String binary = "010";
		String octal = "52";
		String hexaDecimal = "a";
		String date = "28/06/2000";
		System.out.println(binary.matches("[01]+"));
		System.out.println(octal.matches("[0-7]+"));
		System.out.println(hexaDecimal.matches("[0-9a-f]+"));
		System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
		
	}

}
