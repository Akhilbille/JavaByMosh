package com.javapractise;

@FunctionalInterface
interface Dummy{
	public void dummyMethod();
		
	
}
class Super1{
	public void show() {
	}
}

class Base1 extends Super1{
	
	@Override
	public void show() {
		System.out.println("Displaying data");
		
	}
	
	@Deprecated
	public void showOld() {
		System.out.println("THis is an old method which is going to get removed");
	}
}

public class J104PredifinedAnnotations {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base1 b1 = new Base1();
		
		
		b1.showOld();

	}

}
