package com.seed.multithreading;
 
class simplethread implements Runnable 
 {
	public void run()
    {
		for(int i=0;i<3;i++)	
			System.out.println("Hello "
		+Thread.currentThread().getName());
	System.out.println("Hello "
	+Thread.currentThread().getName()+" "+"is done");
    }	
 }
public class Mythread
	{
	public static void main(String[] args) 
			throws InterruptedException {
//System.out.println("*****First way*************");
simplethread m1=new simplethread();
Thread t1=new Thread(m1);
	
//System.out.println("*****Second way*************");
Runnable r=new simplethread();
Thread t2=new Thread(r);
		
//System.out.println("*******3rd way***********");
Thread t3=new Thread(new simplethread());
			
System.out.println("*******************");
	t1.setName("login");
	t1.start();
	t1.suspend();
	//wait till t1 completes its execution
	//t1.join();
	t1.suspend();		
	t2.start();
	t3.start();
	t1.resume();	
	}

}

	