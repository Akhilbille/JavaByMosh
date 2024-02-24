package com.javapractise;



class StackOverFlowException extends Exception{
	
	public String toString() {
		return "Sorry...It's overflowed Cannot push data";
	}
}

class StackUnderFlowException extends Exception{
	
	public String toString() {
		return "Sorry.. Nothing to access push some data to access";
	}
}

public class J85StackChallenge {
	static int stack[] = new int[5];
	static int top = -1;
	
	static void push(int n) throws StackOverFlowException{
		if (top == 5)
			throw new StackOverFlowException();	
		
		top++;	
		stack[top] = n;			
		
		
	}
	
	static void pop() throws StackUnderFlowException{
		if (top == -1)
			throw new StackUnderFlowException();
			
		stack[top] = 0;
		top--;
		
		
	}
	
	static  void displayStack() {
		System.out.println("-------Printing Stack-------");
		for(int x: stack) {
			
			System.out.println(x);
		}
		System.out.println("--------------");
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		displayStack();		
		push(2);
		push(2);
		push(2);
		push(2);		
		push(2);
		displayStack();		
		pop();
		pop();
		displayStack();		
		pop();
		pop();
		pop();
		displayStack();		
		
		
		
		
		
		
		
		

	}

}
