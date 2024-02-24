package com.javapractise;

class TV{
	void switchOn() {
		System.out.println("TV ON by Button");
	}
	void changeChannel() {
		System.out.println("Channel changed by KNOB");
	}
}

class SmartTV extends TV{
	void switchOn() {
		System.out.println("TV on by remote");
	}
	void changeChannel() {
		System.out.println("Channel Changed by remote");
	}
	
	void browsing() {
		System.out.println("Smart TV browsing");
	}
}
public class J61InheritenceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTV obj = new SmartTV(); // Method Overriding
		obj.browsing();
		obj.changeChannel();
		
		
		//Dynamic Dispatching
		TV obj2 = new SmartTV(); // Dynamic dispatch (Here smart can be called as TV)
		//SmartTv obj3 = new TV()  (But we cannot call normal TV as smart TV )
		//obj2.browsing() (Here when we tell smart TV as TV then it wont take methods of Smart TV
		//                     Since we are referencing OLD TV  )
		obj2.changeChannel(); //Even though we are assumed as TV but the object is smart tv 
		//                     so the common methods will works)
		
		
	}

}
