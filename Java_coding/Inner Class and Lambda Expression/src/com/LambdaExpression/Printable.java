package com.LambdaExpression;

public interface Printable {
//only one abstract method known as functional interface
	public void print();
	
	//default and static methods
	default void show(){
		System.out.println("Welcome to printable interface");
	}
	static void copyright(){
		System.out.println("OMG things");
		System.out.println("we are having no branches");
	}
	
}
