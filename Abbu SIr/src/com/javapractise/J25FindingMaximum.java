package com.javapractise;

public class J25FindingMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,15};
		int big = arr[0];
		for(int x:arr) {
			if (x>big)
				big =x;
		}
		System.out.println(big);

	}

}
