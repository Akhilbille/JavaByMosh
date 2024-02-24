package com.javapractise;

public class J128GenericMethods {
	
	
	static <E> void show(E[] obj) {
		for(E x: obj) {
			System.out.println(x);
		}		
	}
	
	//Using variable arguments and can apply bonding
	static <E extends Number> void display(E... obj) {
		for (E x:obj) {
			System.out.println(x);
		}
	}
	
//	Generic Arguments
	static void zerox(MyArray<?> obj) {
		obj.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"a","b","c","d"};
		show(s);
		show(new Integer[] {1,2,3,1});
		display(1,2,3,1);
/*		display("a","b","c"); Dowsn't allow strings since it is bounded 
		with Number so it can access only subclass of number */
		MyArray<String> str = new MyArray<>();
		str.append("a");
		str.append("b");
		zerox(str);
		
		
		
		
		
		

	}

}
