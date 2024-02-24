package com.javapractise;

@FunctionalInterface
interface Lambda1{
	String reverse(String s);
}

public class J109MethodReferencingUsingInstance {
	
	public String reverseMethod(String s) {
		StringBuffer s1 =new StringBuffer(s);
		String s2 = new String(s1.reverse());
		return s2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		J109MethodReferencingUsingInstance obj = new J109MethodReferencingUsingInstance();
		Lambda1 rev = obj::reverseMethod;
		System.out.println(rev.reverse("Hello WOrld"));

	}

}
