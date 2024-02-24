package com.javapractise;

public class J34IncreasingSizeArray {
	public static void main (String[] args) {
		int arr[] = {1,2,3,4,5};
		int arrNew[] = new int[2*arr.length];
		for(int i = 0;i<arr.length;i++) {
			arrNew[i] = arr[i];
			}
		arr=arrNew;
		
		
	}

}
