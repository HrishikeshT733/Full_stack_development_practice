package com.seed.threadcommunication;

class BookSeats
{
int total_seat=10;

	synchronized void bookseat(int seats)
	{
		if(total_seat>=seats)
		{
	System.out.println(seats +" "
					+"seats booked sucessfully");
	
	total_seat=total_seat-seats;
	
	System.out.println("Total seats left ="
						+total_seat);
		}
		else{
	System.out.println("seats can not booked");
	System.out.println("seats left = "+total_seat);
		}
		}	
}


public class BookMyShow extends Thread 
{

	static BookSeats b;
	int seats;
	public void run()
    {
	
		b.bookseat(seats);
    }	
	public static void main(String[] args) 
	{
		 b=new BookSeats();
	BookMyShow t1=new BookMyShow();
	t1.seats=6;
	t1.start();
	
	BookMyShow t2=new BookMyShow();
	t2.seats=4;
	t2.start();
	}
}