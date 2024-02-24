package com.javapractise;

public class J18RegularExpressionAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Removing special Characters from string
		String string = "a sdfkjb asdfablsdf@#@#&T";
		System.out.println(string.replaceAll("\\W", ""));
		
		//Removing Extra spaces
		String text = "  saddf     dfsadjf   dsfadfn edfeyudsf98   ";
		text = text.trim();
		text = text.replaceAll("\\s+"," ");
		System.out.println(text);
		
		//Calculating number of words
		System.out.println((text.split("\\s")).length);
		String words[]=(text.split("\\s"));
		System.out.println(words[0].length());
		
		

	}

}
