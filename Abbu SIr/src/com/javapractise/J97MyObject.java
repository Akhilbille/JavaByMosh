package com.javapractise;

class MyObject{
	
	public String toString() {
		return "My Object";
	}
	
	public int hashCode(){
		return 123;
	}
	
	public boolean equals(MyObject o) {
		return (this.hashCode()== o.hashCode());
	}
	
	
}

public class J97MyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject o1 = new MyObject();
		MyObject o2 = new MyObject();
		System.out.println(o1);
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));

	}

}
