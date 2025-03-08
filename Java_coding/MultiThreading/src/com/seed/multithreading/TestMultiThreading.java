package com.seed.multithreading;

class Hello extends Thread{
	public void run()
    {
		for(int i=0;i<3;i++)	
		{
			try{
				Thread.sleep(3000);
//				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
//				notify();
			}
			System.out.println("Hello "
			+Thread.currentThread().getName());
		}	
    }
	
}

class Hii extends Thread{
	
	public void run()
    {
		for(int i=0;i<3;i++)	
		{
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Hii "
			+Thread.currentThread().getName());
		}
}	
}
public class TestMultiThreading {

	public static void main(String[] args) {
		Thread t1=new Hello();
		Thread t2=new Hii();
		t1.setName("HelloThread");
		t2.setName("HiThread");
		t1.setPriority(6);
		System.out.println("t1 priority is "
							+t1.getPriority());
		System.out.println("t2 priority is "
							+t2.getPriority());
		
		t1.start();
		t2.start();	
	}

}
