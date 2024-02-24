package com.javapractise;

public class J43VariableArguments {
	
	static void show(int ...n) {
		for (int x: n) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		show(1,2,3,4,5);
		show(new int[] {1,2,3,4,5,6});
		

	}

}
