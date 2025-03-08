package com.InnerClass.SimpleInnerClass;

public class ShowRoom {
public static void main(String[] args) {
	Car.show();
	//outer class Reference instantiation
	Car bmw=new Car("BMW XM",123,26000000.00);
	//inner class reference instantiation
	Car.Engine dieselEngine=bmw.new Engine("Diesel Engine",321,"1000cc");
	bmw.regisCar();
	System.out.println("*******************");
	bmw.passingCar();
	System.out.println("*******************");
	dieselEngine.igniteEngine();
	//inner class accessing outer class private member
	dieselEngine.accessOuterclassmember();
	//here 'c' is car object instantiated in inner class Engine ,by doing this we can access members of Car Class which is outer 
	dieselEngine.c.setCarID(202);
	    
}
}
