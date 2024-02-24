package com.javapractise;

public class J14CreatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		by using group of characters
		char ch[] = {'A','B','C','D'};
		String alphabets = new String(ch);
		System.out.println(alphabets);
		
//		by using group of bytes
		byte num[] = {97,98,99,100};
		String lowerLetters = new String(num);
		System.out.println(lowerLetters);
		
//		by using direct string
		String name = new String("Akhil");
		String name1 = "Akhil";
		String name2 = "Akhil";
		System.out.println(name.equals(name1));
		System.out.println(name2 == (name1));
				
		
	}

}
