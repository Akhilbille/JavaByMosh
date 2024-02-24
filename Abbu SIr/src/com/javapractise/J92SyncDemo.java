package com.javapractise;


class MyData1
{
//    synchronized
    synchronized public void display(String str)
    {
            for(int i=0;i<str.length();i++)
            {
                 System.out.print(str.charAt(i));
                 try{Thread.sleep(100);}catch(Exception e){}
            }
        
    }
}

class MyThread11 extends Thread
{
    MyData1 d;
    public MyThread11(MyData1 d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Hello World");
    }
            
    
}

class MyThread22 extends Thread
{
    MyData1 d;
    public MyThread22(MyData1 d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Welcome All");
    }
            
    
}

public class J92SyncDemo 
{
    public static void main(String[] args) 
    {
        MyData1 data=new MyData1();
        
        MyThread11 t1=new MyThread11(data);
        MyThread22 t2=new MyThread22(data);
        
        t1.start();
        t2.start();
        
        
    
    }    
}
