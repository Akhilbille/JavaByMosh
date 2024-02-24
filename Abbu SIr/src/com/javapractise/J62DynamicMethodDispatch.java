package com.javapractise;

class ParentOrSuper{
	void meth() {
		System.out.println("Meth of Parent or Super");
	}
	
	void meth1() {
		System.out.println("Meth1 of Parent or Super");
		
	}
	
	void meth2() {
		System.out.println("Meth2 of Parent or Super");
	}
	
}

class ChildOrSub extends ParentOrSuper{
	void meth1() {
		System.out.println("Meth1 of Child or Sub");
	}
	void meth2() {
		System.out.println("Meth2 of Child or Sub");
	}
	void meth3() {
		System.out.println("Meth3 of Child or Sub");
	}
	
}

public class J62DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentOrSuper  obj = new ChildOrSub();
		obj.meth();
		obj.meth1();
		obj.meth2();
		// obj.meth3(); // results error
	}

}
