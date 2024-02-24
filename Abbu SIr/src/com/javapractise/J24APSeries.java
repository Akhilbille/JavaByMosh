package com.javapractise;

public class J24APSeries {

	public static void main(String[] args) {
		int a = 3;
		int d = 5;
		
		for (int digits = 10; digits > 0; digits--) {
			System.out.println(a+d);
			a = a+d;
		}
		
	}
}
