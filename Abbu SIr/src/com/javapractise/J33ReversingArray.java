package com.javapractise;

public class J33ReversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int newArr[] = new int[5];
		int index =0;
		for (int i=arr.length-1;i>=0;i--) {
			newArr[index] = arr[i]; 
			index++;
		}
		for(int x:newArr) {
			System.out.print(x+",");
		}
	}

}
