package com.javapractise;

abstract class MyOuter{
	abstract void meth1();
	
}

class AbstractOuter{
	public void meth() {
		MyOuter m = new MyOuter() {
			
			@Override
			void meth1() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
				
			}
		};
		m.meth1();
	}
}



public class J73AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractOuter absouter = new AbstractOuter();
		absouter.meth();

	}

}
