package com.javapractise;

interface Test{
	
	void meth1();
	void meth2();
	
	
}

class My implements Test{
	
	public void meth1() {
		System.out.println("Meth1 from My class ");
	}
	
	public void meth2() {
		System.out.println("Meth2 from My class");
	}
	
	void meth3() {
		System.out.println("Meth3 from My class");
	}
	
}

public class J67InterfacesPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new My(); // Dynamic Dispatching
		
		obj.meth1();
		obj.meth2();
		

	}

}
