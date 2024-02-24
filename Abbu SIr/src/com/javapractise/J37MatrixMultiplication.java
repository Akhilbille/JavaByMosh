package com.javapractise;

public class J37MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int arr3[][] = new int[3][3];
		for(int i = 0; i<arr.length;i++) {
			for (int j=0; j<arr[0].length;j++) {
				for (int k = 0; k< arr[0].length;k++) {
					arr3[i][j] += arr[i][k]*arr2[k][j];
				}
				
				
			}
			
		}
		for(int x[]: arr3) {
			for(int y: x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		

	}

}
