package com.seed.clone;

public class MyDate implements Cloneable {
	
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		// TODO Auto-generated constructor stub
		day = 1;
		month = 1;
		year = 2016;
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year
				+ "]";
	}

	@Override
	public MyDate clone()
	{
		return new MyDate(day, month, year); //super.clone();
	}

}
