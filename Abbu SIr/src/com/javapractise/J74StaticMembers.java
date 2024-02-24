package com.javapractise;

class HondaCity{
	static int  price = 10000;
	int a = 10,b = 20;
	
	static void meth1() {
		System.out.println(price);
	}
}

public class J74StaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondaCity h1 = new HondaCity();
		System.out.println(h1.price);
		System.out.println(h1.a);
		h1.price = 10; // If static changed it effects all objects 
		
		HondaCity h2 = new HondaCity();
		System.out.println(h2.price);
		System.out.println(h2.a);
				

	}

}
