package com.javapractise;



class Rectangle{
	int length;
	int breadth;
	
	int area() {
		return length*breadth;
	}
	
	int perimeter() {
		return 2*(length+breadth);
	}
	

}

public class J47RectangleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle objRect = new Rectangle();
		
		objRect.length = 2;
		objRect.breadth = 4;
		
		System.out.println(objRect.area());
		System.out.println(objRect.perimeter());
		

	}

}
