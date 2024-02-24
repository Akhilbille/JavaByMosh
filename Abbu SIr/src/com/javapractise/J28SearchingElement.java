package com.javapractise;

public class J28SearchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int search = 2;
		for (int x:arr) {
			if(search == x) {
				System.out.println("Found IT");
				System.exit(0);
			}
			
			
		}
		System.out.println("Missing");

	}

}
