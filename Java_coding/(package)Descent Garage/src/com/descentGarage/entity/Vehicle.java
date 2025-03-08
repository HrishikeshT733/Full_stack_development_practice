package com.descentGarage.entity;

import com.descentGarage.services.BillingPrintable;
import com.descentGarage.services.Servicable;

public class Vehicle 
implements Servicable,BillingPrintable{
///it will instantiated in future
	@Override
	public void airService() {
	
		
	}

	@Override
	public void oilingService() {
		System.out.println("Air service is done");
		
	}

	@Override
	public void washingService() {
		System.out.println("Washing service is done");
		
	}

	@Override
	public void PUCService() {
		System.out.println("PUC service is done");
		
	}

	

	@Override
	public void calBill() {
		System.out.println("Bill is calculated");
		
	}
	@Override
	public void printbill(){ //default methods can be overriden in subclasses but we have to change access specifier from default to public
		System.out.println("Total bill is for vehicles");
	}

	



}
