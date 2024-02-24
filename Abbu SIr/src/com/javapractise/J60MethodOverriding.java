package com.javapractise;

class Super{
	public void display() {
		System.out.println("Hello");
	}
}

class Sub extends Super{
	public void display() {
		System.out.println("Hello World");
	}
}


public class J60MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super obj = new Super();
		obj.display();
		Sub obj1 = new Sub();
		obj1.display(); //Method Overriding
		
		//Dynamic Method Dispatching
		Super obj3 = new Sub();
		obj3.display();

	}

}
