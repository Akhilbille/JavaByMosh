package com.javapractise;

class Cylinder{
	private int radius;
	private int height;
	
	public Cylinder() {
		radius = 1;
		height = 1;
		
	}
	public Cylinder(int r) {
		radius = r;
		
	}
	public Cylinder(int r, int h) {
		radius = r;
		height = h;
	}
	
	public void setRadius(int r) {
		radius =r ;
	}
	public void setHeight(int h) {
		height = h;
	}
	public void setDimensions(int r, int h ) {
		radius =r;
		height = h;
	}
	
	public int getRadius() {
		return radius;
	}
	public int getHeight() {
		return height;
	}
	
	public double area() {
		return (2*Math.PI*radius*height + (2*Math.PI*radius*radius)	);
	}
	
}

public class J51CylinderCLass {
	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1.getHeight());
		System.out.println(obj1.getRadius());
		System.out.println(obj1.area());
		Cylinder obj2 = new Cylinder(2,4);
		System.out.println(obj2.getHeight());
		System.out.println(obj2.getRadius());
		System.out.println(obj2.area());
		
	}

}
