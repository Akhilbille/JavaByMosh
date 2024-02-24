package com.javapractise;

public class J84FinalDemo {
	
	static void meth1()throws Exception
	{       
        try {
        	
        	throw new Exception();
        }
        finally {
        	 System.out.println("Finally block executed");
        }     
     }
        
    
    
    public static void main(String[] args)  
    {
    	try {
    		
    		meth1();
    	}
    	catch(Exception e ) {
    		System.out.println(e);
    	}
    } 

	}


