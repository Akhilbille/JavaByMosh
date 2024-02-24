
package com.javapractise;

public class J15RegularExpression {
	public static void main(String[] args) {
		String email = "akhil1213@gmail.com";
		boolean isGmail = email.contains("gmail");
		System.out.println(isGmail);
		int index = email.indexOf("@");
		String userName = email.substring(0,index);
		System.out.println(userName);
		String domainName = email.substring(index+1);
		System.out.println(domainName);
		
	
	}

}
