package com.javapractise;

class Circle1{
	private double radius ;
	
	public double getRadius() {
		return radius;
				
	}
	public void setRadius(double r) {
		if (r > 0) radius = r;
		else 
			radius = 0;		
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	
}

public class J49CircleDataPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 obj = new Circle1();
		
		System.out.println(obj.getRadius());
		obj.setRadius(2.2);
		System.out.println(obj.getRadius());
		System.out.println(obj.area());
		
		

	}

}
