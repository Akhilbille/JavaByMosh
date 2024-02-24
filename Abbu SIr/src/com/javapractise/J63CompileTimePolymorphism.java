package com.javapractise;

// Compile Time Polymorphism using Method Overloading

class Maximum{
	public int max(int n, int n1) {
		return (n>n1?n:n1);
	}
	
	public int max(int n, int n1, int n2) {
		return ((n>n1 && n > n2)?n:(n1>n2)?n1:n2);
	}
}

public class J63CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maximum maxobj = new Maximum();
		System.out.println(maxobj.max(1, 2));
		System.out.println(maxobj.max(1, 2, 3));
		

	}

}
