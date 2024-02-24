package com.javapractise;

public class J22SumOfN {
	public static void main(String[] args) {
		int num = 1234;
		int rem;
		int sum=0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			sum += rem;
			
		}
		System.out.println(sum);
	}

}
