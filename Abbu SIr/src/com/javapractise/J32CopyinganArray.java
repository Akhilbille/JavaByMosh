package com.javapractise;

public class J32CopyinganArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int newArr[] = new int[6];
		for(int i =0;i < arr.length;i++) {
			newArr[i] = arr[i];
		}
		for(int x: newArr) {
			System.out.print(x + ",");
		}
		
		
		

	}

}
