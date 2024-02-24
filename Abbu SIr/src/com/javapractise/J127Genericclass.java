package com.javapractise;

class MyData2<T>{
	private T obj;
	
	public void set(T v) {
		obj = v;
	}
	
	public T get() {
		return obj;
	}
}

public class J127Genericclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData2<String> s = new MyData2<>();
		s.set("Akhil");
		System.out.println(s.get());
		

	}

}
