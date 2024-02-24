package com.javapractise;

@FunctionalInterface
interface LambdaPar{
	int add(int n, int m);
	
}

public class J107ParameterizedLambdaExpression {
	static int instanceVariable = 19;
	
	public static void acceptingLambdaExp(LambdaPar p) {
		System.out.println(p.add(0, 0));;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		LambdaPar r1 = (a,b) -> {return a+b;}; Here return is optional check in next line
		LambdaPar r = (a,b) -> a+b;
		System.out.println(r.add(1, 2));
		
		//We can create local variables and access them
		//Writing multiple lines 
		int al = 10;
		LambdaPar r1 = (a,b) -> {
			int c = 15;
//			al++; Cannot be modified since they should be final or effectively final
			c++;
			System.out.println(instanceVariable++);
			System.out.println("Addition");
			int res = a+b;
			return res;
		};
		System.out.println(r1.add(15, 20));;
		
		//Passing LamdaExpression as parameter
		
		
		LambdaPar r2 = (a,b)-> (a+b);
		acceptingLambdaExp(r2);
		
		
		
		

	}

}
