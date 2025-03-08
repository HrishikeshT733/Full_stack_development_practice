package com.LambdaExpression;

import java.util.Scanner;

public class EXE {

	public static void main(String[] args) {
		//Lambda Expression
		MathSolver m=(num)->System.out.println("Cube of number is "+num*num*num);
		m.cube(2);
		m.cube(3);
		//i can also catch m.square(2) return value in int type variable
		System.out.println("Square of two is "+m.square(2));
		
		//Array swap using Lambda expression
		ArraySwap ar=(arr)->{
			int temp;
			temp=arr[0];
			arr[0]=arr[1];
			arr[1]=temp; 
			System.out.println("After swapping array :"+arr[0]+" "+arr[1]);
			
		};
		int[]vrr={1,2};
		System.out.println("Before swapping array :"+vrr[0]+" "+vrr[1]);
		ar.swap(vrr);
		
		Printable.copyright();
		//Lambda Expression
		Printable p=()->{
		System.out.println("Enter your name:  ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Hi welcome to print "+name);
			
		};
		//default method with printable interface
		p.show();
		//abstract method with printable interface
		p.print();

	}

}
