package com.InnerClass.AnonymousInnerClass;

public interface Drivable {
	
 public void drive();
 public void stop();
 default void showData(){
	 System.out.println("BMW And Ferrari can give implementation");
 }
}
