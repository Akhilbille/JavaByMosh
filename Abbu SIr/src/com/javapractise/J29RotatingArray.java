package com.javapractise;

public class J29RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,8,3,1,5,6};
		int temp = arr[0];
		int tempArr[] = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			if (i == arr.length-1) {
				tempArr[i] = temp;				
			}
			else
			tempArr[i]	= arr[i+1];
		}
		for(int x: tempArr) {
			System.out.println(x);
		}
		

	}

}
