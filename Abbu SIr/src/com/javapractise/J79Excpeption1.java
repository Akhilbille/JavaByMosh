package com.javapractise;

public class J79Excpeption1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a,b,c;
			a = 10;
			b = 0;
			c = a/b;
			System.out.println("C: " + c);
		}
		catch(ArithmeticException e){
			System.out.println(e); 
		}
		System.out.println("Thank You... Bye");

	}

}
