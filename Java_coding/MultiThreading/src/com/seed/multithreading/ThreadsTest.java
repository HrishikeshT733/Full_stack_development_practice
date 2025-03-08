package com.seed.multithreading;
class DemoThreadBasic extends Thread
{
	@Override
	public void run()
    {
		for(int i=0;i<3;i++)	
	System.out.println("Hello "
	+Thread.currentThread().getName());
	}
}
public class ThreadsTest 
{
	public static void main(String[] args) 
	{
		DemoThreadBasic t1 = new DemoThreadBasic();
		DemoThreadBasic t2 = new DemoThreadBasic();		
		t1.setPriority(1);
		t2.setPriority(10);
		t1.setName("Papu");
		t2.setName("titu");
		t1.start();
		t2.start();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("In the main method");
	}
}



