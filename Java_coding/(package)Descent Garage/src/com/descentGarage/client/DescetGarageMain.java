package com.descentGarage.client;

import com.descentGarage.entity.CNGCar;
import com.descentGarage.entity.Car;
import com.descentGarage.entity.DieselCar;
import com.descentGarage.entity.Vehicle;
import com.descentGarage.services.BillingPrintable;
//static methods and data members importing
import static com.descentGarage.services.BillingPrintable.pi;
import static com.descentGarage.services.BillingPrintable.taxOnBill;
import static java.lang.System.out;

public class DescetGarageMain {
public static void main(String[] args) {
	
	out.println("Pi value is "+pi);
	
	taxOnBill();//static method call
	Vehicle v1,v2,v4;
    v1=new Car();
    v4=new Vehicle();
    v4.printbill();
	v1.washingService();
	Car v3=new CNGCar();
	v3.washingService();
	v3.milegecar();
	Car c=(Car)v1;//Typecasting
	c.milegecar();//because milege is special method of car class
	
	v2=new DieselCar();
	v2.calBill();
	v1.calBill();
	v1.printbill();//default method is overriden in class vehicle

}




}
