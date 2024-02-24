package com.javapractise;

public class J39AccesingMethods {
	 int sum(int n,int n2) {
		return n+n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int num2 = 3;
		J39AccesingMethods am = new J39AccesingMethods();
		int c = am.sum(num, num2);
		System.out.println(c);
		
		

	}

}
