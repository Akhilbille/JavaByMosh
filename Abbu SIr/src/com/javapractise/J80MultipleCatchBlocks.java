package com.javapractise;

public class J80MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = {1,2,3,8,5,6};
			int res = arr[5]/arr[3];
			System.out.println(res);
			
			System.out.println(arr[9]);			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Dont divide number with Zero" + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of range");
		}
		finally {
			System.out.println("Bye...Thanks");
		}
		

	}

}
