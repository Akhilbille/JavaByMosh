package com.javapractise;

class ParentParameterized{
	public ParentParameterized() {
		System.out.println("Parent Default Constructor");
	}
	public ParentParameterized(int x) {
		System.out.println("Param PArent Construcor" + x);
	}
}


class ChildParameterized extends ParentParameterized{
	public ChildParameterized() {
		System.out.println("Child Default Constructor");
	}
	public ChildParameterized(int y) {
		System.out.println("Child Parameter Constructor" + y);
	}
	
	public ChildParameterized(int x, int y) {
		super(x);
		System.out.println("Child 2  Params Constructor" + y);
	}
}
public class J58InheritenceParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildParameterized obj = new ChildParameterized();
		System.out.println("----------------------------------");
		ChildParameterized obj1 = new ChildParameterized(1);
		System.out.println("----------------------------------");
		ChildParameterized obj2 = new ChildParameterized(1,2);
		
		System.out.println("----------------------------------");

	}
 
}
