package com.javapractise;

public class J45Recursion {
	static void fun(int n) {
		if (n>0) {
			fun(n-1);
			System.out.println(n);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3);

	}

}
