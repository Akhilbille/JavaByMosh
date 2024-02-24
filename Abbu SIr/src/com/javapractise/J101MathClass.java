package com.javapractise;

public class J101MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Absolute
		System.out.println(Math.abs(-123));
		
		//Square Root
		System.out.println(Math.sqrt(-1));
		System.out.println(Math.sqrt(4));
		
		//Cube root
		System.out.println(Math.cbrt(27));
		
		//Exact Decrement
		int i = Integer.MIN_VALUE;
		System.out.println("Minimum Integer Value : " + i);
		//This results error since there is no less value than integer minimum value
		//System.out.println("Exact Decrement : " + Math.decrementExact(i));
		System.out.println(--i); //It is resulting Maximum value
		
		//Floor Division
		System.out.println(Math.floorDiv(10, 3));
		
		//Floor
		System.out.println(Math.floor(12.3));
		
		//ceil
		System.out.println(Math.ceil(12.3));
		
		
		//log10
		System.out.println(Math.log10(100));
		
		//Maximum of two numbers 
		System.out.println(Math.max(100, 20));
		
		//Random
		System.out.println(Math.ceil(Math.random()*10));
		
		//Power
		System.out.println(Math.pow(2, 3));
		
		

	}

}
