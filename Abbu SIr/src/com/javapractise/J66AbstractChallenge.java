package com.javapractise;

abstract class Shape{
	
	abstract double perimeter();
	abstract double area();
}

class CircleSub extends Shape{
	
	int radius;
	CircleSub(int r){
		this.radius = r;
	}
	
	double perimeter() {
		return 2*Math.PI*radius;
	}
	
	double area() {
		return 2*Math.PI*radius;
	}
	
}

class RectangleSub extends Shape{
	
	int length;
	int breadth;
	public RectangleSub(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;			
	}
	
	double area() {
		return length * breadth;
	}
	
	double perimeter() {
		return 2*(length + breadth);
	}
}

public class J66AbstractChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleSub objRect = new RectangleSub(1, 2);
		System.out.println(objRect.area());

		
		
		

	}

}
