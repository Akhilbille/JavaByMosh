package com.javapractise;



public class J76finalVariable {
	
	final int MIN = 10;
	static final int NORMAL;
	final int MAX;
	
	static {
		NORMAL = 10;
	}
	
	J76finalVariable(){
		MAX = 15;
		//MIN = 10; Final variable cannot be modified
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
