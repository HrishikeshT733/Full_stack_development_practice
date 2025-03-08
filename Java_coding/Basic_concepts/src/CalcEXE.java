
public class CalcEXE {
 public static void main(String[] args) {
	Calc cust1,cust2;
	cust1=new Calc();
	cust2=new Calc();
	Calc cust3=new Calc();
	System.out.println("Customer 1:"+cust1.add(50, 60));
	System.out.println("Customer 1:"+cust1.add(50, 60,70));
	System.out.println("Customer 2:"+cust2.add(50, 60,70,80));
	System.out.println("Customer 3:"+cust3.add(50, 60,70,70,60));
}
}
 