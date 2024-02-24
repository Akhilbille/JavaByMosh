package com.javapractise;

class Rectangle3{
	int length;
	int breadth;
	
	public Rectangle3(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void display() {
		System.out.println("Length : " + this.length);
		System.out.println("Breadth : " + this.breadth);
		
	}
	
}

public class J59ThisClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle3 obj = new Rectangle3(1,2);
		obj.display();

	}

}
