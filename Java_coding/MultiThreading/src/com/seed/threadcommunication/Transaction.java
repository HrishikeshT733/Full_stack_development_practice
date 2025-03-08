package com.seed.threadcommunication;

public class Transaction extends Thread
{
	Account account;

	Transaction (Account account,String  name){
		super(name);
		this.account=account;
	}
	public void run(){
		int i=0;
		while(i<5){
	try{
if(Thread.currentThread().getName().equals("one")){
	synchronized(account)
		{
		
		withdraw(11000);
		}
	Thread.sleep(1000);
		}
if(Thread.currentThread().getName().equals("two")){
	synchronized(account)
		{
		deposit(5000);
		}
	Thread.sleep(3000);
	}
                
}catch(Exception ie){
	ie.printStackTrace();
	}
			i++;	}
	}
	public void withdraw(int amount){
			int balamt  = account.getBalance();
			System.out.print("Withdrawal :"+amount);
			if(balamt>amount){
			int bal = balamt  - amount;
			account.setBalance(bal);
			}
			else
				System.out.println("   Not Possible");
			balamt  = account.getBalance();
			System.out.print("\t"+balamt);
			System.out.println();
	}
	public void deposit(int amount){
			int balamt= account.getBalance();
			System.out.print("Deposit :\t\t\t"+amount);
			int bal = balamt  + amount;
			account.setBalance(bal);
			balamt=account.getBalance();
			System.out.print("\t"+balamt);
			System.out.println();
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to SBI!");
		int initial=10000;
	System.out.println("Original Balance: " + initial);
	Account account = new Account (initial);
	Thread t1 = new Transaction (account,"one");
	Thread t2 = new Transaction (account,"two");
	t1.start();
	t2.start();
	}
};


