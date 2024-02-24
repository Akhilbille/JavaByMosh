package com.javapractise;

interface TestInterface{
	
	int X =10;
	void meth1();
	void meth2();
	private void meth4() {
		
	}
	default void meth3() {
		meth4();
	}
	
}

public class J70DosAndDontsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
