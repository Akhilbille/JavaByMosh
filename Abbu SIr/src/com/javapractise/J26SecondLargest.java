package com.javapractise;

public class J26SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5};
			int max1 = arr[0];
			int max2 = arr[0];
			
			for (int x: arr) {
				if (x > max1) {
					max2 =max1;
					max1 = x;
				}
			}
			
			System.out.println(max2);

	}

}
