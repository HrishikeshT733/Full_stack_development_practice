
public class DescetGarageMain {
public static void main(String[] args) {
	BillingPrintable.taxOnBill();//static method call
     
	Vehicle v1,v2;
    v1=new Car();
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
