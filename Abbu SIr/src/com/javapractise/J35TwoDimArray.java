package com.javapractise;

import java.util.Scanner;

public class J35TwoDimArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int arr[][]= {{2,35,4,5},{2,3,5,41},{2,5,23,4},{21,2,3,60}};
		for(int i=0;i< arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + "  ");
								
			}
			System.out.println();
		}
		
//		Accessing array using For each loop
		for (int x[] : arr) {
			for (int j: x) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
//		Creating a Jagged array
		int arrayJagged[][] = new int[3][];
		arrayJagged[0] = new int[2];
		arrayJagged[1] = new int[4];
		arrayJagged[2] = new int[3];
		
//		Initializing data into a jagged array
		for(int i=0;i<arrayJagged.length;i++) {
			for (int j =0; j<arrayJagged[i].length;j++) {
				arrayJagged[i][j] = input.nextInt();
			}
		}
		
//		Accessing Jagged Array
		for(int i=0;i<arrayJagged.length;i++) {
			for (int j =0; j<arrayJagged[i].length;j++) {
				System.out.print(arrayJagged[i][j]);
			}
			System.out.println();
		}
		
	}

}
