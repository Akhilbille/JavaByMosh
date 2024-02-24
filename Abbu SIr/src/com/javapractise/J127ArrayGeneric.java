package com.javapractise;


class MyArray<T>{
	@SuppressWarnings("unchecked")
	T list[] = (T[]) new Object[5];
	int len = 0;
	
	public void append(T v) {
		list[len++] = v;
	}
	
	public void display() {
		for(int i =0 ;i<len;i++) {
			System.out.println(list[i]);
		}
	}
}

public class J127ArrayGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray<Integer> ma = new MyArray<>();
		ma.append(10);
		ma.append(1);
		ma.append(11);
		ma.append(31);
		ma.display();
		
		

	}

}
