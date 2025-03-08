package com.InnerClass.AnonymousInnerClass;

public class Client {
public static void main(String[] args) {
	//static method/static block cannot be written in Anonymous innerclass
	//Anonymous inner class 1
	Drivable BMW=new Drivable(){

		@Override
		public void drive() {
		System.out.println("BMW can be driven by you");
			
		}

		@Override
		public void stop() {
			System.out.println("BMW stop");
			
		}
		//default method overriden
		@Override
		public void showData(){
			System.out.println("BMW  can give implementation");
		}
		
	};
BMW.drive();
BMW.stop();

//Anonymous inner class 2
     Drivable Ferrari =new Drivable(){
            
		@Override
		public void drive() {
			System.out.println("Ferrari can be driven by you");
			
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			
		}
		
    	 
     };
     Ferrari.drive();
     Ferrari.showData();
     
   //Anonymous inner class 3
     //Car is abstract class
     Car Tata=new Car(){

		@Override
		public void carDetails() {
			System.out.println("Tata car is best");
			
		}
    	 
     };
     Tata.carDetails();
   
}
}
