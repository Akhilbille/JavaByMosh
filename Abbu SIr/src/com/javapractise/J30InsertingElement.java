package com.javapractise;

import java.util.Scanner;

public class J30InsertingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		int n = 6;
		for(int i = 0; i<6;i++) {
			arr[i] = input.nextInt();
		}
		int index = 2;
		int x = 15;
		for (int i = n;i > n;i--) {
			arr[i]=arr[i-1];
		}
		arr[index] = x;
		for(int elements: arr) {
			System.out.print(elements + ",");
			
		}
		

	}

}
