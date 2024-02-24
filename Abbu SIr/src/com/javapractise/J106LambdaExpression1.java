package com.javapractise;

interface MyLambda {
	void display();
}

//class My1 implements MyLambda{
//	public void display() {
//		System.out.println("Hello World");		
//	}
//}

public class J106LambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLambda m1 = ()->{	System.out.println("Hello World");};
		m1.display();
		

	}

}
