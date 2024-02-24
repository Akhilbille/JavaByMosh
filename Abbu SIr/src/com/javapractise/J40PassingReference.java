package com.javapractise;

public class J40PassingReference {
	void modifyArr(int a[],int index) {
		a[index] = 5;
		
	}
	void modifyValue(int x,int value) {
		x =value;
		System.out.println("x" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		J40PassingReference pr = new J40PassingReference();
		pr.modifyArr(arr, 0);
		System.out.println(arr[0]);
		int x = 12;
		int value = 50;
		pr.modifyValue(x, value);
		
		System.out.println("x" + x);
	}

}
