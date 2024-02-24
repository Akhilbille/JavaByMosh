package com.javapractise;

class Circle2{
	public int radius;
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	
	
}

class Cylinder1 extends Circle2{
	public int height;
	
	public double volume() {
		return area()*height;
		
		
	}
}

public class J56Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle2 objcircle = new Circle2();
		Cylinder1 obj2 = new Cylinder1();
		obj2.radius = 7; 
		obj2.height = 10; 
		System.out.println(obj2.radius);
		System.out.println(obj2.perimeter());
		System.out.println(obj2.area());
		System.out.println(obj2.volume());
		
		

	}

}
