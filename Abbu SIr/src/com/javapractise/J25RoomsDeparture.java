package com.javapractise;
import java.util.*;


public class J25RoomsDeparture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int rooms[]= new int[80];
		int downFront[] = new int[40];
		int downback[] = new int[40];
		int topFront[] = new int[40];
		int topBack[] = new int[40];
				 
		System.out.print("Enter number of departures: ");
		int n= input.nextInt();
		for (int i =0;i<n;i++) {
			rooms[i] = input.nextInt();
		
		}
		
		
		int downfrontIndex = 0;
		for(int i =0;i<rooms.length;i++) {
			if (rooms[i] > 100 && rooms[i] <200 && rooms[i] %2!=0) {
				downFront[downfrontIndex] = rooms[i];
				downfrontIndex++;
			}		
		}
		
		
		int downbackIndex = 0;
		for(int i =0;i<rooms.length;i++) {
			if (rooms[i] > 100 && rooms[i] <200 && rooms[i] %2==0) {
				downback[downbackIndex] = rooms[i];
				downbackIndex++;
			}		
		}
		
		int topFrontIndex = 0;
		for(int i =0;i<rooms.length;i++) {
			if (rooms[i] >= 200 && rooms[i] <300 && rooms[i] %2!=0) {
				topFront[topFrontIndex] = rooms[i];
				topFrontIndex++;
			}		
		}
		
		int topBackIndex = 0;
		for(int i =0;i<rooms.length;i++) {
			if (rooms[i] >= 200 && rooms[i] <300 && rooms[i] %2==0) {
				topBack[topBackIndex] = rooms[i];
				topBackIndex++;
			}		
		}
		
		System.out.println();
		System.out.println();
		java.util.Arrays.sort(downFront);
		java.util.Arrays.sort(downback);
		java.util.Arrays.sort(topFront);
		java.util.Arrays.sort(topBack);
		System.out.println("-------------------Down Front------------------------");
		for(int x: downFront) {
			if (x!=0)
			System.out.print(x+",");
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("-------------------Down Back------------------------");
		for(int x: downback) {
			if (x!=0)
			System.out.print(x+",");
		}
		System.out.println("-------------------------------------------");
		
		System.out.println("-------------------Top Front------------------------");
		for(int x: topFront) {
			if (x!=0)
			System.out.print(x+",");
		}
		System.out.println("-------------------------------------------");
		
		System.out.println("-------------------Top Back------------------------");
		for(int x: topBack) {
			if (x!=0)
			System.out.print(x+",");
		}
		System.out.println("-------------------------------------------");

	}

}
