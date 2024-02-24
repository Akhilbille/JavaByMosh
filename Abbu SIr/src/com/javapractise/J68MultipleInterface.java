package com.javapractise;

class Phone{
	void call(){
	System.out.println("Calling from Phone");	
	}
	
	void sms() {
		System.out.println("Sending SMS from Smart Phone");
	}
}

interface iCamera{
	void click();
	void record();
}

interface iMusic{
	void play();
	void stop();
}

class SmartPhone extends Phone implements iCamera,iMusic{
	
	 void videoCall() {
		 System.out.println("Video Calling From Smart Phone");
	 }
	 
	 public void click() {
		 System.out.println("Clicking Photo from Smart phone");
	 }
	 
	 public void record() {
		 System.out.println("Recording voideo from the Smart Phone");
	 }
	 
	 public void play() {
		 System.out.println("Playing Music from Smart Phone");
		 
	 }
	 
	 public void stop() {
		 System.out.println("Stop Playing Music");
	 }
}

public class J68MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone samsung = new SmartPhone();
		samsung.call();
		samsung.videoCall();
		samsung.click();
		samsung.play();
		

	}

}
