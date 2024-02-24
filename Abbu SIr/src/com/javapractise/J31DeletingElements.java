package com.javapractise;

public class J31DeletingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,6};
		int index = 1;
		int n = 6;
		for (int i = index; i < arr.length-1;i++) {
			arr[i] = arr[i+1];
			
		}
		arr[arr.length-1] = 0;
		for(int x: arr) {
			System.out.print(x+",");
		}

	}

}
