package com.javapractise;

interface LambdaMul{
	int display(String s1,String s2);
}
public class J110MultipleParMethRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaMul l = String::compareTo;
		System.out.println(l.display("hello", "hello"));;

	}

}
