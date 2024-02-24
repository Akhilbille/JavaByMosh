package com.javapractise;

public class J100StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Hello");
		StringBuffer str1 = new StringBuffer("Hello");
		StringBuilder str2 = new StringBuilder("Hello");
		
		str.concat("World");
		str1.append("World");
		str2.append("World");
		
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

	}

}
