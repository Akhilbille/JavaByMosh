package com.javapractise;

interface MyLambda1{
	void display(String s);
}

public class J108MethodReference {
	public static void reverse(String s) {
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		System.out.println(str);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLambda1 printlnReference = System.out::println;
		MyLambda1 reversingString = J108MethodReference::reverse;
		printlnReference.display("Hello WOrld");
		reversingString.display("Hello WOrld");

	}

}
