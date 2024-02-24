package com.javapractise;


@interface MyAnno{
	String name();
	String project();
	String version() default "13";
}

@MyAnno(name="Akhil",project="Bank")
public class J105UserDefinedAnntations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
