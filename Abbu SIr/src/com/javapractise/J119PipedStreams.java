package com.javapractise;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Produce extends Thread 
{
	OutputStream os;
	public Produce(OutputStream o) 
	{
		os = o;
	}
	public void run() 
		{
		int count = 0;
		while(true) 
			{
			try 
				{
				os.write(count);
				os.flush();
				
				System.out.println("Producer : " + count);
				System.out.flush();
				
				Thread.sleep(10);
				count++;
				} 
			catch(Exception e) {}
			}
		
		}
}

class Consume extends Thread{
	InputStream is;
	public Consume(InputStream i) {
		is=i;
	}
	public void run() {
		int x;
		while(true) {
			try {
				x = is.read();
				System.out.println("Consumer : "+ x);
				System.out.flush();
				Thread.sleep(10);
				
				
			}
			catch(Exception e) {}
		}
	}
}

public class J119PipedStreams {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		pos.connect(pis);
		
		Produce p = new Produce(pos);
		Consume c = new Consume(pis);
		
		p.start();
		c.start();
		


	}

}
