package com.javapractise;

class LocalOuter{
	
	void display() {
		 class LocalInner{
			
			void innerDisplay() {
				System.out.println("Local Inner Class Display");
			}
			
		}
		LocalInner obj = new LocalInner();
		obj.innerDisplay();
	}
}
public class J72LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalOuter obj1 = new LocalOuter();
		obj1.display();

	}

}
