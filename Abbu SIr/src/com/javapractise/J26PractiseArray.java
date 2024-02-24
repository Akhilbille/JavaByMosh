package com.javapractise;

public class J26PractiseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		for (int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		Accessing an array using for each loop
		for(int x: arr) {
			System.out.println(x);
		}
		
	}

}
