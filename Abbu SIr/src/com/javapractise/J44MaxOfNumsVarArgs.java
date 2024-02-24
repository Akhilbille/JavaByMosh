package com.javapractise;

public class J44MaxOfNumsVarArgs {
	static int max(int ...nums) {
		if (nums.length == 0) return Integer.MIN_VALUE;
		int m = nums[0];
		for (int x: nums) {
			if (x > m) {
				m = x;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(1,2,3,4,5,6));

	}

}
