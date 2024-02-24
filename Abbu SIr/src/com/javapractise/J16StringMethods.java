package com.javapractise;

public class J16StringMethods {
	public static void main(String[] args) {
		String website = "https://www.google.com";
		
		int length = website.length();
		System.out.println(length);
		
		String websiteLowercaseToUpperCase = website.toUpperCase();
		System.out.println(websiteLowercaseToUpperCase);
		
		String websiteWithExtraSpaces = "  "+website+"  ";
		String trimmedWebsite = websiteWithExtraSpaces.trim();
		System.out.println(trimmedWebsite);
		
		String domainName = website.substring(8);
		System.out.println(domainName);
		
		String replaceWebsite = website.replace("google", "meta");
		System.out.println(replaceWebsite);
		
		boolean isSecureWebsite = website.startsWith("https");
		System.out.println(isSecureWebsite);
		
		boolean isCommercialWebsite = website.endsWith("com");
		System.out.println(isCommercialWebsite);
		
			
	}

}
