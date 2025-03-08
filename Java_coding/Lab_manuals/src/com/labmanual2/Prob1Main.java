package com.labmanual2;

import java.util.Scanner;

class Prob11 extends Thread{
	public  int num;
	
	
	public Prob11(int num) {
		super();
		this.num = num;
	}
	public Prob11() {
		super();
	}
	
	public void run()
    {
		System.out.print("Thread 1:");
		for(int i=0;i<10;i++)		
		{
			try{
				   System.out.print(num+" ");
				   num=num+1;
			     
				Thread.sleep(3000);
//				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
//				notify();
			}
			
		}	
    }
	
}
class Thread2 extends Thread{
	public  int num;
	
	
	public Thread2(int num) {
		super();
		this.num = num;
	}
	public Thread2() {
		super();
	}
	public void run()
    {
		System.out.println();
		System.out.print("Thread 2:");
		for(int i=1;i<11;i++)	
		{
			try{
			
		    System.out.print((num*i)+" ");
			
			
				Thread.sleep(3000);
//				wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
//				notify();
			}
			
		
    }
}
}
public class Prob1Main {
public static void main(String[] args) {
	System.out.println("Enter two numbers :");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
    Thread t1=new Prob11(a);
	Thread t2=new Thread2(b);
    t1.run();
    t2.run();
}
}
