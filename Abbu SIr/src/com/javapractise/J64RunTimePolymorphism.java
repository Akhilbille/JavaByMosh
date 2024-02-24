package com.javapractise;

class ParentClass{
	
	public void display() {
		System.out.println("Hello");
	}
}

class SubClass extends ParentClass{
	
	public void display() {
		System.out.println("Hello World");
	}
}

public class J64RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass obj = new SubClass();
		obj.display();

	}

}
