package com.javapractise;
import java.util.*;
public class J129ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8));
		ArrayList<Integer> ar1 = new ArrayList<Integer>(List.of(10,11,12));
		ar.add(9);//Adds elements at the end
		System.out.println(ar);
		ar.add(2,10);//add(index,e) inserts elements at index of 2
		System.out.println(ar);
		ar.addAll(7,ar1);
		System.out.println(ar);
		
		ar.remove(1);
		System.out.println(ar);
		System.out.println(ar.get(0));
		ar.set(0, 0);
		System.out.println(ar);
		System.out.println(ar.subList(0, 5));
		System.out.println(ar.lastIndexOf(10));
		
		//Acessing array using array Index values
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i));
		}
		
		for(Integer x:ar) {
			System.out.println(x);
			
		}
		
		System.out.println("For Iterator");
		for(Iterator<Integer> it = ar.iterator();it.hasNext();) {
			System.out.println(it.next());
			
		}
		
		
		//For each
		System.out.println("Using For Each loop");
		ar.forEach(n->System.out.print(n));
		

	}

}
