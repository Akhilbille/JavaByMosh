package com.javapractise;

class SuperFinal{
	final void meth1() {
		System.out.println("Hello");
	}
}

class SubFinal extends SuperFinal{
//	void meth1() {
//		
//	} cannot over ride this method but we can create new methods
	void meth2() {
		System.out.println("Hello World");
	}
}

public class J77FinalMethod {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
