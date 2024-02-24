package com.javapractise;

abstract class AbsSuper{
	public AbsSuper() {
		System.out.println("Constructor of Abstract Super Class");
	}
	
	void meth1() {
		System.out.println("Meth1 From SUper Class");
	}
	
	abstract void meth2();
	
	
}

class AbsSub extends AbsSuper{ // Concrete method since we have over raided method
	
	void meth2() {
		System.out.println("Meht2 From Abs Sub CLass");
	}
}

public class J65AbstractClass {

	public J65AbstractClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsSub obj = new AbsSub();
		obj.meth1();
		obj.meth2();
		
	}

}
