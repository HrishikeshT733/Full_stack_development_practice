package com.descentGarage.services;

public interface BillingPrintable{
	public final String GST="ABCD352635763Z8";
    public static float pi=3.14f;
public void calBill();
//we can write stati and default method in interface
public static void taxOnBill(){//static method cannot be overriden because it is associated within same class and instance of a class
	System.out.println("Gst on bike is 12% and o car is 18%");
}
default void printbill(){ //default methods can be overriden in subclasses but we have to change access specifier from default to public
	System.out.println("Total bill is");
}

}



