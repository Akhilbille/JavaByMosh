package com.javapractise;

public class J42CalaculateAreasMethodOverLoading {
	static float area(float l, float b) {
		return l*b;
	}
	
	static double area(float r) {
		return Math.PI*r*r;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(2f));
		

	}

}
