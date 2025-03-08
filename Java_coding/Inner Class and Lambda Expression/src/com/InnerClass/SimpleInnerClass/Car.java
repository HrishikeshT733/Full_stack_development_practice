package com.InnerClass.SimpleInnerClass;

public class Car {
//data members
	private String CarName;
	private int CarID;
	private Double CarPrice;
	
	
	//static block //inner class cannot contain static block
	static{
		System.out.println("Car is mine");
	}
	//static method //innner class cannot contain static method
	public static void show(){
		System.out.println("Car has static method");
	}
	//Constructors
	public Car() {
		super();
	}


	public Car(String carName, int carID, Double carPrice) {
		super();
		CarName = carName;
		CarID = carID;
		CarPrice = carPrice;
	}

  //Accessors and Mutators
	public String getCarName() {
		return CarName;
	}


	public void setCarName(String carName) {
		CarName = carName;
	}


	public int getCarID() {
		return CarID;
	}


	public void setCarID(int carID) {
		CarID = carID;
	}


	public Double getCarPrice() {
		return CarPrice;
	}

	class Engine{
		private String EngineName;
		private int EngineId;
		private String EnginePower;
		//instantiating outer class object in inner class
		Car c=new Car();
		//constructors
		public Engine() {
			super();
		}


		public Engine(String engineName, int engineId, String enginePower) {
			super();
			EngineName = engineName;
			EngineId = engineId;
			EnginePower = enginePower;
		}

         //Accessors and mutators
		public String getEngineName() {
			return EngineName;
		}


		public void setEngineName(String engineName) {
			EngineName = engineName;
		}


		public int getEngineId() {
			return EngineId;
		}


		public void setEngineId(int engineId) {
			EngineId = engineId;
		}


		public String getEnginePower() {
			return EnginePower;
		}


		public void setEnginePower(String enginePower) {
			EnginePower = enginePower;
		}
		
		public void igniteEngine(){
			System.out.println("Engine is Ignited and started");
		}
		public void accessOuterclassmember(){
			System.out.println("Car name is :"+CarName);
		}
		
	}

	public void setCarPrice(Double carPrice) {
		CarPrice = carPrice;
	}
	//methods 
	public void regisCar(){
		System.out.println("Car is Registered");
	}
	public void passingCar(){
		System.out.println("Car got number plate after passing");
	}
	
	
}
