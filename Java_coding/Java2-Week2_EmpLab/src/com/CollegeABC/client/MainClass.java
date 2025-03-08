package com.CollegeABC.client;
import java.util.Scanner;

import com.CollegeABC.provider.Hosteller;

public class MainClass {
	
	public static void main(String[] args){
		Hosteller s1=new Hosteller();
		System.out.println("Before changing room number of s1 student");
		s1=Hosteller.getHostellerDetails();
		System.out.println(s1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new room number assign to Student s1");
		s1.setRoomNo(sc.nextInt());
		System.out.println("After changing room number of s1 student");
		System.out.println(s1);
		
	}
}
