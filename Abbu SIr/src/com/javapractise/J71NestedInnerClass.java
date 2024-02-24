package com.javapractise;

class Outer{
	int x = 10;
	
	class Inner{
		int y = 5;
		void innerDisplay() {
			System.out.println(x);
		}
		
	}
	void OuterDisplay() {
		Inner obj = new Inner();
		obj.innerDisplay();
	}
}
public class J71NestedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer obj1 = new Outer();
		obj1.OuterDisplay();
		

	}

}
