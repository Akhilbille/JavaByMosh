package com.javapractise;

public class J5ArithematicOperator {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
//		byte + short + int  = Int
		byte b = 10;
		short s = 10;
		int res = b + s;
		res = res + b;

//		float + integer + long = float
		float f = 10l + 10.f;
		float f1 = 10 + 10.f;
		System.out.println(f1);

//		char + short + int = integer
		char c ='A';
		int i1 = c;
		short s1 = 1;
		int result = c * s1;
		System.out.println(result);
		System.out.println(i1);



//Same thing works for sub,mul

		int num1 = 100;
		char c2 = ' ';
		int res1 = num1/c2;
		int c3 = c2;
		System.out.println("res1 for div: "
		+ res1);
		System.out.println("res1 for div: " + c3);

//		Modulo Division
		int numerator = 12;
		int denominator = 3;
		int remainder = numerator % denominator;
		System.out.println(remainder);

//		Java Supports Modulo Division Operator for Decimal Values also
//		float numerator = 12.1f;
//		int denominator = 3;
//		float remainder = numerator % denominator;
//		System.out.println(remainder);

	}

}
